
package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class BaseDatos_Maribel {
    Connection conexion;
    Statement manipularDB;
    
    public BaseDatos_Maribel(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "farmatech";
        String user = "root";
        String password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion exitosa.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a BD:");
            System.out.println(ex.getMessage());
        }
    }
    
    public boolean registrarFarmacia(String NIT, String nombre,String direccion, String estado, String telefono, ImageIcon imagen){
        boolean respuesta = false;
        boolean respuesta2 = false;
        try{
            int resp_consulta2 = 0;
            int resp_consulta3=0;
            java.util.Date fechaHoy = new java.util.Date();
            Long fechaHoraActual = fechaHoy.getTime();
//            java.sql.Date fechaSQL = new java.sql.Date(fechaHoraActual);
//            java.sql.Time horaSQL = new java.sql.Time(fechaHoraActual);
            int i = 0;
            
            Image image = imagen.getImage();
            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = bufferedImage.createGraphics();
            g2.drawImage(image, 0, 0, null);
            g2.dispose();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            byte[] imageBytes = baos.toByteArray();
            Blob imageBlob = conexion.createBlob();
            imageBlob.setBytes(1, imageBytes);
            
            String consulta = "SELECT * FROM farmacia";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            
            
            if (registros.getRow()!= 0) {
                
                do{
                    String id = registros.getString("NIT_farmacia");
                    
                    if(NIT.equals(id) ){
                        i++;
                        break;
                    }
                             
                }while(registros.next());
            }
                
            if(i == 0){
                if(estado.equalsIgnoreCase("activo") || estado.equalsIgnoreCase("inactivo")){

                    String consulta2 = "INSERT INTO farmacia(NIT_farmacia,nombre,direccion,telefono) VALUES('"+NIT+"','"+nombre+"','"+direccion+"','"+telefono+"')";
                    resp_consulta2 =manipularDB.executeUpdate(consulta2);
                    String consulta3 = "INSERT INTO historialestados_farmacia(NIT_farmacia,nombre,fechaHora_cambio,comentario) VALUES('"+NIT+"','"+estado+"','"+fechaHoraActual+"','estado de creacion')";
                    resp_consulta3 =manipularDB.executeUpdate(consulta3); 
                }
            }
            
            
            if(resp_consulta2 == 1 && resp_consulta3 == 1){
                System.out.println("Registro farmacia y estado exitoso!");
                
                String consulta4 = "UPDATE farmacia SET foto = ? WHERE NIT_farmacia = ?";
                PreparedStatement prepared = conexion.prepareStatement(consulta4);
                prepared.setBlob(1, imageBlob);
                prepared.setString(2, NIT);
                respuesta2 = prepared.execute();
                
                if(respuesta2){
                    System.out.println("La imagen se subió con exito");
                }
                
                respuesta=true;
            }else{
                if(resp_consulta2==0){
                    System.out.println("Registro farmacia no se realizó!");
                }else if(resp_consulta3==0){
                    System.out.println("Registro estado no se realizó!");
                }
            }
            return respuesta;
            
        }catch(SQLException ex){
            System.out.println("Error al ejecutar el INSERT: ");
            System.out.println(ex.getMessage());
            return false;    
        } catch (IOException ex) {
            System.out.println("Error en IO en Foto: " + ex.getMessage());
        }
        return respuesta;
    }
    
    public Farmacia buscarFarmacia(String NIT){
        Farmacia encontrado = null;
        
        try {
            String consulta = "SELECT * FROM farmacia WHERE NIT_farmacia = '"+NIT+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                String nombre = registros.getString("nombre");
                String direccion = registros.getString("direccion");
                String telefono = registros.getString("telefono");

                Image foto = null;

                InputStream inputStream = registros.getBinaryStream("foto");
                if (inputStream!=null) {
                    byte[] bytes = new byte[inputStream.available()];
                    inputStream.read(bytes);
                    foto = new ImageIcon(bytes, NIT).getImage();
                }
                
                String consulta2 = "SELECT nombre,comentario FROM historialestados_farmacia WHERE NIT_farmacia = '"+NIT+"' AND fechaHora_cambio = (SELECT MAX(fechaHora_cambio) FROM historialestados_farmacia WHERE NIT_farmacia = '"+NIT+"')";
                
                ResultSet dato = manipularDB.executeQuery(consulta2);
                dato.next();
                if(dato.getRow()==1){
                    String estado = dato.getString("nombre");
                    String comentario = dato.getString("comentario");
                    encontrado = new Farmacia(NIT, nombre, direccion, telefono,estado, foto,comentario);
                }
                  
            }
        }catch (IOException ex) {
            System.out.println("Se presento un error al extraer la foto: "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        }
        
        
        return encontrado;
    }
    
    public Farmacia [] extraerFarmacias(){
        Farmacia arreglo [] = new Farmacia[100];
        try {
            
            String consulta = "SELECT * FROM farmacia ORDER BY NIT_farmacia";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                int i = 0;
                do{
                    String NIT = registros.getString("NIT_farmacia");
                    String nombre = registros.getString("nombre");
                    String direccion = registros.getString("direccion");
                    String telefono = registros.getString("telefono");
                    String comentario = "";
                    
                    Image foto = null;

                    InputStream inputStream = registros.getBinaryStream("foto");
                    
                    if (inputStream!=null) {
                        byte[] bytes = new byte[inputStream.available()];
                        inputStream.read(bytes);
                        foto = new ImageIcon(bytes, NIT).getImage();
                    }
                    
                    
                    String estado="";                   
                    arreglo[i] = new Farmacia(NIT, nombre, direccion, telefono,estado, foto,comentario);
                    
                    i++;
                }while(registros.next());
                
                for(int j = 0; j < arreglo.length && arreglo[j] != null ; j++){
                
                    String consulta2 = "SELECT NIT_farmacia,nombre FROM historialestados_farmacia WHERE NIT_farmacia ='"+ arreglo[j].getNIT() +"' AND fechaHora_cambio = (SELECT MAX(fechaHora_cambio) FROM historialestados_farmacia WHERE NIT_farmacia = '" +arreglo[j].getNIT()+"')";
                    ResultSet dato = manipularDB.executeQuery(consulta2);
                    dato.next();
                    if(dato.getRow()==1){

                        arreglo[j].setEstado(dato.getString("nombre"));
                    }
                }
                
                
                return arreglo;
                
            }else{
                return arreglo;
            }
        } catch (IOException ex) {
            System.out.println("Se presento un error al extraer la foto: "+ex.getMessage());
        }catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        }
        
        return arreglo;
    }
    
    public boolean actualizarFarmacia(String NIT, String nombre,String direccion, String estado, String telefono, ImageIcon imagen, String comentario){
        boolean respuesta = false;

        try{
            
            java.util.Date fechaHoy = new java.util.Date();
            Long fechaHoraActual = fechaHoy.getTime();

            
            Image image = imagen.getImage(); 
            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);
            Graphics2D g2 = bufferedImage.createGraphics();
            g2.drawImage(image, 0, 0, null);
            g2.dispose();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            byte[] imageBytes = baos.toByteArray();
            Blob imageBlob = conexion.createBlob();
            imageBlob.setBytes(1, imageBytes);

            String consulta = "UPDATE farmacia SET foto = ?, nombre = ?, direccion = ?, telefono = ? WHERE NIT_farmacia = ?";
            PreparedStatement prepared = conexion.prepareStatement(consulta);
            prepared.setBlob(1, imageBlob);
            prepared.setString(2, nombre);
            prepared.setString(3, direccion);
            prepared.setString(4, telefono);
            prepared.setString(5, NIT);
            prepared.execute();
            
            respuesta=true;
           
            String consulta2 = "SELECT nombre FROM historialestados_farmacia WHERE NIT_farmacia ='"+NIT+"' AND fechaHora_cambio = (SELECT MAX(fechaHora_cambio) FROM historialestados_farmacia)";
            ResultSet dato = manipularDB.executeQuery(consulta2);
            dato.next();
            if(dato.getRow()==1){
                if(!dato.getString("nombre").equalsIgnoreCase(estado)){
                    String consulta3 = "INSERT INTO historialestados_farmacia(NIT_farmacia,nombre,fechaHora_cambio,comentario) VALUES('"+NIT+"','"+estado+"','"+fechaHoraActual+"','"+comentario+"')";
                    manipularDB.executeUpdate(consulta3);
                }
            }
           
            return respuesta;
            
        }catch(SQLException ex){
            System.out.println("Error al ejecutar el UPDATE: ");
            System.out.println(ex.getMessage());   
        } catch (IOException ex) {
            System.out.println("Error en IO en Foto: " + ex.getMessage());
        }
        return respuesta;
    }
    
    public boolean actualizarFarmacia(String NIT, String nombre,String direccion, String estado, String telefono, String comentario){
        boolean respuesta = false;
        int respuesta2=0;

        try{          
     
//            java.util.Date fechaHoy = new java.util.Date();
//            Long fechaHoraActual = fechaHoy.getTime();

            java.util.Date dt = new java.util.Date();
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                "yyyy-MM-dd HH:mm:ss");

            String fechaHora = sdf.format(dt);
            
            
            String consulta = "UPDATE farmacia SET nombre ='"+ nombre +"',direccion = '"+ direccion +"', telefono = '"+ telefono +"' WHERE NIT_farmacia ='"+ NIT +"'";
            respuesta2 = manipularDB.executeUpdate(consulta);                       
            
            if(respuesta2 == 1){
                respuesta = true;
            }
            
            String consulta2 = "SELECT nombre FROM historialestados_farmacia WHERE NIT_farmacia ='"+NIT+"' AND fechaHora_cambio = (SELECT MAX(fechaHora_cambio) FROM historialestados_farmacia)";
            ResultSet dato = manipularDB.executeQuery(consulta2);
            dato.next();
            if(dato.getRow()==1){
                if(!dato.getString("nombre").equalsIgnoreCase(estado)){
                    String consulta3 = "INSERT INTO historialestados_farmacia(NIT_farmacia,nombre,fechaHora_cambio,comentario) VALUES('"+NIT+"','"+estado+"','"+ fechaHora+"','"+comentario+"')";
                    manipularDB.executeUpdate(consulta3);
                }
            }
           
            return respuesta;
            
        }catch(SQLException ex){
            System.out.println("Error al ejecutar el UPDATE: ");
            System.out.println(ex.getMessage());
               
        }
        return respuesta;
    }
    
    public boolean eliminarFarmacia(String NIT){
        boolean respuesta = false;
        int respuesta2=0;
        String modulos [] = {"historialestados_farmacia","stock","factura","usuarioFarmacia","farmacia"};
        String referencias []= new String[100];
        
        try{
            
            String consulta = "SELECT numReferencia FROM factura WHERE NIT_farmacia = '"+NIT+"' ORDER BY numReferencia";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if(registros.getRow()==1){
                int i = 0;
                do{ 
                        referencias [i] = registros.getString("numReferencia");
                i++;
                }while(registros.next());
            }
            
            for(int i = 0; i < referencias.length && referencias[i] != null; i++){
                
                String consulta2 = "DELETE FROM facturaProducto WHERE numReferencia ='"+referencias[i]+"'";
                manipularDB.executeUpdate(consulta2);
            }
            
            for (String modulo : modulos) {
                String consulta3 = "DELETE FROM " + modulo + " WHERE NIT_farmacia ='" + NIT + "'";
                respuesta2 = manipularDB.executeUpdate(consulta3);
            }
                     
            if(respuesta2 == 1){
                respuesta = true;    
            }
            
            return respuesta;
            
        }catch(SQLException ex){
            System.out.println("Error al ejecutar el ELIMINAR: ");
            System.out.println(ex.getMessage());
               
        }
        return respuesta;

    }
    
    public Stock [] extraerInventario(String NIT){
        Stock arreglo [] = new Stock[100];
        try {
            
            String consulta = "SELECT * FROM stock WHERE NIT_farmacia = '"+NIT+"' ORDER BY id_stock ASC";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            
            if (registros.getRow()==1) {
                int i = 0;
                do{
                    
                    String id_producto = registros.getString("id_producto");
                    String cantEntrante = registros.getString("cant_entrante");
                    String cantRestante = registros.getString("cant_restante");
                    
                    String items = cantRestante + " / " + cantEntrante;
                    String nombre = "";
                
                    arreglo[i] = new Stock(id_producto,nombre,items);
                    i++;
                }while(registros.next());
                
                String consulta2 = "SELECT * FROM producto JOIN stock ON(producto.id_producto = stock.id_producto) WHERE NIT_farmacia = '"+NIT+"' ORDER BY id_stock ASC";
                ResultSet dato = manipularDB.executeQuery(consulta2);
                dato.next();
                
                if(dato.getRow()==1){
                    i=0;
                    do{
                       
                        arreglo[i].setNombre(dato.getString("nombre_producto"));

                        i++;
                    }while(dato.next());
                }
                
                return arreglo;
            }else{
                return arreglo;
            }
        }catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        }
        return arreglo;
    }

    public Factura [] extraerFacturas(String NIT){
        Factura arreglo [] = new Factura[100];
        try {
            
            String consulta = "SELECT * FROM factura WHERE NIT_farmacia = '"+NIT+"' ORDER BY numReferencia ASC";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            
            if (registros.getRow()==1) {
                int i = 0;
                do{
                    
                    String numReferencia = registros.getString("numReferencia");
                    String fecha = registros.getString("fecha");
                    String id_cliente = registros.getString("id_cliente");                
                    String total= registros.getString("total");
                
                    arreglo[i] = new Factura(numReferencia,fecha,id_cliente,total);
                    i++;
                }while(registros.next());
                
                return arreglo;
            }else{
                return arreglo;
            }
        }catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        }
        return arreglo;
    }

    public FacturaProductos [] extraerProductosFactura(String numReferencia){
        FacturaProductos arreglo [] = new FacturaProductos[100];
        try {
            
            String consulta = "SELECT * FROM facturaProducto WHERE numReferencia = '"+numReferencia+"' ORDER BY id_facturaProducto ASC";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            
            
            if (registros.getRow()==1) {
                int i = 0;
                int valor_total = 0;
                String total = "";
                do{
                    String idProducto = registros.getString("id_producto");
                    String producto = "";
                    String precio = "";
                    String cantidad= registros.getString("cantidad");          
                    String suma_total= registros.getString("suma_total");
                    valor_total += Integer.parseInt(suma_total);
                    
                    arreglo[i] = new FacturaProductos(idProducto,producto,precio,cantidad,suma_total,total);
                    i++;
                }while(registros.next());
                total= ""+valor_total;
                
                String consulta2 = "SELECT * FROM producto JOIN facturaProducto ON(producto.id_producto = facturaProducto.id_producto) WHERE numReferencia = '"+numReferencia+"' ORDER BY id_facturaProducto ASC";
                ResultSet dato = manipularDB.executeQuery(consulta2);
                dato.next();
                
                if(dato.getRow()==1){
                    i=0;
                    
                    do{
                        
                        arreglo[i].setProducto(dato.getString("nombre_producto"));
                        arreglo[i].setPrecioUnitario(dato.getString("precio_unitario"));
                        arreglo[i].setTotal(total);

                        i++;
                    }while(dato.next());
                    
                    return arreglo;
                }else{
                    return null;
                }
                
                
            }else{
                return arreglo;
            }
        }catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        }
        return arreglo;
    }
}