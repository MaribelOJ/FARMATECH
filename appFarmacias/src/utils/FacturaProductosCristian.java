package utils;

public class FacturaProductosCristian {

    String producto;
    String precioUnitario;
    String cantidad;
    String suma_total;

    public FacturaProductosCristian( String producto, String precioUnitario, String cantidad, String suma_total) {

        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.suma_total = suma_total;
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

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getSuma_total() {
        return suma_total;
    }

    public void setSuma_total(String suma_total) {
        this.suma_total = suma_total;
    } 
    
    
}
