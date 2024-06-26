package utils;

import java.awt.Image;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

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

    public Stock1[] listaStock(String NIT) {

        try {
            Stock1 arreglo[] = new Stock1[100];
            String consulta = "SELECT stock.id_stock, producto.nombre_producto, stock.proveedor, stock.cant_entrante, stock.cant_restante,stock.estado,stock.comentario  FROM stock ";
            consulta += "INNER JOIN producto ON (producto.id_producto = stock.id_producto) WHERE NIT_farmacia = '" + NIT + "' ";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                int i = 0;
                do {
                    String id_stocks = registros.getString("id_stock");
                    String nombre_productos = registros.getString("nombre_producto");
                    String proveedor = registros.getString("proveedor");
                    String cant_entrante = registros.getString("cant_entrante");
                    String cant_restante = registros.getString("cant_restante");
                    String estado = registros.getString("estado");
                    String comentario = registros.getString("comentario");
                    arreglo[i] = new Stock1(id_stocks, nombre_productos, proveedor, cant_entrante, cant_restante, estado, comentario);
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

    public boolean eliminarProveedor(String nit) {
        boolean respuesta = false;

        try {
            String consulta2 = "DELETE FROM stock WHERE proveedor='" + nit + "' ";
            int resp_consulta2 = manipularBD.executeUpdate(consulta2);
            String consulta = "DELETE FROM proveedor WHERE NIT_proveedor='" + nit + "' ";
            int resp_consulta = manipularBD.executeUpdate(consulta);

            if (resp_consulta == 1 || resp_consulta2 > 0) {
                respuesta = true;
            }

        } catch (SQLException ex) {
            System.out.println("--> Error Delete: " + ex.getMessage());
        }
        if (respuesta) {
            System.out.println("Eliminado con exito");
        } else {
            System.out.println("No se pudo Eliminar");
        }
        return respuesta;
    }

    public String buscarAsignacion(String id_usuario) {

        try {

            String consulta = "SELECT NIT_farmacia FROM usuariofarmacia WHERE usuariofarmacia.id_usuario = '" + id_usuario + "' ";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                String nit = registros.getString("NIT_farmacia");
                return nit;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());

        }
        return null;
    }

    public Producto buscarProducto(String nombres) throws IOException {
        try {
            Producto encontrado = null;

            String consulta = "SELECT * FROM producto WHERE nombre_producto = '" + nombres + "' ";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                String id_productos = registros.getString("id_producto");
                String nombre_producto = registros.getString("nombre_producto");
                String volumen = registros.getString("volumen");
                String precio_unitario = registros.getString("precio_unitario");
                String fecha_vencimiento = registros.getString("fecha_vencimiento");
                String ingredientes = registros.getString("ingredientes");
                String usos = registros.getString("usos");
                Image medicamento = null;
                InputStream inputStream = registros.getBinaryStream("medicamento");
                if (inputStream != null) {
                    byte[] bytes = new byte[inputStream.available()];
                    inputStream.read(bytes);
                    medicamento = new ImageIcon(bytes, id_productos).getImage();
                }

                encontrado = new Producto(id_productos, nombre_producto, medicamento, volumen, precio_unitario, fecha_vencimiento, ingredientes, usos);
                return encontrado;
            }
        } catch (IOException ex) {
            System.out.println("Se presento un error al extraer la foto: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
        return null;
    }

    public Stock1 [] buscarProductoenStock(String nombreP, String NIT){
        try {
            Stock1 encontrado []= new Stock1[10];

            String consulta = "SELECT stock.id_stock, producto.nombre_producto, stock.proveedor, stock.cant_entrante, stock.cant_restante,stock.estado,stock.comentario  FROM stock ";
            consulta += "INNER JOIN producto ON (producto.id_producto = stock.id_producto) WHERE nombre_producto LIKE '"+nombreP +"%' AND NIT_farmacia = '" + NIT + "'";

            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                int i = 0;
                do{ 
                    String id_stock = registros.getString("id_stock");
                    String nombre_productos = registros.getString("nombre_producto");
                    String proveedor = registros.getString("proveedor");
                    String cant_entrante = registros.getString("cant_entrante");
                    String cant_restante = registros.getString("cant_restante");
                    String estado = registros.getString("estado");
                    String comentario = registros.getString("comentario");
                    encontrado [i]= new Stock1(id_stock, nombre_productos, proveedor, cant_entrante, cant_restante, estado, comentario);
                    i++;
                }while(registros.next());
                return encontrado;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
        return null;
    }


    
    public boolean actualizarProductoEditar(String id_producto, String nombres, ImageIcon medicamento, String volumen, String precio, String fecha, String ingredientes, String usos) {

        boolean respuesta = false;
        try {
            
            String consulta = "UPDATE producto SET nombre_producto='" + nombres + "', medicamento='" + medicamento + "', volumen='" + volumen + "', precio_unitario='" + precio + "', fecha_vencimiento='" + fecha + "', ingredientes='" + ingredientes + "', usos='" + usos + "'";
            consulta +="WHERE id_producto='" + id_producto+"' ";
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
            return respuesta;
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }

        return respuesta;
    }

    public boolean actualizarProductoEditar(String id_producto, String nombres, String volumen, String precio, String fecha, String ingredientes, String usos) {
        boolean respuesta = false;
        try {
            String consulta = "UPDATE producto SET nombre_producto='" + nombres + "', volumen='" + volumen + "', precio_unitario='" + precio + "', fecha_vencimiento='" + fecha + "', ingredientes='" + ingredientes + "', usos='" + usos + "'";
            consulta +="WHERE id_producto='" + id_producto+"' ";
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
            
            return respuesta;
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        return respuesta;
    }

    public boolean actualizarStock(String id_stock, String nombre, String proveedor, String cant_entrante, String cant_restante, String estado, String comentario) {
        boolean respuesta = false;
        try {
            java.util.Date dt = new java.util.Date();
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(
                    "yyyy-MM-dd HH:mm:ss");

            String fechaHoraActual = sdf.format(dt);
            if (estado.equals("inactivo")) {
                String consulta = "UPDATE stock SET proveedor='" + proveedor + "', cant_entrante='" + cant_entrante + "', cant_restante='" + cant_restante + "', estado='" + estado + "', comentario='" + comentario +  "', fecha_descontinuacion='" + fechaHoraActual +  "' WHERE id_stock='" + id_stock + "' ";
                int resp_consulta = manipularBD.executeUpdate(consulta);
                if (resp_consulta == 1) {
                    respuesta = true;
                }
            }else{
                String consulta = "UPDATE stock SET proveedor='" + proveedor + "', cant_entrante='" + cant_entrante + "', cant_restante='" + cant_restante + "', estado='" + estado + "', comentario='" + comentario +  "' WHERE id_stock='" + id_stock + "' ";
                int resp_consulta = manipularBD.executeUpdate(consulta);
                System.out.println(resp_consulta);
                if (resp_consulta == 1) {
                    respuesta = true;
                }
            }

            return respuesta;

        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }

        return respuesta;
    }

    public boolean insertarProveedor(String nit, String nombre, String direccion, String telefono, String correo, String persona, String estado) {
        boolean respuesta = false;
        try {
            String consulta = "INSERT INTO proveedor (nit_proveedor,nombre_proveedor, direccion, telefono, correo, persona_contacto, estado) VALUES ('" + nit + "','" + nombre + "','" + direccion + "','" + telefono + "','" + correo + "','" + persona + "','" + estado + "')";
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Insert: " + ex.getMessage());
        }
        if (respuesta) {
            System.out.println("Insertado con exito");
        } else {
            System.out.println("No se pudo insertar");
        }
        return respuesta;
    }

    public Proveedores buscarProveedor(String nit) {
        try {
            Proveedores encontrado = null;

            String consulta = "SELECT * FROM proveedor WHERE NIT_proveedor = '" + nit + "' ";
            ResultSet registros = manipularBD.executeQuery(consulta);
            registros.next();
            if (registros.getRow() == 1) {
                String nit_proveedor = registros.getString("NIT_proveedor");
                String nombre_proveedor = registros.getString("nombre_proveedor");
                String direccion = registros.getString("direccion");
                String telefono = registros.getString("telefono");
                String correo = registros.getString("correo");
                String persona_contacto = registros.getString("persona_contacto");
                String estado = registros.getString("estado");

                encontrado = new Proveedores(nit_proveedor, nombre_proveedor, direccion, telefono, correo, persona_contacto, estado);
                return encontrado;
            } else {
                return encontrado;
            }
        } catch (SQLException ex) {
            System.out.println("Error al ejecutar el SELECT: ");
            System.out.println(ex.getMessage());
            return null;
        }
    }

    public boolean actualizarProveedor(String nit, String nombre, String direccion, String telefono, String correo, String persona, String estado) {
        boolean respuesta = false;
        try {
            String consulta = "UPDATE proveedor SET NIT_proveedor='" + nit + "', nombre_proveedor='" + nombre + "', direccion='" + direccion + "', telefono='" + telefono + "', correo='" + correo + "', persona_contacto='" + persona + "', estado='" + estado + "' WHERE NIT_proveedor='" + nit + "' ";
            int resp_consulta = manipularBD.executeUpdate(consulta);
            if (resp_consulta == 1) {
                respuesta = true;
            }
        } catch (SQLException ex) {
            System.out.println("--> Error Update: " + ex.getMessage());
        }
        if (respuesta) {
            System.out.println("Editado con exito");
        } else {
            System.out.println("No se pudo Editar");
        }
        return respuesta;
    }

    public Connection getConexion() {
        return conexion;
    }

    public Statement getManipularBD() {
        return manipularBD;

    }

}
