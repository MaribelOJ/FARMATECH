
package utils;

import java.awt.Image;

public class Catalogo {
    private String nombre_producto;
    private Image foto;
    private String precio_unitario;
    private String usos;
    private String cant_restante;

    public Catalogo(String nombre_producto, Image foto, String precio_unitario, String usos, String cant_restante) {
        this.nombre_producto = nombre_producto;
        this.foto = foto;
        this.precio_unitario = precio_unitario;
        this.usos = usos;
        this.cant_restante = cant_restante;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Image getFoto() {
        return foto;
    }

    public void setFoto(Image foto) {
        this.foto = foto;
    }

    public String getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(String precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getUsos() {
        return usos;
    }

    public void setUsos(String usos) {
        this.usos = usos;
    }

    public String getCant_restante() {
        return cant_restante;
    }

    public void setCant_restante(String cant_restante) {
        this.cant_restante = cant_restante;
    }
    
    
}
