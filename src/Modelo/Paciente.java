package Modelo;

import java.util.Date;

/**
 * La clase {@code Paciente} representa la información personal y médica de los pacientes
 * dentro del sistema de gestión médica. Contiene datos relacionados con su contacto, historial
 * médico y detalles de su seguro médico.
 */
public class Paciente {

    // Atributos de la clase
    int idPaciente;               // Identificador único del paciente (autogenerado)
    String nombre;                // Nombre del paciente
    String apellido;              // Apellido del paciente
    String numeroTelefono;        // Número de teléfono del paciente
    String tipoSangre;            // Tipo de sangre del paciente
    String numeroEmergencia;      // Número de emergencia del paciente
    String correo;                // Correo electrónico del paciente
    String cedula;                // Cédula única del paciente
    Date fechaRegistro;           // Fecha de registro del paciente en el sistema
    String fechaNacimiento;       // Fecha de nacimiento del paciente
    String genero;                // Género del paciente (Femenino o Masculino)
    String direccionFisica;       // Dirección física del paciente
    String nombreSeguro;          // Nombre del seguro médico del paciente
    String codigoSeguro;          // Código del seguro médico del paciente
    String enfermedades;          // Enfermedades conocidas del paciente
    String antecedentesMedicos;   // Antecedentes médicos del paciente
    double peso;                  // Peso del paciente en kilogramos
    int estatura;                 // Estatura del paciente en centímetros
    String contraseña;            // Contraseña para el acceso del paciente al sistema

    /**
     * Constructor vacío para la clase {@code Paciente}.
     * Este constructor crea una instancia sin inicializar atributos.
     */
    public Paciente() {}

    /**
     * Constructor que inicializa los atributos de la clase {@code Paciente}.
     *
     * @param idPaciente          Identificador único del paciente
     * @param nombre              Nombre del paciente
     * @param apellido            Apellido del paciente
     * @param numeroTelefono      Número de teléfono del paciente
     * @param tipoSangre          Tipo de sangre del paciente
     * @param numeroEmergencia    Número de emergencia del paciente
     * @param correo              Correo electrónico del paciente
     * @param cedula              Cédula única del paciente
     * @param fechaNacimiento     Fecha de nacimiento del paciente
     * @param genero              Género del paciente (Femenino o Masculino)
     * @param direccionFisica     Dirección física del paciente
     * @param nombreSeguro        Nombre del seguro médico del paciente
     * @param codigoSeguro        Código del seguro médico del paciente
     * @param enfermedades        Enfermedades conocidas del paciente
     * @param antecedentesMedicos Antecedentes médicos del paciente
     * @param peso                Peso del paciente en kilogramos
     * @param estatura            Estatura del paciente en centímetros
     * @param contraseña          Contraseña para el acceso del paciente
     */
    public Paciente(int idPaciente, 
                    String nombre, 
                    String apellido, 
                    String numeroTelefono, 
                    String tipoSangre,
                    String numeroEmergencia, 
                    String correo, 
                    String cedula,  
                    String fechaNacimiento,
                    String genero, 
                    String direccionFisica, 
                    String nombreSeguro, 
                    String codigoSeguro,
                    String enfermedades, 
                    String antecedentesMedicos,
                    double peso,
                    int estatura,
                    String contraseña) {
        this.idPaciente = idPaciente;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroTelefono = numeroTelefono;
        this.tipoSangre = tipoSangre;
        this.numeroEmergencia = numeroEmergencia;
        this.correo = correo;
        this.cedula = cedula;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.direccionFisica = direccionFisica;
        this.nombreSeguro = nombreSeguro;
        this.codigoSeguro = codigoSeguro;
        this.enfermedades = enfermedades;
        this.antecedentesMedicos = antecedentesMedicos;
        this.peso = peso;
        this.estatura = estatura;
        this.contraseña = contraseña;
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
      public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}