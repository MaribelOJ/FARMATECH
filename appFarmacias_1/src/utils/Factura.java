
package utils;

public class Factura {
    
    String numReferencia;
    String fecha;
    String id_cliente;
    String total;

    public Factura(String numReferencia, String fecha, String id_cliente, String total) {
        this.numReferencia = numReferencia;
        this.fecha = fecha;
        this.id_cliente = id_cliente;
        this.total = total;
    }

    public String getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
}
