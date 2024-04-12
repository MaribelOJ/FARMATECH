package utils;

public class ListaProveedor {

    private String NIT_proveedor;
    private String nombre_proveedor;
    private String direccion;
    private String telefono;
    private String correo;
    private String persona_contacto;
    private String estado;
    
    public ListaProveedor (String NIT_proveedor, String nombre_proveedor, String direccion, String telefono, String correo, String persona_contacto, String estado1){
        this.NIT_proveedor = NIT_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.persona_contacto = persona_contacto;
        this.estado = estado;
    }

  

    // GETTERS
    
    public String getNIT_proveedor() {
        return NIT_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getPersona_contacto() {
        return persona_contacto;
    }

    public String getEstado() {
        return estado;
    }

    // SETTERS
    
    public void setNIT_proveedor(String NIT_proveedor) {
        this.NIT_proveedor = NIT_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setPersona_contacto(String persona_contacto) {
        this.persona_contacto = persona_contacto;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
