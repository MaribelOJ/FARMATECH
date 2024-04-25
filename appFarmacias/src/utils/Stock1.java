/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

/**
 *
 * @author vcarv
 */
public class Stock1 {

    private String id_stock;
    private String NIT_farmacia;
    private String id_producto;
    private String nombre_producto;
    private String proveedor;
    private String cant_entrante;
    private String cant_restante;
    private String estado;
    private String fecha_registro;
    private String fecha_descontinuacion;
    private String comentario;
    
    public Stock1(String id_stock, String NIT_farmacia, String id_producto,  String nombre_producto,String proveedor, String cant_entrante,String cant_restante, String estado, String fecha_registro, String fecha_descontinuacion,String comentario) {
        this.id_stock = id_stock;
        this.NIT_farmacia = NIT_farmacia;
        this.id_producto = id_producto;
        this.nombre_producto=nombre_producto;
        this.proveedor = proveedor;
        this.cant_entrante = cant_entrante;
        this.cant_restante = cant_restante;
        this.estado = estado;
        this.fecha_registro = fecha_registro;
        this.fecha_descontinuacion = fecha_descontinuacion;
        this.comentario = comentario;
        
        
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }
    public Stock1( String nombre_producto,String proveedor, String cant_entrante, String cant_restante,String estado, String comentario) {
      
        this.nombre_producto = nombre_producto;
        this.proveedor = proveedor;
        this.cant_entrante = cant_entrante;
        this.cant_restante = cant_restante;
        this.estado = estado;
        this.comentario = comentario;
        
        
    }

    public String getId_stock() {
        return id_stock;
    }

    public void setId_stock(String id_stock) {
        this.id_stock = id_stock;
    }

    public String getNIT_farmacia() {
        return NIT_farmacia;
    }

    public void setNIT_farmacia(String NIT_farmacia) {
        this.NIT_farmacia = NIT_farmacia;
    }

    public String getId_producto() {
        return id_producto;
    }

    public void setId_producto(String id_producto) {
        this.id_producto = id_producto;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public String getCant_entrante() {
        return cant_entrante;
    }

    public void setCant_entrante(String cant_entrante) {
        this.cant_entrante = cant_entrante;
    }

    public String getCant_restante() {
        return cant_restante;
    }

    public void setCant_restante(String cant_restante) {
        this.cant_restante = cant_restante;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha_registro() {
        return fecha_registro;
    }

    public void setFecha_registro(String fecha_registro) {
        this.fecha_registro = fecha_registro;
    }

    public String getFecha_descontinuacion() {
        return fecha_descontinuacion;
    }

    public void setFecha_descontinuacion(String fecha_descontinuacion) {
        this.fecha_descontinuacion = fecha_descontinuacion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
