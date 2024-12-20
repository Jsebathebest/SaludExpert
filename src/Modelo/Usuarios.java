package Modelo;

/**
 * Clase que representa un usuario con atributos como nombre, apellido, cédula, correo, etc.
 */
public class Usuarios {

    // Atributos
    int idUser;
    String nombre;
    String apellido;
    String cedula;
    String correo;
    String genero;
    String numeroTelefono;
    String contraseña;
    String rol;

    /**
     * Constructor vacío.
     */
    public Usuarios() {
    }

    /**
     * Constructor con todos los atributos necesarios para crear un objeto Usuario.
     * 
     * @param idUser Identificador del usuario.
     * @param nombre Nombre del usuario.
     * @param apellido Apellido del usuario.
     * @param cedula Cédula de identificación del usuario.
     * @param correo Correo electrónico del usuario.
     * @param genero Género del usuario.
     * @param numeroTelefono Número de teléfono del usuario.
     * @param contraseña Contraseña del usuario.
     * @param rol Rol del usuario en el sistema.
     */
    public Usuarios(int idUser, String nombre, String apellido, String cedula, String correo, String genero, 
                    String numeroTelefono, String contraseña, String rol) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.correo = correo;
        this.genero = genero;
        this.numeroTelefono = numeroTelefono;
        this.contraseña = contraseña;
        this.rol = rol;
    }

    // Getters y Setters
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
