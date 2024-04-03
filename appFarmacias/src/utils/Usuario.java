
package utils;


public class Usuario {
  
    private String id_usuario;
    private String cedula;
    private String nombre;
    private String usuario;
    private String clave;
    private String rol;
    private String estado;
    private String fecha_inicio;
    private String fecha_termino;
    private String establecimiento;
    

    public Usuario(String id_usuario, String cedula, String nombre, String usuario, String rol, String estado, String fecha_inicio) {
        this.id_usuario = id_usuario;
        this.cedula = cedula;
        this.nombre = nombre;
        this.usuario = usuario;
        this.rol = rol;
        this.estado = estado;
        this.fecha_inicio = fecha_inicio;
    }
    
    public Usuario(String cedula, String nombre, String usuario, String clave, String establecimiento, String estado, String fecha_inicio, String fecha_termino){
        this.cedula = cedula;
        this.nombre = nombre;
        this.usuario = usuario;
        this.clave = clave;
        this.establecimiento = establecimiento;
        this.estado = estado;
        this.fecha_inicio = fecha_inicio;
        this.fecha_termino = fecha_termino;
    }

    public String getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(String id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }
    
    public String getFecha_termino(){
        return fecha_termino;
    }
    
    public void setFecha_termino(String fecha_termino){
        this.fecha_termino = fecha_termino;
    }
    
    public String getClave(){
        return clave;
    }
    
    public void setClave(String clave){
        this.clave = clave;
    }
    
    public String getEstablecimiento(){
        return establecimiento;
    }
    
    public void setEstablecimiento(String establecimiento){
        this.establecimiento = establecimiento;
    }
    
    
}
