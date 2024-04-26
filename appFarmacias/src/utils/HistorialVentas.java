package utils;
    

import utils.BaseDatosCristian;

public class HistorialVentas {
    private String numReferencia;
    private String fecha;
    private String id_cliente;
    private String nombre_cliente;
    private String total;
    
    
    public HistorialVentas( String numReferencia, String fecha, String id_cliente, String nombre_cliente, String total){
       this.numReferencia = numReferencia;
       this.fecha = fecha;
       this.id_cliente = id_cliente;
       this.nombre_cliente = nombre_cliente;
       this.total = total; 
    }


    //Getters
    public String getNumReferencia(){
        return numReferencia;
    }
    
    public void setNumReferencia(String numReferencia){
        this.numReferencia = numReferencia; 
    }
        
    public String getFecha(){
        return fecha;
    }
    
    public void setFecha(String fecha){
        this.fecha= fecha;
    }
    
    public String getId_cliente(){
        return id_cliente;
    }
    public void setId_cliente(String id_cliente){
        this.id_cliente = id_cliente;
    }
    
    public String getNombre_cliente(){
        return nombre_cliente;
    }
    
    public void setNombre_cliente(String nombre_cliente){
        this.nombre_cliente = nombre_cliente;
    }
    
    public String getTotal(){
        return total;
    }
    
    public void setTotal(String total){
        this.total = total;
    }
    
    
    
}