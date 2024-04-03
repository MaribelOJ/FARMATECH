
package utils;

   
public class Stock {
    
    String id_producto;
    String nombre;
    String cant_restante;

    public Stock(String id_producto, String nombre, String cant_restante) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.cant_restante = cant_restante;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCant_restante() {
        return cant_restante;
    }

    public void setCant_restante(String cant_restante) {
        this.cant_restante = cant_restante;
    }
    
    
}
