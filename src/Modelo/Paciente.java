package Modelo;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Paciente {

    //Crear atributos
    int idPaciente;//Unico, autogenerado, Primary Key
    String nombre;
    String apellido;
    String numeroTelefono; //Lleva mascara
    String tipoSangre;
    String numeroEmergencia; //Lleva mascara
    String correo; //Lleva mascara
    String cedula; //Unico
    Date fechaRegistro; //Lleva mascara (sugerencia)
    Date fechaNacimiento; //Lleva mascara (sugerencia)
    String genero; //Femenino/Masculino
    String direccionFisica;
    String nombreSeguro;
    String codigoSeguro;
    String enfermedades;
    String antecedentesMedicos;

    //Crear constructor vacio
    public Paciente() {
    }

    //Llenar constructor
    public Paciente(int idPaciente, 
            String nombre, 
            String apellido, 
            String numeroTelefono, 
            String tipoSangre,
            String numeroEmergencia, 
            String correo, 
            String cedula, 
            Date fechaRegistro, 
            Date fechaNacimiento,
            String genero, 
            String direccionFisica, 
            String nombreSeguro, 
            String codigoSeguro,
            String enfermedades, 
            String antecedentesMedicos) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.tipoSangre = tipoSangre;
        this.numeroEmergencia = numeroEmergencia;
        this.correo = correo;
        this.cedula = cedula;
        this.fechaRegistro = fechaRegistro;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccionFisica = direccionFisica;
        this.nombreSeguro = nombreSeguro;
        this.codigoSeguro = codigoSeguro;
        this.enfermedades = enfermedades;
        this.antecedentesMedicos = antecedentesMedicos;
    }

    //agregar Getters y Setters
    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
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

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    public String getNumeroEmergencia() {
        return numeroEmergencia;
    }

    public void setNumeroEmergencia(String numeroEmergencia) {
        this.numeroEmergencia = numeroEmergencia;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDireccionFisica() {
        return direccionFisica;
    }

    public void setDireccionFisica(String direccionFisica) {
        this.direccionFisica = direccionFisica;
    }

    public String getNombreSeguro() {
        return nombreSeguro;
    }

    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }

    public String getCodigoSeguro() {
        return codigoSeguro;
    }

    public void setCodigoSeguro(String codigoSeguro) {
        this.codigoSeguro = codigoSeguro;
    }

    public String getEnfermedades() {
        return enfermedades;
    }

    public void setEnfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }

    public String getAntecedentesMedicos() {
        return antecedentesMedicos;
    }

    public void setAntecedentesMedicos(String antecedentesMedicos) {
        this.antecedentesMedicos = antecedentesMedicos;
    }

}
