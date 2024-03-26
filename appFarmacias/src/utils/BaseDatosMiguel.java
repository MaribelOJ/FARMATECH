package utils;



import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;
import principal.Alerta;

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
    
    public List<String> cargarNombresFarmacias() {
        List<String> nombresFarmacias = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/farmatech", "root", "")) {
            String sql = "SELECT DISTINCT nombre FROM farmacia"; // Utilizar DISTINCT
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String nombreFarmacia = resultSet.getString("nombre");
                        nombresFarmacias.add(nombreFarmacia);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombresFarmacias;
    }
    
    public List<String> cargarDireccionesFarmacias(String nombreFarmacia) {
        List<String> direccionesFarmacias = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/farmatech", "root", "")) {
            String sql = "SELECT direccion FROM farmacia WHERE nombre = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nombreFarmacia);
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String direccionFarmacia = resultSet.getString("direccion");
                        direccionesFarmacias.add(direccionFarmacia);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return direccionesFarmacias;
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
    
    public boolean agregarEncargado(String cedula, String nombre, String usuario, String clave, String establecimiento, String direccion, Date fechaInicio) {
        try {
            // Verificar si ya existe un usuario con la misma cédula
            String selectUsuarioQuery = "SELECT COUNT(*) FROM usuario WHERE cedula = ?";
            try (PreparedStatement selectUsuarioStatement = conexion.prepareStatement(selectUsuarioQuery)) {
                selectUsuarioStatement.setString(1, cedula);
                try (ResultSet resultSet = selectUsuarioStatement.executeQuery()) {
                    resultSet.next();
                    int count = resultSet.getInt(1);
                    if (count > 0) {
                        // Ya existe un usuario con la misma cédula, retornar false
                        System.out.println("Ya existe un usuario con este documento.");
                        return false;
                    }
                }
            }

            // Insertar el nuevo encargado en la tabla de usuarios
            String insertUsuarioQuery = "INSERT INTO usuario (cedula, nombre_usuario, usuario, clave, rol, estado, fecha_inicio) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertUsuarioStatement = conexion.prepareStatement(insertUsuarioQuery, Statement.RETURN_GENERATED_KEYS);
            insertUsuarioStatement.setString(1, cedula);
            insertUsuarioStatement.setString(2, nombre);
            insertUsuarioStatement.setString(3, usuario);
            insertUsuarioStatement.setString(4, getMD5(clave));
            insertUsuarioStatement.setString(5, "encargado");
            insertUsuarioStatement.setString(6, "activo");
            insertUsuarioStatement.setDate(7, new java.sql.Date(fechaInicio.getTime())); // Convertir java.util.Date a java.sql.Date
            insertUsuarioStatement.executeUpdate();

            // Obtener el ID del nuevo encargado insertado
            int userId = -1;
            ResultSet generatedKeys = insertUsuarioStatement.getGeneratedKeys();
            if (generatedKeys.next()) {
                userId = generatedKeys.getInt(1);
            } else {
                throw new SQLException("No se pudo obtener el ID del nuevo encargado.");
            }

            // Obtener el ID de la farmacia
            int farmaciaId = -1;
            String selectFarmaciaIdQuery = "SELECT NIT_farmacia FROM farmacia WHERE nombre = ? AND direccion = ?";
            try (PreparedStatement selectFarmaciaIdStatement = conexion.prepareStatement(selectFarmaciaIdQuery)) {
                selectFarmaciaIdStatement.setString(1, establecimiento);
                selectFarmaciaIdStatement.setString(2, direccion);
                try (ResultSet farmaciaIdResult = selectFarmaciaIdStatement.executeQuery()) {
                    if (farmaciaIdResult.next()) {
                        farmaciaId = farmaciaIdResult.getInt("NIT_farmacia");
                    } else {
                        throw new SQLException("No se encontró la farmacia.");
                    }
                }
            }

            // Asignar el encargado a la farmacia en la tabla usuariofarmacia
            if (userId != -1 && farmaciaId != -1) {
                String insertUsuarioFarmaciaQuery = "INSERT INTO usuariofarmacia (id_usuario, NIT_farmacia) VALUES (?, ?)";
                try (PreparedStatement insertUsuarioFarmaciaStatement = conexion.prepareStatement(insertUsuarioFarmaciaQuery)) {
                    insertUsuarioFarmaciaStatement.setInt(1, userId);
                    insertUsuarioFarmaciaStatement.setInt(2, farmaciaId);
                    insertUsuarioFarmaciaStatement.executeUpdate();
                }
            } else {
                // Manejar el caso en el que no se pudo obtener el ID del usuario o de la farmacia
                throw new SQLException("No se pudo obtener el ID del usuario o de la farmacia.");
            }

            System.out.println("Encargado agregado correctamente.");
            return true; // La inserción fue exitosa

        } catch (SQLException ex) {
            System.out.println("Error al agregar el encargado:");
            System.out.println(ex.getMessage());
            return false; // La inserción falló
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
     
     
    public Connection getConexion() {
        return conexion;
    }

    public Statement getManipularBD() {
        return manipularBD;
        
    }
    
}
