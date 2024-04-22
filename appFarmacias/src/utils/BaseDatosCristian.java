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
    public HistorialVentas[] obtenerHistorialVentas() {
    try {
        HistorialVentas[] arreglo = new HistorialVentas[100];
        String consulta = "SELECT factura.numReferencia, producto.nombre_producto, factura.fecha, factura.id_cliente, factura.nombre_cliente, factura.total"  
                    +"FROM factura INNER JOIN facturaproducto ON factura.numReferencia = facturaproducto.numReferencia"
                    +"INNER JOIN producto ON facturaproducto.id_producto = producto.id_producto ";
        
        ResultSet registros = manipularDB.executeQuery(consulta);
        int i = 0;
        if(registros.getRow() == 1){
         while (registros.next()) {
            String numReferencia = registros.getString("numReferencia");
            String nombre_producto = registros.getString("nombre_producto");
            String fecha = registros.getString("fecha");
            String id_cliente = registros.getString("id_cliente");
            String nombre_cliente = registros.getString("nombre_cliente");
            String total = registros.getString("total");

            arreglo[i] = new HistorialVentas(numReferencia, nombre_producto, fecha, id_cliente, nombre_cliente, total);
            i++;
            System.out.println(" "+arreglo[i]);
        }   
        }
        return arreglo;
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar la consulta: " + ex.getMessage());
            return new HistorialVentas[0];
        }
    }
    public Producto buscarProducto(String id_producto){
        Producto ubicado = null;
        
        try {
            String consulta = "SELECT * FROM producto WHERE id_producto= id_producto";
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
                    
                   arreglo [i] = new ProductosCristian(id_producto, nombre_producto, volumen, precio_unitario, fecha_vencimiento, ingredientes, usos, usos);
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
}
