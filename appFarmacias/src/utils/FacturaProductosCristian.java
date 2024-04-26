package utils;

public class FacturaProductosCristian {

    private String producto;
    private String precioUnitario;
    private String cantidad;
    private String total;
    private String iva;
    private String sub_total;

    public FacturaProductosCristian( String producto, String precioUnitario, String cantidad, String total, String iva, String sub_total) {

        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.total = total;
        this.iva = iva;
        this.sub_total = sub_total;
    }
    
    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(String precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public String getCantidad() {
        return cantidad;
    }
    public String getSub_total(){
        return sub_total;
    }
    
    public void setSub_total(String sub_total){
        this.sub_total = sub_total;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    public String getIva(){
        return iva;
    }
    
    public void setIva(String iva){
        this.iva=iva;
    }
    
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    } 
    
  
    
    
}
