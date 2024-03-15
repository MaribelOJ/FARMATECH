
package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatos {
    Connection conexion;
    Statement manipularDB;
    
    public BaseDatos(){
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
    
    public Usuario iniciarSesion(String credencial1, String credencial2){
        Usuario user;
        
        String usuario = credencial1;
        String clave = credencial2;
        
        System.out.println(usuario);
        System.out.println(clave);
        
         try {
            String consulta = "SELECT * FROM usuario WHERE usuario = '"+usuario+"' AND clave ='"+getMD5(clave)+"' AND estado ='activo'";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                    String id_usuario = registros.getString("id_usuario");
                    String documento = registros.getString("cedula");
                    String nombres= registros.getString("nombre_usuario");                
                    String rol = registros.getString("rol");
                    String estado = registros.getString("estado");
                    String fechaInicio = registros.getString("fecha_inicio");
                    
                    user = new Usuario(id_usuario,documento, nombres,usuario, rol, estado, fechaInicio);
                return user;
            }else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
         
    }
    
    public String getMD5(String clave){
        try {
          // Obtener una instancia del algoritmo MD5
            MessageDigest md = MessageDigest.getInstance("MD5");

          // Convertir el String a bytes
          byte[] messageDigest = md.digest(clave.getBytes());

          // Convertir los bytes a un String hexadecimal
            BigInteger number = new BigInteger(1, messageDigest);
          String hashtext = number.toString(16);

          // Añadir ceros a la izquierda si es necesario
          while (hashtext.length() < 32) {
            hashtext = "0" + hashtext;
          }

          // Devolver el hash MD5
          return hashtext;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
