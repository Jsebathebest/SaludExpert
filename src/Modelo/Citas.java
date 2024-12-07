package Modelo;

/**
 * La clase {@code Citas} representa una cita médica dentro del sistema de gestión
 * de citas. Contiene información sobre el paciente, el doctor, la fecha, la hora,
 * el motivo de la consulta y la especialidad asociada a la cita.
 */
public class Citas {

    // Atributos de la clase
    int idCita;
    int idPaciente;
    int idDoctor;
    String fecha;
    String hora;
    String motivoConsulta;
    int id_especialidad;

    /**
     * Constructor por defecto. Crea una nueva instancia de {@code Citas} sin inicializar sus atributos.
     */
    public Citas() {}

    /**
     * Constructor que inicializa una nueva instancia de {@code Citas} con los parámetros proporcionados.
     *
     * @param idCita        el identificador único de la cita.
     * @param idPaciente    el identificador único del paciente que tiene la cita.
     * @param idDoctor      el identificador único del doctor asignado a la cita.
     * @param id_especialidad el identificador de la especialidad médica asociada a la cita.
     * @param fecha         la fecha en la que se llevará a cabo la cita (en formato String).
     * @param hora          la hora en la que se llevará a cabo la cita (en formato String).
     * @param motivoConsulta el motivo de la consulta que solicita el paciente.
     */
    public Citas(int idCita, int idPaciente, int idDoctor, int id_especialidad, 
                 String fecha, String hora, String motivoConsulta) {
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.fecha = fecha;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
        this.id_especialidad = id_especialidad;
    }

    // Getters y Setters

    /**
     * Obtiene el identificador único de la cita.
     *
     * @return el identificador de la cita.
     */
    public int getIdCita() {
        return idCita;
    }

    /**
     * Establece el identificador único de la cita.
     *
     * @param idCita el identificador de la cita.
     */
    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    /**
     * Obtiene el identificador único del paciente que tiene la cita.
     *
     * @return el identificador del paciente.
     */
    public int getIdPaciente() {
        return idPaciente;
    }

    /**
     * Establece el identificador único del paciente que tiene la cita.
     *
     * @param idPaciente el identificador del paciente.
     */
    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * Obtiene el identificador único del doctor asignado a la cita.
     *
     * @return el identificador del doctor.
     */
    public int getIdDoctor() {
        return idDoctor;
    }

    /**
     * Establece el identificador único del doctor asignado a la cita.
     *
     * @param idDoctor el identificador del doctor.
     */
    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    /**
     * Obtiene la fecha de la cita.
     *
     * @return la fecha de la cita en formato String.
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Establece la fecha de la cita.
     *
     * @param fecha la fecha de la cita.
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    /**
     * Obtiene la hora de la cita.
     *
     * @return la hora de la cita en formato String.
     */
    public String getHora() {
        return hora;
    }

    /**
     * Establece la hora de la cita.
     *
     * @param hora la hora de la cita.
     */
    public void setHora(String hora) {
        this.hora = hora;
    }

    /**
     * Obtiene el motivo de la consulta.
     *
     * @return el motivo de la consulta.
     */
    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    /**
     * Establece el motivo de la consulta.
     *
     * @param motivoConsulta el motivo de la consulta.
     */
    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    /**
     * Obtiene el identificador de la especialidad médica asociada a la cita.
     *
     * @return el identificador de la especialidad médica.
     */
    public int getId_especialidad() {
        return id_especialidad;
    }

    /**
     * Establece el identificador de la especialidad médica asociada a la cita.
     *
     * @param id_especialidad el identificador de la especialidad médica.
     */
    public void setId_especialidad(int id_especialidad) {
        this.id_especialidad = id_especialidad;
    }
}