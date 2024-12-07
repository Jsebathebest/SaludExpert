package Modelo;

import java.util.Date;

/**
 * La clase {@code HistorialClinico} almacena información detallada sobre el historial médico
 * de un paciente, incluyendo datos de consultas, diagnósticos, exámenes realizados y tratamientos prescritos.
 */
public class HistorialClinico {

    // Atributos de la clase
    int idHistorialClinico;        // Identificador único del historial clínico
    int idPaciente;                // Relación con el paciente (referencia a la tabla Paciente)
    Date fechaConsulta;            // Fecha de la consulta médica
    String diagnostico;            // Diagnóstico dado al paciente en la consulta
    String examenesRealizados;     // Exámenes realizados durante la consulta
    String tratamientoPreescrito;  // Tratamiento prescrito al paciente

    /**
     * Constructor vacío para la clase {@code HistorialClinico}.
     * Este constructor crea una instancia sin inicializar atributos.
     */
    public HistorialClinico() {}

    /**
     * Constructor que inicializa los atributos de la clase {@code HistorialClinico}.
     *
     * @param idHistorialClinico    Identificador único del historial clínico
     * @param idPaciente            Identificador del paciente relacionado
     * @param fechaConsulta         Fecha de la consulta médica
     * @param diagnostico           Diagnóstico dado al paciente
     * @param examenesRealizados    Exámenes realizados al paciente
     * @param tratamientoPreescrito Tratamiento prescrito para el paciente
     */
    public HistorialClinico(int idHistorialClinico,
                            int idPaciente,
                            Date fechaConsulta,
                            String diagnostico,
                            String examenesRealizados,
                            String tratamientoPreescrito) {
        this.idHistorialClinico = idHistorialClinico;
        this.idPaciente = idPaciente;
        this.fechaConsulta = fechaConsulta;
        this.diagnostico = diagnostico;
        this.examenesRealizados = examenesRealizados;
        this.tratamientoPreescrito = tratamientoPreescrito;
    }

    // Métodos Getters y Setters
    public int getIdHistorialClinico() {
        return idHistorialClinico;
    }

    public void setIdHistorialClinico(int idHistorialClinico) {
        this.idHistorialClinico = idHistorialClinico;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getExamenesRealizados() {
        return examenesRealizados;
    }

    public void setExamenesRealizados(String examenesRealizados) {
        this.examenesRealizados = examenesRealizados;
    }

    public String getTratamientoPreescrito() {
        return tratamientoPreescrito;
    }

    public void setTratamientoPreescrito(String tratamientoPreescrito) {
        this.tratamientoPreescrito = tratamientoPreescrito;
    }
}