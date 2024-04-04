package utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatosValeria {

    Connection conexion;
    Statement manipularBD;

    public BaseDatosValeria() {
        String hostname = "localhost";
        String puerto = "3306";
        String databasename = "farmatech";
        String user = "root";
        String password = "";

        String url = "jdbc:mysql://" + hostname + ":" + puerto + "/" + databasename;

        try {
            conexion = DriverManager.getConnection(url, user, password);
            manipularBD = conexion.createStatement();
            System.out.println("Conexion exitosa Valeria.");
        } catch (SQLException ex) {
            System.out.println("Error en conexion a BD:");
            System.out.println(ex.getMessage());
        }
    }

    public Usuario[] listaEncargados() {

        try {
            Usuario arreglo[] = new Usuario[100];
            String consulta = "SELECT usuario.cedula, usuario.nombre_usuario, usuario.usuario, usuario.clave, farmacia.nombre, usuario.estado, usuario.fecha_inicio, usuario.fecha_termino"
                    + " FROM usuario"
                    + " INNER JOIN usuariofarmacia ON usuario.id_usuario = usuariofarmacia.id_usuario"
                    + " INNER JOIN farmacia ON usuariofarmacia.NIT_farmacia = farmacia.NIT_farmacia"
                    + " WHERE usuario.rol = 'encargado' AND usuario.estado = 'activo'";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                int i = 0;
                do {

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

                } while (registros.next());
                return arreglo;
            } else {
                return arreglo;
            }
        } catch (Exception e) {
            System.out.println("Error al imprimir el SELECT");
            System.out.println(e.getMessage());
            return null;
        }

    }

    public Proveedores[] listaProveedores_admin() {

        try {
            Proveedores arreglo[] = new Proveedores[100];
            String consulta = "SELECT proveedor.NIT_proveedor, proveedor.nombre_proveedor, proveedor.direccion, proveedor.telefono, proveedor.correo, proveedor.persona_contacto,proveedor.estado"
                    + " FROM proveedor";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                int i = 0;
                do {

                    String nit = registros.getString("NIT_proveedor");
                    String nombre = registros.getString("nombre_proveedor");
                    String direccion = registros.getString("direccion");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("correo");
                    String persona_contacto = registros.getString("persona_contacto");
                    String estado = registros.getString("estado");
                    arreglo[i] = new Proveedores(nit, nombre, direccion, telefono, correo, persona_contacto, estado);
                    i++;

                } while (registros.next());
                return arreglo;
            } else {
                return arreglo;
            }
        } catch (Exception e) {
            System.out.println("Error al imprimir el SELECT");
            System.out.println(e.getMessage());
            return null;
        }

    }
    public Proveedores[] listaProveedores() {

        try {
            Proveedores arreglo[] = new Proveedores[100];
            String consulta = "SELECT proveedor.NIT_proveedor, proveedor.nombre_proveedor, proveedor.direccion, proveedor.telefono, proveedor.correo, proveedor.persona_contacto,proveedor.estado"
                    + " FROM proveedor"
                    + " WHERE  proveedor.estado = 'activo'";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                int i = 0;
                do {

                    String nit = registros.getString("NIT_proveedor");
                    String nombre = registros.getString("nombre_proveedor");
                    String direccion = registros.getString("direccion");
                    String telefono = registros.getString("telefono");
                    String correo = registros.getString("correo");
                    String persona_contacto = registros.getString("persona_contacto");
                    String estado = registros.getString("estado");
                    arreglo[i] = new Proveedores(nit, nombre, direccion, telefono, correo, persona_contacto, estado);
                    i++;

                } while (registros.next());
                return arreglo;
            } else {
                return arreglo;
            }
        } catch (Exception e) {
            System.out.println("Error al imprimir el SELECT");
            System.out.println(e.getMessage());
            return null;
        }

    }
    public boolean eliminarProveedor(String nit){
        boolean respuesta = false;
        try {
            String consulta = "DELETE FROM proveedor WHERE nit='"+nit+"' ";
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
    }
    
    public Producto buscarProducto(String id_producto){
        try {
            Producto encontrado = null;
            
            String consulta = "SELECT * FROM producto WHERE id_producto = '"+id_producto+"' ";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                String id_productos = registros.getString("id_producto");
                String nombre_producto = registros.getString("nombre_producto");
                String medicamentos = registros.getString("medicamento");
                String volumen = registros.getString("volumen");
                String precio_unitario = registros.getString("precio_unitario");
                String fecha_vencimiento = registros.getString("fecha_vencimiento");
                String ingredientes = registros.getString("ingredientes");
                String usos = registros.getString("usos");
                
                
                encontrado = new Producto(id_productos, nombre_producto, medicamentos, volumen, precio_unitario, fecha_vencimiento, ingredientes, usos);
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
    
    public boolean actualizarProductoEditar(String id_producto, String nombres, String medicamento, String volumen, String precio, String fecha, String ingredientes, String usos){
        boolean respuesta = false;
        try {
            String consulta = "UPDATE producto SET nombre_producto='"+nombres+"', medicamento='"+medicamento+"', volumen='"+volumen+"', precio_unitario='"+precio+"', fecha_vencimiento='"+fecha+"', ingredientes='"+ingredientes+"', usos='"+usos+"' WHERE id_producto='"+id_producto+"' ";
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Editado con exito");
        }else{
            System.out.println("No se pudo Editar");
        }
        return respuesta;
    }
    
    public boolean eliminarProducto(String id_producto){
        boolean respuesta = false;
        try {
            String consulta = "DELETE FROM producto WHERE id_producto='"+id_producto+"' ";
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Eliminado con exito");
        }else{
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
    }
    public boolean insertarProveedor(String nit,String nombre, String direccion, String telefono, String correo, String persona, String estado){
        boolean respuesta = false;
        try {
            String consulta = "INSERT INTO proveedor (nit_proveedor,nombre_proveedor, direccion, telefono, correo, persona_contacto, estado) VALUES ('"+nit+"','"+nombre+"','"+direccion+"','"+telefono+"','"+correo+"','"+persona+"','"+estado+"')";
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta==1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta){
            System.out.println("Insertado con exito");
        }else{
            System.out.println("No se pudo insertar");
        }
        return respuesta;
    }
    
    public Proveedores buscarProveedor(String nit){
        try {
            Proveedores encontrado = null;
            
            String consulta = "SELECT * FROM proveedor WHERE NIT_proveedor = '"+nit+"' ";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow()==1) {
                String nit_proveedor = registros.getString("NIT_proveedor");
                String nombre_proveedor = registros.getString("nombre_proveedor");
                String direccion = registros.getString("direccion");
                String telefono = registros.getString( "telefono");
                String correo = registros.getString("correo");
                String persona_contacto = registros.getString("persona_contacto");
                String estado = registros.getString("estado");
   
                
                
                encontrado = new Proveedores(nit_proveedor, nombre_proveedor, direccion, telefono, correo, persona_contacto, estado);
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

    public Connection getConexion() {
        return conexion;
    }

    public Statement getManipularBD() {
        return manipularBD;

    }
    
}