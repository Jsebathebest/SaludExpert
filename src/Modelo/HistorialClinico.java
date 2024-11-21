package Modelo;

import java.util.Date;

/**
 *
 * @author sebas
 */
public class HistorialClinico {

    //Crear atributos
    int idHistorialClinico;
    int idPaciente;// Relación con Paciente
    Date fechaConsulta;
    String diagnostico;
    String examenesRealizados;
    String tratamientoPreescrito;

    //Crear constructor
    public HistorialClinico() {
    }

    //Llenar constructor
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
    
    //Agregar Getters y Setters

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
