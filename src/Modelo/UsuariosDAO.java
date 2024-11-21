package Modelo;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author sebas
 */
public class UsuariosDAO {

    DatabaseConnection c = new DatabaseConnection();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    public int agregar(Usuarios u) {

        String mySQL = "insert into users (nombre, apellido, cedula, correo, genero, numero_telefono, contraseña) values (?,?,?,?,?,?,?)";

        try {

            conn = c.conectar();
            ps = conn.prepareStatement(mySQL);
            ps.setString(1, u.getNombre());
            ps.setString(2, u.getApellido());
            ps.setString(3, u.getCedula());
            ps.setString(4, u.getCorreo());
            ps.setString(5, u.getGenero());
            ps.setString(6, u.getNumeroTelefono());
            ps.setString(7, u.getContraseña());
            ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al tratar de insertar datos: " + e);
        }
        return 1;
    }
}
