package Modelo;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * La clase {@code CitasDAO} se encarga de gestionar las operaciones
 * relacionadas con la base de datos para la entidad {@code Citas}, como la
 * inserción de nuevas citas.
 */
public class CitasDAO {
         DatabaseConnection dbConnection = new DatabaseConnection();
    /**
     * Registra una nueva cita en la base de datos.
     *
     * Este método recibe la información de la cita (id del paciente, id del
     * doctor, fecha, hora y motivo de la consulta) y la inserta en la tabla
     * {@code Citas}.
     *
     * @param nombrePaciente el nombre del paciente que solicita la cita.
     * @param nombreDoctor el nombre del doctor asignado a la cita.
     * @param fechaCitaAgendada la fecha en la que se llevará a cabo la cita.
     * @param hora la hora en la que se llevará a cabo la cita.
     * @param motivoConsulta el motivo de la consulta para la cita.
     * @return un mensaje indicando si la cita fue registrada exitosamente o si
     * ocurrió un error.
     */
    public String agendarCita(String nombrePaciente, String nombreDoctor, String fechaCitaAgendada, String hora, String motivoConsulta) {
        String query = "INSERT INTO Citas (id_paciente, id_doctor, fecha_cita_agendada, hora, motivo_consulta) "
                + "VALUES ((SELECT id_paciente FROM Paciente WHERE CONCAT (nombre, ' ', apellido) = ?), "
                + "(SELECT id_doctor FROM Doctores WHERE CONCAT (nombre, ' ', apellidos) = ?), ?, ?, ?)";

        // Usamos try-with-resources para asegurar que la conexión y el PreparedStatement se cierren automáticamente
        DatabaseConnection dbConnection = new DatabaseConnection();
        try (Connection conn = dbConnection.conectar(); PreparedStatement ps = conn.prepareStatement(query)) {

            // Seteamos los valores del PreparedStatement
            ps.setString(1, nombrePaciente);
            ps.setString(2, nombreDoctor);
            ps.setString(3, fechaCitaAgendada);
            ps.setString(4, hora);
            ps.setString(5, motivoConsulta);

            // Ejecutar el INSERT y obtener el número de filas afectadas
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                return "Cita agendada!";
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return "Error al agendar la cita: " + e.getMessage();
        }
        return "No se pudo agendar la cita.";
    }

    public String cargarCitas(JTable tablaCitas) {
    String query = "SELECT CONCAT (P.nombre, ' ', P.apellido) AS nombre_paciente, "
            + "CONCAT(D.nombre, ' ', D.apellidos) AS nombre_completo_doctor, "
            + "C.estado AS estado_cita, "
            + "C.motivo_consulta, "
            + "D.especialidad "
            + "FROM Citas C "
            + "JOIN Paciente P ON P.id_paciente = C.id_paciente "
            + "JOIN Doctores D ON D.id_doctor = C.id_doctor";

    try {
        Connection conn = dbConnection.conectar();  // Obtener la conexión
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tablaCitas.getModel();
        model.setRowCount(0);  // Limpiar la tabla

        // Llenar la tabla con los datos obtenidos
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("nombre_paciente"),
                rs.getString("nombre_completo_doctor"),
                rs.getString("estado_cita"),
                rs.getString("motivo_consulta"),
                rs.getString("especialidad")
            });
        }

        rs.close();
        ps.close();
        conn.close();
        return "Tabla llenada de manera exitosa";
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error al cargar citas: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        return "Error al llenar la tabla";
    }
}

     /**
     * Carga las doctores desde la base de datos en un JComboBox.
     * 
     * @param cmbDoctores JComboBox donde se llenarán los doctores.
     */
    public static void cargarDoctores(JComboBox<String> cmbDoctores) {
        DatabaseConnection c = new DatabaseConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = c.conectar();
            String query = "SELECT CONCAT (nombre, ' ', apellidos) AS nombre_completo FROM doctores";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            cmbDoctores.removeAllItems();

            while (rs.next()) {
                cmbDoctores.addItem(rs.getString("nombre_completo"));
                cmbDoctores.setSelectedIndex(-1);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar doctores: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
