
package utils;

import java.awt.Image;

public class ProductosCristian {
    private String id_producto;
    private String nombre_producto;
    private Image medicamentos;
    private String volumen;
    private String precio_unitario;
    private String fecha_vencimiento;
    private String ingredientes;
    private String usos;
    private Image medicamento;
    private String cantidad;
    private String suma_total;
    
    public ProductosCristian(String id_producto, String nombre_producto, String volumen, String precio_unitario) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.medicamento = medicamento;
        this.volumen = volumen;
        this.precio_unitario = precio_unitario;
        this.fecha_vencimiento = fecha_vencimiento;
        this.ingredientes = ingredientes;
        this.usos = usos;
        this.cantidad = cantidad;
        this.suma_total = suma_total;
        
        
    }
    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    
    public Image getMedicamento(){
        return medicamento;
    }

    public void setMeedicamentos(Image medicamento){
        this.medicamento = medicamento;
    }
  

    public String getVolumen() {
        return volumen;
    }

    public void setVolumen(String volumen) {
        this.volumen = volumen;
    }

    public String getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(String precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getFecha_vencimiento() {
        return fecha_vencimiento;
    }

    public void setFecha_vencimiento(String fecha_vencimiento) {
        this.fecha_vencimiento = fecha_vencimiento;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getUsos() {
        return usos;
    }

    public void setUsos(String usos) {
        this.usos = usos;
    }
    
    public String getCantidad(){
        return cantidad;
    }
    
    public void setCantidad(String cantidad){
        this.cantidad = cantidad;
    }
    
    public String getSuma_total(){
        return suma_total;
    }
    
    public void setSuma_total(String suma_total){
        this.suma_total = suma_total;
    }
}
