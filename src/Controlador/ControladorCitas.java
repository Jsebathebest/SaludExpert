package Controlador;

import Modelo.CitasDAO;
import javax.swing.JTable;

public class ControladorCitas {

    private CitasDAO citasDAO;

    public ControladorCitas() {
        this.citasDAO = new CitasDAO();  // Crear instancia del DAO
    }

    // Método para manejar la solicitud de agendar una cita
    public String agendarCita(String nombrePaciente, String nombreDoctor, String fechaCitaAgendada, String hora, String motivoConsulta) {
        // Llamamos al método del DAO para insertar la cita
        return citasDAO.agendarCita(nombrePaciente, nombreDoctor, fechaCitaAgendada, hora, motivoConsulta);
    }
    //Metodo para llenar tabla de citas
    public String llenarTablaCitas(JTable tablaCitas){
        //Llamamos al metodo del DAO para llenar la tabla
        return citasDAO.cargarCitas(tablaCitas);
    }
}
