package Modelo;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Doctores {

    //Crear atributos
    int idDoctor;//Autogenerado
    String nombres;
    String apellidos;
    String especialidad;
    String telefono;//Lleva mascara
    String correoElectronico;//Lleva mascara
    String fechaRegistro;
    String numeroSecuator;
    String horarioTrabajo;
    String numeroConsultorio;
    int edad;
    String genero;
    String cedula;
    String contraseña;

    //Crear constructor vacio
    public Doctores() {
    }

    //Llenar constructor
    public Doctores(int idDoctor,
            String nombres,
            String apellidos,
            String especialidad,
            String telefono,
            String correoElectronico,
            String fechaRegistro,
            String numeroSecuator,
            String horarioTrabajo,
            String numeroConsultorio,
            int edad,
            String genero,
            String cedula,
            String contraseña) {
        this.idDoctor = idDoctor;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaRegistro = fechaRegistro;
        this.numeroSecuator = numeroSecuator;
        this.horarioTrabajo = horarioTrabajo;
        this.numeroConsultorio = numeroConsultorio;
        this.edad = edad;
        this.genero = genero;
        this.cedula = cedula;
        this.contraseña = contraseña;
    }

    //Agregar Getters y Setters
    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
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

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public String getNumeroSecuator() {
        return numeroSecuator;
    }

    public void setNumeroSecuator(String numeroSecuator) {
        this.numeroSecuator = numeroSecuator;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public String getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(String numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
}
