package utils;

import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import utils.ProductosCristian;
import utils.Producto;

public class BaseDatosCristian {
    Connection conexion;
    Statement manipularDB;
    public HistorialVentas[] obtenerHistorialVentas;
    
    public BaseDatosCristian(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "farmatech";
        String user = "root";
        String password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion exitosa Cj.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a BD:");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public HistorialVentas[] obtenerHistorialVentas(String NIT) {
        try {
            HistorialVentas[] arreglo = new HistorialVentas[100];
            String consulta = "SELECT numReferencia, fecha, id_cliente, nombre_cliente, total \n" +
                           "FROM factura WHERE NIT_farmacia = '"+NIT+"'";
        
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            int i = 0;
            if(registros.getRow() == 1){
                 do{ 
                    String numReferencia = registros.getString("numReferencia");
                    String fecha = registros.getString("fecha");
                    String id_cliente = registros.getString("id_cliente");
                    String nombre_cliente = registros.getString("nombre_cliente");
                    String total = registros.getString("total");

                   arreglo[i] = new HistorialVentas(numReferencia, fecha, id_cliente, nombre_cliente, total);
                   i++;
                }while((registros.next()));   
                 return arreglo;
            }else{
                return arreglo;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta: " + ex.getMessage());
            return new HistorialVentas[0];
        }
    }
    
    
    public Producto buscarProducto(String id_producto){
        Producto ubicado = null;
        
        try {
            String consulta = "SELECT producto.nombre_producto, producto.precio_unitario, facturaproducto.cantidad,facturaproducto.sumatotal FROM producto INNER JOIN ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            
            if(registros.getRow()==1){
                id_producto = registros.getString("id_producto");
                String nombre_producto = registros.getString("nombre_producto");
                String volumen = registros.getString("volumen");
                String precio_unitario = registros.getString("precio_unitario");
                String fecha_vencimiento = registros.getString("fecha_vencimiento");
                String ingredientes = registros.getString("ingredientes");
                String usos = registros.getString("usos");
                Image medicamento = null;
                
                InputStream inputStream = registros.getBinaryStream("medicamento");
                if (inputStream!=null) {
                    byte[] bytes = new byte[inputStream.available()];
                    inputStream.read(bytes);
                    medicamento = new ImageIcon(bytes, id_producto).getImage();
                }
                String consulta_2= "SELECT cant_restante FROM stock WHERE id_producto = '"+id_producto+"'";
                ResultSet stock = manipularDB.executeQuery(consulta_2);
                if(stock.getRow() == 1){
                    String dato = stock.getString("cant_restante");
                }
            }
        } catch (IOException ex) {
            System.out.println("Se presento un error en foto: "+ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        }
        
        return ubicado;
        
    }
    
    public ProductosCristian[] extraerProducto() throws IOException{
        ProductosCristian arreglo [] = new ProductosCristian[100];
        try {
            
            String consulta = "SELECT * FROM producto ORDER BY id_producto ASC";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                int i = 0;
                do{
                    String id_producto = registros.getString("id_producto");
                    String nombre_producto = registros.getString("nombre_producto");
                    Image medicamento = null;
                    String volumen = registros.getString("volumen");
                    String precio_unitario = registros.getString("precio_unitario");
                    String fecha_vencimiento = registros.getString("fecha_vencimiento");
                    String ingredientes = registros.getString("ingredientes");
                    String usos =registros.getString("usos");
                    
                    InputStream inputStream = registros.getBinaryStream("medicamento");
                    
                    if (inputStream!=null) {
                        byte[] bytes = new byte[inputStream.available()];
                        inputStream.read(bytes);
                        medicamento = new ImageIcon(bytes, id_producto).getImage();
                    }
                    
                   arreglo [i] = new ProductosCristian(id_producto, nombre_producto, volumen, precio_unitario);
                   i++;
                }while(registros.next());
                    return arreglo;
            }else{
                return arreglo;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
    }  
    public FacturaProductosCristian [] Detalle(String numReferencia){
        FacturaProductosCristian lista[] = new FacturaProductosCristian[100];
        
        try {
            String consulta1 = "SELECT producto.nombre_producto, producto.precio_unitario, facturaproducto.cantidad,factura.sub_total, factura.iva, factura.total FROM producto INNER JOIN facturaproducto ON producto.id_producto = facturaproducto.id_producto" 
                               + " INNER JOIN factura ON facturaproducto.numReferencia = factura.numreferencia WHERE factura.numReferencia = '"+ numReferencia+"'";
            ResultSet registros = manipularDB.executeQuery(consulta1);
            registros.next();
            
            if(registros.getRow()==1){
                int i= 0;
                do{ 
                    
                    String nombre_producto = registros.getString("nombre_producto");
                    String precio_unitario = registros.getString("precio_unitario");
                    String cantidad = registros.getString("cantidad");
                    String sub_total = registros.getString("sub_total");
                    String iva = registros.getString("iva");
                    String total = registros.getString("total");
                    
                    
                    lista[i] = new FacturaProductosCristian ( nombre_producto, precio_unitario, cantidad, total, iva, sub_total);
                    
                   i++;
                }while(registros.next());      
            }

            return lista;
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
        }
        
        return lista;
        
    }
    
}
