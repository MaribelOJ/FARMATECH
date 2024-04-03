
package utils;

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
                    
                    user = new Usuario(id_usuario,documento, nombres,usuario, rol);
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
    public ListaProveedor[] extraerProveedor(){
        try {
            ListaProveedor arreglo [] = new ListaProveedor[100];
            String consulta = "SELECT * FROM proveedor";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                int i = 0;
                do{
                    String NIT = registros.getString("NIT_proveedor");
                    String nombre = registros.getString("nombre_proveedor");
                    String direccion = registros.getString("direccion");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("correo");
                    String persona_contacto = registros.getString("persona_contacto");
                    String estado = registros.getString("estado");
                    
                    arreglo[i] = new ListaProveedor(NIT, nombre,direccion, telefono,correo, persona_contacto, null);
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
       public Usuario buscarUsuario(String NIT){
        try {
            Usuario encontrado = null;
            
            String consulta = "SELECT * FROM personas WHERE NIT = '"+NIT+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                String documento = registros.getString("cedula");
                String nombres = registros.getString("nombres");
                String estado = registros.getString("");
                String telefono = registros.getString("telefono");
                String correo = registros.getString("email");
                
                encontrado = new Usuario(documento, nombres, estado, telefono, correo);
                return encontrado;
            }else{
                return encontrado;
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
    public void imprimirProveedor(){
        ResultSet registros = null;
	try {
	    String consulta = "SELECT * FROM proveedor";
	    registros = manipularDB.executeQuery(consulta);
	    registros.next();
	    if(registros.getRow()==1){
	        do{
	            System.out.println(registros.getRow()+" => "+registros.getString("NIT_proveedor")+registros.getString("nombre_proveedor")+registros.getString("direccion")+registros.getString("telefono")+registros.getString("correo")+registros.getString("persona_contacto")+registros.getString("estado"));
	        }while(registros.next());
	    }else{
	        System.out.println("No se encuentran clientes registrados.");
	    }
	} catch (SQLException ex) {
	    System.out.println("Error al buscar el cliente: "+ex.getMessage());
	}   
    }
    public ListaProveedor buscarProveedor(String NIT){
        try {
            ListaProveedor encontrado = null;
            
            String consulta = "SELECT * FROM proveedor WHERE NIT_proveedor = '"+NIT+"' ";
            ResultSet registros = manipularDB.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                String NIT_proveedor = registros.getString("NIT_proveedor");
                String nombre_proveedor = registros.getString("nombre_proveedor");
                String direccion = registros.getString("direccion");
                String telefono = registros.getString("telefono");
                String correo = registros.getString("correo");
                String persona_contacto = registros.getString("persona_contacto");
                String estado = registros.getString("estado");
                
                encontrado = new ListaProveedor(NIT_proveedor, nombre_proveedor, direccion, telefono, correo, persona_contacto,estado);
                return encontrado;
            }else{
                return encontrado;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public boolean insertarProducto(String id_producto, String nombre, String volumen, String precio, String fecha, String ingrediente, String usos) {
        boolean respuesta = false;
        try{
            String consulta = "INSERT INTO producto (id_producto, nombre_producto, medicamentos, volumen, precio_unitario, fecha_vencimiento, ingredientes, usos) VALUES ('" + id_producto + "','" + nombre + "','" + volumen + "','" + precio + "', STR_TO_DATE('" + fecha + "', '%d-%m-%Y'),'" + ingrediente + "','" + usos + "')";

            int resp_consulta = manipularDB.executeUpdate(consulta);
            if(resp_consulta == 1){
                respuesta = true;
            }
        } catch(SQLException ex){
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
        }else{
            System.out.println("No se pudo insertar");
        }
        return respuesta;
            
    }
    
    public static Connection connection(String url) throws SQLException {
        Connection conn = null;
        try {
            // Cargar el controlador JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establecer la conexión con la base de datos
            conn = DriverManager.getConnection(url);
        } catch (ClassNotFoundException | SQLException e) {
            // Manejar errores de conexión
            e.printStackTrace();
            throw new SQLException("Error al conectar a la base de datos: " + e.getMessage());
        }
        return conn;
    }
    String url = "jdbc:mysql://localhost:3306/farmatech";
    
    public static void conectarBaseDatos() {
        String url = "jdbc:mysql://localhost:3306/farmatech";
        try {
            Connection conexion = BaseDatos.connection(url);
            // Realizar operaciones con la conexión...
            // Por ejemplo:
            Statement stmt = conexion.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM tabla");
        } catch (SQLException ex) {
            ex.printStackTrace(); // Imprimir la traza de la excepción
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

  
}
   
