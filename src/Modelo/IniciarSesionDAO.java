 package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IniciarSesionDAO {

    DatabaseConnection conectar = new DatabaseConnection();
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Obtiene la contraseña encriptada de un usuario a partir de su correo electrónico.
     * El método consulta tres tablas diferentes: `users`, `doctores` y `recepcionista`,
     * y retorna la primera coincidencia encontrada para el correo proporcionado.
     * 
     * Si el correo coincide en más de una tabla, se retornará la contraseña
     * de la primera tabla en el orden definido por la consulta SQL (users -> doctores -> recepcionista).
     *
     * En caso de error durante la ejecución de la consulta, el método registrará
     * un mensaje en el log y retornará `null`.
     *
     * **Nota de Seguridad:** La contraseña retornada está encriptada, pero
     * es responsabilidad del desarrollador manejarla adecuadamente para evitar
     * exposición accidental.
     *
     * @param correo El correo electrónico del usuario cuya contraseña
     *               encriptada se desea obtener.
     * @return La contraseña encriptada del usuario si se encuentra una coincidencia,
     *         o `null` si no se encuentra o ocurre un error.
     */
public String obtenerContraseñaEncriptada(String correo) {
        String sql = "SELECT contraseña FROM users WHERE correo = ? "; // +
//                 "UNION SELECT contraseña FROM doctores WHERE correo = ? " +
//                 "UNION SELECT contraseña FROM recepcionista WHERE correo = ?";
        String contraseñaEncriptada = null;

        try (Connection conn = conectar.conectar(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, correo); 
//            ps.setString(2, correo); 
//            ps.setString(3, correo); 
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                contraseñaEncriptada = rs.getString("contraseña"); 
            }

        } catch (SQLException ex) {
            Logger.getLogger(IniciarSesionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }

        return contraseñaEncriptada; 
    }
 }