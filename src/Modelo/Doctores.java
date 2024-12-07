package Modelo;

/**
 * La clase {@code Doctores} representa a los doctores en el sistema de gestión
 * de citas médicas. Contiene información detallada sobre cada doctor,
 * incluyendo su identificación, datos personales, especialidad, horario de
 * trabajo y otros atributos.
 */
public class Doctores {

    //Crear atributos 
    int idDoctor;//Autogenerado
    String nombres;
    String apellidos;
    String especialidad;
    String telefono;
    String correoElectronico;
    String fechaRegistro;
    String numeroSecuator;
    String horarioTrabajo;
    String numeroConsultorio;
    int edad;
    String genero;
    String cedula;
    String contraseña;

    /**
     * Constructor vacío para la clase {@code Doctores}. Crea una instancia de
     * la clase sin inicializar atributos.
     */
    public Doctores() {
    }

    /**
     * Constructor que inicializa los atributos de la clase {@code Doctores}.
     *
     * @param idDoctor Identificador único del doctor (autogenerado)
     * @param nombres Nombres del doctor
     * @param apellidos Apellidos del doctor
     * @param especialidad Especialidad médica del doctor
     * @param telefono Teléfono del doctor
     * @param correoElectronico Correo electrónico del doctor
     * @param fechaRegistro Fecha de registro del doctor
     * @param numeroSecuator Número de secuatro del doctor
     * @param horarioTrabajo Horario de trabajo del doctor
     * @param numeroConsultorio Número de consultorio del doctor
     * @param edad Edad del doctor
     * @param genero Género del doctor
     * @param cedula Cédula de identidad del doctor
     * @param contraseña Contraseña del doctor
     */
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
