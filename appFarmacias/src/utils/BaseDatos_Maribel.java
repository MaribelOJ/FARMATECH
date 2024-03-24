
package utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
    
     public boolean registrarFarmacia(String NIT, String nombre,String direccion, String estado, String telefono){
        boolean respuesta = false;
        try{
            int resp_consulta2 = 0;
            int resp_consulta3=0;
            java.util.Date fechaHoy = new java.util.Date();
            java.sql.Date fechaSQL = new java.sql.Date(fechaHoy.getTime());
            int i = 0;
            
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

                    String consulta2 = "INSERT INTO farmacia VALUES('"+NIT+"','"+nombre+"','"+direccion+"','"+telefono+"')";
                    resp_consulta2 =manipularDB.executeUpdate(consulta2);
                    String consulta3 = "INSERT INTO historialestados_farmacia(NIT_farmacia,nombre,fecha_cambio,comentario) VALUES('"+NIT+"','"+estado+"','"+fechaSQL+"','estado de creacion')";
                    resp_consulta3 =manipularDB.executeUpdate(consulta3); 
                }
            }
            
            
            if(resp_consulta2 == 1 && resp_consulta3 == 1){
                System.out.println("Registro farmacia y estado exitoso!");
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
        }
        
        
    }
}