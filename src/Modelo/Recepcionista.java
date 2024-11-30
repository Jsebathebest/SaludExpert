package Modelo;

/**
 *
 * @author Sebastian
 */
public class Recepcionista {

    //Crear atributos
    int idRecepcionista; //Autogenerado
    String nombres;
    String apellidos;
    String correoElectronico; //Lleva nascara
    String telefono; //Lleva mascara
    String genero; //Femenino/Masculino
    int edad;
    String cedula; 
    String fechaRegistro;
    String contraseña;

    //Crear constructor vacio
    public Recepcionista() {
    }

    //Llenar constructor
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

    //Crear Getters y Setters
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
