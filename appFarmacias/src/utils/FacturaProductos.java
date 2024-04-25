package utils;

public class FacturaProductos {
    String idProducto;
    String producto;
    String precioUnitario;
    String cantidad;
    String suma_total;
    String total;

    public FacturaProductos(String idProducto, String producto, String precioUnitario, String cantidad, String suma_total) {
        this.idProducto = idProducto;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.suma_total = suma_total;
        this.total = total;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
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

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
    
    
}
