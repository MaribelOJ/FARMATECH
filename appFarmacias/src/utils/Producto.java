
package utils;

import java.awt.Image;


public class Producto {
    String id_producto;
    String nombre_producto;
    Image medicamento;
    String volumen;
    String precio_unitario;
    String fecha_vencimiento;
    String ingredientes;
    String usos;
    String stock;

    public Producto(String id_producto, String nombre_producto, String volumen, String precio_unitario, String fecha_vencimientos, String ingredientes, String usos){
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.medicamento = medicamento;
        this.volumen = volumen;
        this.precio_unitario = precio_unitario;
        this.fecha_vencimiento = fecha_vencimientos;
        this.ingredientes = ingredientes;
        this.usos = usos;
    }

   
    
    public String getId_producto(){
        return id_producto;
    }
    
    public void setId_ptoducto(String id_producto){
        this.id_producto = id_producto;
    }
    
    public String getNombre_producto(){
        return nombre_producto;
    }
    
    public void setNombre_producto(String nombre_producto){
        this.nombre_producto = nombre_producto;
    }
    
    public Image getMedicamentos(){
        return medicamento;
    }
    
    public void setMedicamentos(Image medicamentos){
        this.medicamento = medicamentos;
    }
    
    public String getVolumen(){
        return volumen;
    }
    
    public void setVolumen(String volumen){
        this.volumen = volumen;
    }
    
    public String getPrecio_unitario(){
        return precio_unitario;
    }
    
    public void setPrecio_unitario(String precio_unitario){
        this.precio_unitario = precio_unitario;
    }
    
    public String getFecha_vencimiento(){
        return fecha_vencimiento;
    }
    
    public void setFecha_vencimeinto(String fecha_vencimiento){
        this.fecha_vencimiento = fecha_vencimiento;
    }
    
    public String getIngredientes(){
        return ingredientes;
    }
    
    public void setIngredientes(String ingredientes){
        this.ingredientes = ingredientes;
    }
    
    public String getUsos(){
        return usos;
    }
    
    public void setUsos(String usos){
        this.usos = usos;
    }
    public String getStock(){
        return stock;
    }
    public void setStock(String stock){
        this.stock = stock;
    }
   

    
}
