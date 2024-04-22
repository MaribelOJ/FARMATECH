package utils;

public class Proveedores {
    private String id_proveedores;
    private String nit;
    private String nombre_proveedor;
    private String direccion;
    private String telefono;
    private String correo;
    private String persona_contacto;
    private String estado;

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }
    

    public Proveedores(String id_proveedores, String nit,String nombre_proveedor, String direccion, String telefono, String correo,String persona_contacto, String estado) {
        this.id_proveedores = id_proveedores;
        this.nit = nit;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.persona_contacto = persona_contacto;
        this.estado = estado;
        
    }

    public String getId_proveedores() {
        return id_proveedores;
    }

    public void setId_proveedores(String id_proveedores) {
        this.id_proveedores = id_proveedores;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getPersona_contacto() {
        return persona_contacto;
    }

    public void setPersona_contacto(String persona_contacto) {
        this.persona_contacto = persona_contacto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public Proveedores(String nit,String nombre_proveedor, String direccion, String telefono, String correo, String persona_contacto, String estado){
        this.nit = nit;
        this.nombre_proveedor = nombre_proveedor;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correo = correo;
        this.persona_contacto = persona_contacto;
        this.estado = estado;
 
    }
}
