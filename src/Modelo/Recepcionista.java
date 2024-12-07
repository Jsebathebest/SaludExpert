package Modelo;

/**
 * Representa un recepcionista dentro del sistema.
 * Contiene información personal y de contacto del recepcionista.
 * 
 * @author Sebastian
 */
public class Recepcionista {

    private int idRecepcionista;
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String telefono;
    private String genero;
    private int edad;
    private String cedula;
    private String fechaRegistro;
    private String contraseña;

    /**
     * Constructor vacío de la clase Recepcionista.
     */
    public Recepcionista() {
    }

    /**
     * Constructor con parámetros para inicializar los atributos del recepcionista.
     * 
     * @param idRecepcionista el ID del recepcionista.
     * @param nombres el nombre del recepcionista.
     * @param apellidos los apellidos del recepcionista.
     * @param correoElectronico el correo electrónico del recepcionista.
     * @param telefono el teléfono del recepcionista.
     * @param genero el género del recepcionista.
     * @param edad la edad del recepcionista.
     * @param cedula la cédula del recepcionista.
     * @param fechaRegistro la fecha de registro del recepcionista.
     * @param contraseña la contraseña del recepcionista.
     */
    public Recepcionista(int idRecepcionista, String nombres, String apellidos, String correoElectronico,
            String telefono, String genero, int edad, String cedula, String fechaRegistro, String contraseña) {
        this.idRecepcionista = idRecepcionista;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.genero = genero;
        this.edad = edad;
        this.cedula = cedula;
        this.fechaRegistro = fechaRegistro;
        this.contraseña = contraseña;
    }

    public int getIdRecepcionista() {
        return idRecepcionista;
    }

    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
