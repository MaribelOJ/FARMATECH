package utils;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
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
    
    public void desasignarEncargadoFarmacia(String cedula) {
        try {
            // Obtener la fecha actual
            java.util.Date fechaActual = new java.util.Date();

            // Actualizar el estado del encargado a inactivo en todas sus asignaciones activas
            String updateEstado = "UPDATE usuarioFarmacia SET estado = 'inactivo', fecha_termino = ? " +
                                  "WHERE id_usuario IN (SELECT id_usuario FROM usuario WHERE cedula = ?) " +
                                  "AND estado = 'activo'";
            PreparedStatement statementEstado = conexion.prepareStatement(updateEstado);
            statementEstado.setDate(1, new java.sql.Date(fechaActual.getTime()));
            statementEstado.setString(2, cedula);
            statementEstado.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Método para obtener el nombre de la última farmacia asignada al encargado
    
    public String obtenerNombreFarmaciaAsignada(String cedula) {
        String nombreFarmacia = null;
        try {
            String consulta = "SELECT farmacia.nombre " +
                              "FROM farmacia " +
                              "INNER JOIN usuarioFarmacia ON farmacia.NIT_farmacia = usuarioFarmacia.NIT_farmacia " +
                              "INNER JOIN usuario ON usuario.id_usuario = usuarioFarmacia.id_usuario " +
                              "WHERE usuario.cedula = ? " +
                              "AND usuarioFarmacia.estado = 'activo' " +
                              "ORDER BY usuarioFarmacia.fecha_inicio DESC, usuarioFarmacia.id_usuarioFarmacia DESC " +
                              "LIMIT 1";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, cedula);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                nombreFarmacia = resultado.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombreFarmacia;
    }

    // Método para obtener la dirección de la última farmacia asignada al encargado
    public String obtenerDireccionFarmaciaAsignada(String cedula) {
        String direccionFarmacia = null;
        try {
            String consulta = "SELECT farmacia.direccion " +
                              "FROM farmacia " +
                              "INNER JOIN usuarioFarmacia ON farmacia.NIT_farmacia = usuarioFarmacia.NIT_farmacia " +
                              "INNER JOIN usuario ON usuario.id_usuario = usuarioFarmacia.id_usuario " +
                              "WHERE usuario.cedula = ? " +
                              "AND usuarioFarmacia.estado = 'activo' " +
                              "ORDER BY usuarioFarmacia.fecha_inicio DESC, usuarioFarmacia.id_usuarioFarmacia DESC " +
                              "LIMIT 1";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, cedula);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                direccionFarmacia = resultado.getString(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return direccionFarmacia;
    }

    // Método para verificar si el encargado tiene asignaciones activas
    public boolean encargadoTieneAsignacionesActivas(String cedula) {
        try {
            String consulta = "SELECT COUNT(*) " +
                              "FROM usuarioFarmacia " +
                              "INNER JOIN usuario ON usuario.id_usuario = usuarioFarmacia.id_usuario " +
                              "WHERE usuario.cedula = ? " +
                              "AND usuarioFarmacia.estado = 'activo'";
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, cedula);
            ResultSet resultado = statement.executeQuery();
            if (resultado.next()) {
                int count = resultado.getInt(1);
                return count > 0;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
    
    public boolean asignarEncargadoFarmacia(String cedula, String nombreFarmacia, String direccionFarmacia, String estado, java.util.Date fechaInicio) {
        try {
            // Obtener el id del usuario usando la cedula
            int idUsuario = obtenerIdUsuario(cedula);

            // Obtener el NIT de la farmacia usando el nombre y la dirección
            String nitFarmacia = obtenerNitFarmacia(nombreFarmacia, direccionFarmacia);

            // Obtener la fecha actual como un objeto java.sql.Date
            java.sql.Date fechaInicioSQL = new java.sql.Date(fechaInicio.getTime());

            // Realizar la inserción en la tabla usuariofarmacia
            String consulta = "INSERT INTO usuariofarmacia (id_usuario, NIT_farmacia, estado, fecha_inicio) VALUES (?, ?, ?, ?)";
            PreparedStatement pstmt = conexion.prepareStatement(consulta); // Acceso a la conexión existente
            pstmt.setInt(1, idUsuario);
            pstmt.setString(2, nitFarmacia);
            pstmt.setString(3, estado);
            pstmt.setDate(4, fechaInicioSQL);

            int filasInsertadas = pstmt.executeUpdate();
            pstmt.close();

            return filasInsertadas > 0;
        } catch (SQLException e) {
            System.out.println("Error al asignar encargado a farmacia: " + e.getMessage());
            return false;
        }
    }

    public int obtenerIdUsuario(String cedula) {
        int idUsuario = -1; // Valor por defecto en caso de error
        try {
            String consulta = "SELECT id_usuario FROM usuario WHERE cedula = ?";
            PreparedStatement pstmt = conexion.prepareStatement(consulta); // Acceso a la conexión existente
            pstmt.setString(1, cedula);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                idUsuario = rs.getInt("id_usuario");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener ID de usuario: " + e.getMessage());
        }
        return idUsuario;
    }

    public String obtenerNitFarmacia(String nombreFarmacia, String direccionFarmacia) {
        String nitFarmacia = null; // Valor por defecto en caso de error
        try {
            String consulta = "SELECT NIT_farmacia FROM farmacia WHERE nombre = ? AND direccion = ?";
            PreparedStatement pstmt = conexion.prepareStatement(consulta); // Acceso a la conexión existente
            pstmt.setString(1, nombreFarmacia);
            pstmt.setString(2, direccionFarmacia);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                nitFarmacia = rs.getString("NIT_farmacia");
            }
            rs.close();
            pstmt.close();
        } catch (SQLException e) {
            System.out.println("Error al obtener NIT de farmacia: " + e.getMessage());
        }
        return nitFarmacia;
    }

    public String infoPersona(String cedula) {
        String nombre;
        try {
            String consulta = "SELECT nombre_usuario FROM usuario WHERE cedula = '" + cedula + "'";
            ResultSet registros = manipularBD.executeQuery(consulta);
            if (registros.next()) {
                nombre = registros.getString("nombre_usuario");
                return nombre;
            } else {
                System.out.println("No se encontraron registros para la cédula: " + cedula);
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            return null;
        }
    }
    
    public String userPersona(String cedula) {
        String usuario;
        try {
            String consulta = "SELECT usuario FROM usuario WHERE cedula = '" + cedula + "'";
            ResultSet registros = manipularBD.executeQuery(consulta);
            if (registros.next()) {
                usuario = registros.getString("usuario");
                return usuario;
            } else {
                System.out.println("No se encontraron registros para la cédula: " + cedula);
                return null;
            }
        } catch (Exception e) {
            System.out.println("Error al ejecutar la consulta SQL: " + e.getMessage());
            return null;
        }
    }
       
    public List<String> cargarNombresFarmacias() {
        List<String> nombresFarmacias = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/farmatech", "root", "")) {
            String sql = "SELECT DISTINCT nombre FROM farmacia";
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
    
    public Usuario[] listaEncargados() {
     try {
        Usuario arreglo[] = new Usuario[100];
        String consulta = "SELECT usuario.cedula, usuario.nombre_usuario, usuario.usuario, usuario.clave, farmacia.nombre, usuariofarmacia.estado, usuariofarmacia.fecha_inicio, usuariofarmacia.fecha_termino "
                + "FROM usuario "
                + "INNER JOIN usuariofarmacia ON usuario.id_usuario = usuariofarmacia.id_usuario "
                + "INNER JOIN farmacia ON usuariofarmacia.NIT_farmacia = farmacia.NIT_farmacia "
                + "WHERE (usuario.id_usuario, usuariofarmacia.fecha_inicio, usuariofarmacia.id_usuarioFarmacia) IN "
                + "(SELECT id_usuario, MAX(fecha_inicio), MAX(id_usuarioFarmacia) "
                + "FROM usuariofarmacia "
                + "GROUP BY id_usuario) "
                + "AND usuario.rol = 'encargado' "
                + "AND usuario.estado = 'activo' OR 'inactivo'"   
                + "AND usuariofarmacia.estado = 'activo'";
                    
                    
        ResultSet registros = manipularBD.executeQuery(consulta);

        int i = 0;
        while (registros.next()) {
            String cedula = registros.getString("cedula");
            String nombre = registros.getString("nombre_usuario");
            String usuario = registros.getString("usuario");
            String contraseña = registros.getString("clave");
            String establecimiento = registros.getString("nombre");
            String estado = registros.getString("estado");
            String fecha_inicio = registros.getString("fecha_inicio");
            String fecha_fin = registros.getString("fecha_termino");

            arreglo[i] = new Usuario(cedula, nombre, usuario, contraseña, establecimiento, estado, fecha_inicio, fecha_fin);
            i++;
        }

        // Si no se recuperaron encargados, retornar null
        if (i == 0) {
            return null;
        }

        // Redimensionar el arreglo para eliminar elementos nulos
        Usuario[] encargados = Arrays.copyOf(arreglo, i);

        return encargados;
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
                String insertUsuarioFarmaciaQuery = "INSERT INTO usuariofarmacia (id_usuario, NIT_farmacia, estado, fecha_inicio) VALUES (?, ?, ?, ?)";
                try (PreparedStatement insertUsuarioFarmaciaStatement = conexion.prepareStatement(insertUsuarioFarmaciaQuery)) {
                    insertUsuarioFarmaciaStatement.setInt(1, userId);
                    insertUsuarioFarmaciaStatement.setInt(2, farmaciaId);
                    insertUsuarioFarmaciaStatement.setString(3, "activo");
                    insertUsuarioFarmaciaStatement.setDate(4, new java.sql.Date(fechaInicio.getTime()));
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
    
    public boolean buscarPersona(String cedula){
       boolean resultado = false;
       try {
           String consulta = "SELECT * FROM usuario WHERE cedula = '" + cedula + "'";

            ResultSet registro = manipularBD.executeQuery(consulta);
  
            if (registro.next()) {
                resultado = true;
                
            } else {
                resultado = false;

                
            }
        } catch (SQLException e) {
            System.out.println("Error al buscar registro: "+e.getMessage());
        }
       return resultado;
       
    }
    
    public boolean eliminarPersona(String cedula) {
        boolean respuesta = false;
        try {
            // Deshabilitar las restricciones de clave externa temporalmente
            String consultaDisableFK = "SET FOREIGN_KEY_CHECKS=0";
            manipularBD.executeUpdate(consultaDisableFK);

            // Consulta para eliminar las filas relacionadas en la tabla usuariofarmacia
            String consultaEliminarRelacion = "DELETE FROM usuariofarmacia WHERE id_usuario IN (SELECT id_usuario FROM usuario WHERE cedula='" + cedula + "')";
            manipularBD.executeUpdate(consultaEliminarRelacion);

            // Consulta para eliminar la persona
            String consultaEliminarPersona = "DELETE FROM usuario WHERE cedula='" + cedula + "'";
            int resConsultaEliminar = manipularBD.executeUpdate(consultaEliminarPersona);

            // Verificar si la eliminación fue exitosa
            if (resConsultaEliminar == 1) {
                respuesta = true;
                System.out.println("Eliminado exitosamente");
            } else {
                System.out.println("No se encontró ninguna persona con la cédula especificada");
            }

            // Habilitar las restricciones de clave externa nuevamente
            String consultaEnableFK = "SET FOREIGN_KEY_CHECKS=1";
            manipularBD.executeUpdate(consultaEnableFK);
        } catch (Exception e) {
            System.out.println("Error al eliminar Persona: " + e.getMessage());
        }
        return respuesta;
    }
    
    public boolean actualizarInformacionEncargado(String cedula, String nombre, String usuario) {
        try {
            // Actualizar el nombre y el usuario del encargado en la tabla usuario
            String updateQuery = "UPDATE usuario SET nombre_usuario = ?, usuario = ? WHERE cedula = ?";
            PreparedStatement statement = conexion.prepareStatement(updateQuery);
            statement.setString(1, nombre);
            statement.setString(2, usuario);
            statement.setString(3, cedula);
            int filasActualizadas = statement.executeUpdate();

            // Verificar si la actualización fue exitosa
            if (filasActualizadas > 0) {
                System.out.println("Información del encargado actualizada correctamente.");
                return true;
            } else {
                System.out.println("No se pudo actualizar la información del encargado.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar la información del encargado: " + e.getMessage());
            return false;
        }
    }
    
    public List<List<String>> obtenerAsignacionesPorCedula(String cedula) {
        List<List<String>> asignaciones = new ArrayList<>();
        String query = "SELECT farmacia.nombre, farmacia.direccion, usuariofarmacia.fecha_inicio " +
                       "FROM farmacia " +
                       "JOIN usuarioFarmacia ON farmacia.NIT_farmacia = usuarioFarmacia.NIT_farmacia " +
                       "JOIN historialEstados_farmacia ON farmacia.NIT_farmacia = historialEstados_farmacia.NIT_farmacia " +
                       "WHERE usuarioFarmacia.id_usuario IN (SELECT id_usuario FROM usuario WHERE cedula = ?)";
        try (PreparedStatement statement = conexion.prepareStatement(query)) {
            statement.setString(1, cedula);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                List<String> asignacion = new ArrayList<>();
                asignacion.add(resultSet.getString(1)); // Nombre del establecimiento
                asignacion.add(resultSet.getString(2)); // Dirección
                asignacion.add(resultSet.getString(3)); // Fecha de asignación
                asignaciones.add(asignacion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return asignaciones;
    }
    
    public List<String> cargarNombresProveedores() {
        List<String> nombresProveedor = new ArrayList<>();
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/farmatech", "root", "")) {
            String sql = "SELECT DISTINCT nombre_proveedor FROM proveedor";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                try (ResultSet resultSet = statement.executeQuery()) {
                    while (resultSet.next()) {
                        String nombreProveedor = resultSet.getString("nombre_proveedor");
                        nombresProveedor.add(nombreProveedor);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nombresProveedor;
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
     
    public boolean uploadPhoto(String nombre_producto, ImageIcon imageIcon, String volumen, String precio_unitario, String fecha_vencimiento, String ingredientes, String usos, String cantidad, String nombreProveedor) {
        boolean respuesta = false;

        try {
            // Get the underlying image from the ImageIcon
            Image image = imageIcon.getImage();

            // Create a BufferedImage with the same dimensions and type as the original image
            BufferedImage bufferedImage = new BufferedImage(image.getWidth(null), image.getHeight(null), BufferedImage.TYPE_INT_ARGB);

            // Use graphics context to draw the original image onto the BufferedImage
            Graphics2D g2 = bufferedImage.createGraphics();
            g2.drawImage(image, 0, 0, null);
            g2.dispose();

            // Convert the BufferedImage to byte[] 
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(bufferedImage, "png", baos);
            byte[] imageBytes = baos.toByteArray();

            // Prepare the image blob
            Blob imageBlob = conexion.createBlob();
            imageBlob.setBytes(1, imageBytes);

            // Obtener el NIT del proveedor usando el nombre del proveedor
            String obtenerNITProveedorQuery = "SELECT NIT_proveedor FROM proveedor WHERE nombre_proveedor = ?";
            PreparedStatement obtenerNITProveedorStatement = conexion.prepareStatement(obtenerNITProveedorQuery);
            obtenerNITProveedorStatement.setString(1, nombreProveedor);
            ResultSet resultSet = obtenerNITProveedorStatement.executeQuery();

            String nitProveedor = null;
            if (resultSet.next()) {
                nitProveedor = resultSet.getString("NIT_proveedor");
            }

            // Insertar el producto en la tabla producto
            String insertProductQuery = "INSERT INTO producto (nombre_producto, medicamento, volumen, precio_unitario, fecha_vencimiento, ingredientes, usos) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertProductStatement = conexion.prepareStatement(insertProductQuery, Statement.RETURN_GENERATED_KEYS);
            insertProductStatement.setString(1, nombre_producto);
            insertProductStatement.setBlob(2, imageBlob);
            insertProductStatement.setString(3, volumen);
            insertProductStatement.setBigDecimal(4, new BigDecimal(precio_unitario));
            insertProductStatement.setDate(5, java.sql.Date.valueOf(fecha_vencimiento));
            insertProductStatement.setString(6, ingredientes);
            insertProductStatement.setString(7, usos);
            insertProductStatement.executeUpdate();

            // Obtener el id del último producto insertado
            ResultSet generatedKeys = insertProductStatement.getGeneratedKeys();
            int productId = -1;
            if (generatedKeys.next()) {
                productId = generatedKeys.getInt(1);
            }

            // Insertar la información del stock en la tabla stock
            String insertStockQuery = "INSERT INTO stock (NIT_farmacia, id_producto, proveedor, cant_entrante, cant_restante, estado, fecha_registro) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement insertStockStatement = conexion.prepareStatement(insertStockQuery);
            insertStockStatement.setString(1, null); // No se proporciona el NIT de la farmacia
            insertStockStatement.setInt(2, productId);
            insertStockStatement.setString(3, nitProveedor); // Usar el NIT del proveedor obtenido
            int cantidadEntrante = Integer.parseInt(cantidad);
            insertStockStatement.setInt(4, cantidadEntrante);
            insertStockStatement.setInt(5, cantidadEntrante); // Cantidades entrante y restante iguales
            insertStockStatement.setString(6, "activo");
            insertStockStatement.setDate(7, new java.sql.Date(System.currentTimeMillis())); // or use java.sql.Date.valueOf(LocalDate.now()) if using Java 8 or higher
            insertStockStatement.executeUpdate();

            respuesta = true;

        } catch (IOException ex) {
            System.out.println("Error en IO en Foto: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error en UPDATE Foto: " + ex.getMessage());
        }

        return respuesta;
    }

    
    
    public Connection getConexion() {
        return conexion;
    }

    public Statement getManipularBD() {
        return manipularBD;
        
    }

    public void uploadPhoto(String campo_nombre_str) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
