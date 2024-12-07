package Modelo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.DatabaseConnection;
import java.sql.ResultSet;
import java.sql.*;

/**
 * Clase DAO (Data Access Object) para realizar operaciones en la base de datos
 * relacionadas con los pacientes. Proporciona métodos para registrar un
 * paciente y obtener el nombre de un paciente por su correo.
 *
 * @author Sebastian
 */
public class PacienteDAO {

    private Connection conn;

    // Constructor que recibe la conexión
    DatabaseConnection dbConnection = new DatabaseConnection();
    Connection Con;
    PreparedStatement ps; // Para preparar y ejecutar sentencias SQL
    ResultSet rs; // Para manejar resultados de consultas SELECT
    Paciente P = new Paciente();

    /**
     * Constructor por defecto.
     */
    public PacienteDAO() {
    }

    /**
     * Constructor que inicializa la conexión con la base de datos.
     *
     * @param dbConnection Objeto de tipo DatabaseConnection para establecer la
     * conexión a la base de datos.
     */
    public PacienteDAO(DatabaseConnection dbConnection) {
        this.conn = dbConnection.getConnection();
    }

    /**
     * Registra un nuevo paciente en la base de datos.
     *
     * @param p Objeto de tipo Paciente que contiene la información del paciente
     * a registrar.
     * @return Un valor constante (1) si la inserción fue exitosa, de lo
     * contrario, un valor que indica el error.
     * @throws SQLException Si ocurre un error al ejecutar la sentencia SQL.
     */
    public int registrarPaciente(Paciente p) throws SQLException {
        String query = "INSERT INTO Paciente ("
                + "    nombre, apellido, numero_telefono, cedula, correo, genero, estatura, "
                + "    peso, contraseña, nombre_seguro, enfermedades, antecedentes_medicos, "
                + "    tipo_sangre, fecha_de_nacimiento,direccion"
                + ")"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?);";

        try {
            Con = dbConnection.conectar();
            ps = Con.prepareStatement(query);

            ps.setString(1, p.nombre);                // Set nombre
            ps.setString(2, p.apellido);              // Set apellido
            ps.setString(3, p.numeroTelefono);        // Set numero_telefono
            ps.setString(4, p.cedula);                // Set cedula
            ps.setString(5, p.correo);                // Set correo
            ps.setString(6, p.genero);                // Set genero
            ps.setDouble(7, p.estatura);              // Set estatura
            ps.setDouble(8, p.peso);                  // Set peso
            ps.setString(9, p.contraseña);            // Set contraseña
            ps.setString(10, p.nombreSeguro);         // Set nombre_seguro
            ps.setString(11, p.enfermedades);         // Set enfermedades
            ps.setString(12, p.antecedentesMedicos);  // Set antecedentes_medicos
            ps.setString(13, p.tipoSangre);           // Set tipo_sangre
            ps.setString(14, p.fechaNacimiento);      // Set fecha_nacimiento
            ps.setString(15, p.direccionFisica);      // Set direccion

            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al tratar de insertar datos: " + e);
        }

        return 1;  // Retorna un valor constante.
    }

    /**
     * Obtiene el nombre de un paciente dado su correo electrónico.
     *
     * @param correo Correo electrónico del paciente cuya información se desea
     * obtener.
     * @return El nombre del paciente si se encuentra en la base de datos, o
     * null si no se encuentra.
     */
    public String obtenerNombrePacientePorCorreo(String correo) {
        String nombrePaciente = null;
        String query = "SELECT nombre FROM Paciente WHERE correo = ?";
        Con = dbConnection.conectar();
        try (PreparedStatement ps = Con.prepareStatement(query)) {
            ps.setString(1, correo);  // Establece el correo en la consulta
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    nombrePaciente = rs.getString("nombre");  // Obtiene el nombre
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nombrePaciente;  // Retorna el nombre, o null si no lo encontró
    }

    public String agendarCita(String nombrePaciente, String nombreDoctor, String fechaCitaAgendada, String hora, String motivoConsulta) {
        String query = "INSERT INTO Citas (id_paciente, id_doctor, fecha_cita_agendada, hora, motivo_consulta) "
                + "VALUES ((SELECT id_paciente FROM Paciente WHERE nombre = ?), "
                + "(SELECT id_doctor FROM Doctor WHERE nombre = ?), ?, ?, ?)";

        try (Connection conn = dbConnection.conectar(); PreparedStatement ps = conn.prepareStatement(query)) {

            // Seteando los valores del PreparedStatement
            ps.setString(1, nombrePaciente);
            ps.setString(2, nombreDoctor);
            ps.setString(3, fechaCitaAgendada);
            ps.setString(4, hora);
            ps.setString(5, motivoConsulta);

            // Ejecutar el INSERT y obtener el número de filas afectadas
            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                return "Cita agendada exitosamente.";
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return "Error al agendar la cita: " + e.getMessage();
        }
        return "No se pudo agendar la cita.";
    }
}
