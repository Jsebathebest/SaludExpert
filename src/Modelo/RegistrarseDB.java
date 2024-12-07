package Modelo;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.DatabaseConnection; 

/**
 * Clase que maneja la inserción de datos de usuario en la base de datos.
 * Proporciona un método para registrar un nuevo usuario (paciente) en la base de datos.
 * 
 * @author Sebastian
 */
public class RegistrarseDB {
    
    private Connection conn;

    /**
     * Constructor que recibe la conexión a la base de datos.
     * 
     * @param dbConnection la instancia de la clase DatabaseConnection.
     */
    public RegistrarseDB(DatabaseConnection dbConnection) {
        this.conn = dbConnection.getConnection();
    }

    /**
     * Registra un nuevo usuario en la base de datos.
     * 
     * @param nombre el nombre del paciente.
     * @param apellido el apellido del paciente.
     * @param correo el correo electrónico del paciente.
     * @param numero_telefono el número de teléfono del paciente.
     * @param cedula la cédula del paciente.
     * @param contraseña la contraseña del paciente.
     * @param genero el género del paciente.
     * @throws SQLException si ocurre un error al ejecutar la consulta SQL.
     */
    public void registrarUsuario(String nombre, String apellido, String correo, String numero_telefono, 
                                 String cedula, String contraseña, String genero) throws SQLException {
        String query = "INSERT INTO Paciente (nombre, apellido, correo, numero_telefono, cedula, contraseña, genero) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (PreparedStatement pst = conn.prepareStatement(query)) {
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, correo);
            pst.setString(4, numero_telefono);
            pst.setString(5, cedula);
            pst.setString(6, contraseña);
            pst.setString(7, genero);

            pst.executeUpdate();
        }
    }
}
