package Modelo;

import java.sql.*;

/**
 * Clase UsuariosDAO.
 * Proporciona métodos para interactuar con la base de datos relacionados con la tabla 'users'.
 */
public class UsuariosDAO {

    // Instancia para manejar la conexión a la base de datos
    DatabaseConnection c = new DatabaseConnection();
    Connection conn; // Objeto para la conexión
    PreparedStatement ps; // Para preparar y ejecutar sentencias SQL
    ResultSet rs; // Para manejar resultados de consultas SELECT

    /**
     * Método para agregar un nuevo usuario a la base de datos.
     *
     * @param u Un objeto de tipo Usuarios que contiene la información del usuario a agregar.
     * @return Un valor entero (1 si se ejecuta correctamente, aunque no se verifica el éxito real en este caso).
     */
    public int agregar(Usuarios u) {

        // Sentencia SQL para insertar un nuevo usuario en la tabla 'users'
        String mySQL = "INSERT INTO users (nombre, "
                + "apellido, "
                + "cedula, "
                + "correo, "
                + "genero, "
                + "numero_telefono, "
                + "contraseña) VALUES (?,?,?,?,?,?,?)";

        try {
            // Establecer conexión con la base de datos
            conn = c.conectar();

            // Preparar la sentencia SQL
            ps = conn.prepareStatement(mySQL);

            // Asignar los valores correspondientes a cada parámetro de la consulta
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getCedula());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getGenero());
            ps.setString(6, u.getNumeroTelefono());
            ps.setString(7, u.getContraseña());

            // Ejecutar la consulta
            ps.executeUpdate();

        } catch (SQLException e) {
            // Manejo de excepciones
            System.out.println("Error al tratar de insertar datos: " + e);
        }

        // Retorna un valor constante (puedes mejorarlo devolviendo un indicador más informativo)
        return 1;
    }
}
