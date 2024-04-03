package utils;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatosMiguel {
    Connection conexion;
    Statement manipularBD;
    
    public BaseDatosMiguel(){
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "farmatech";
        String user = "root";
        String password = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+databasename;
        
        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularBD = conexion.createStatement();
            System.out.println("Conexion exitosa miguel.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a BD:");
            System.out.println(ex.getMessage());
        }
    }
    
    
    public Usuario[] listaEncargados(){
       
       try {
           Usuario arreglo[] = new Usuario[100];
            String consulta = "SELECT usuario.cedula, usuario.nombre_usuario, usuario.usuario, usuario.clave, farmacia.nombre, usuario.estado, usuario.fecha_inicio, usuario.fecha_termino"
                    + " FROM usuario"
                    + " INNER JOIN usuariofarmacia ON usuario.id_usuario = usuariofarmacia.id_usuario"
                    + " INNER JOIN farmacia ON usuariofarmacia.NIT_farmacia = farmacia.NIT_farmacia"
                    + " WHERE usuario.rol = 'encargado' AND usuario.estado = 'activo'";
            ResultSet  registros = manipularBD.executeQuery(consulta) ;
            registros.next();
            if(registros.getRow() == 1){
                int i = 0;
                do{
                    
                    String cedula = registros.getString("cedula");
                    String nombre = registros.getString("nombre_usuario");
                    String usuario = registros.getString("usuario");
                    String contraseña = registros.getString("clave");
                    String establecimiento = registros.getString("nombre");
                    String estado = registros.getString("estado");
                    String fecha_inicio = registros.getString("fecha_inicio");
                    String fecha_fin = registros.getString("fecha_termino");
                    
                    arreglo[i] = new Usuario(cedula,nombre,usuario,contraseña,establecimiento,estado,fecha_inicio,fecha_fin);
                    i++;
                    
                }while(registros.next());
                return arreglo;
            }else{
                return arreglo;
            }
       } catch (Exception e) {
           System.out.println("Error al imprimir el SELECT");
           System.out.println(e.getMessage());
           return null;
       }
      
   }
    public Connection getConexion() {
        return conexion;
    }

    public Statement getManipularBD() {
        return manipularBD;
        
    }
    
}
