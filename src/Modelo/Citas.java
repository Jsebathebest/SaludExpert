package Modelo;

import java.util.Date;

/**
 *
 * @author Sebastian
 */
public class Citas {
    
    //Crear atributos
    int idCita; // Clave primaria
    int idPaciente;// Relación con Paciente
    int idDoctor;// Relación con Doctores
    Date fecha;
    Date fechaCitaAgendada;
    String hora;
    String motivoConsulta;
    int doctorAsignado;
    String estado; //Agendada, Cancelada, etc.

    // Crear constructor
    public Citas(){}

    // Llenar constructor
    public Citas( int idCita,
    int idPaciente,
    int idDoctor,
    Date fecha,
    Date fechaCitaAgendada,
    String hora,
    String motivoConsulta,
    int doctorAsignado,
    String estado){
        this.idCita = idCita;
        this.idPaciente = idPaciente;
        this.idDoctor = idDoctor;
        this.fecha = fecha;
        this.fechaCitaAgendada = fechaCitaAgendada;
        this.hora = hora;
        this.motivoConsulta = motivoConsulta;
        this.doctorAsignado = doctorAsignado;
        this.estado = estado;
    }
    
    //Agregar Getters y Setters

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public int getIdDoctor() {
        return idDoctor;
    }

    public void setIdDoctor(int idDoctor) {
        this.idDoctor = idDoctor;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFechaCitaAgendada() {
        return fechaCitaAgendada;
    }

    public void setFechaCitaAgendada(Date fechaCitaAgendada) {
        this.fechaCitaAgendada = fechaCitaAgendada;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(String motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public int getDoctorAsignado() {
        return doctorAsignado;
    }

    public void setDoctorAsignado(int doctorAsignado) {
        this.doctorAsignado = doctorAsignado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
