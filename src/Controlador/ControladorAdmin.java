package Controlador;

import Modelo.AdminDAO;
import Modelo.DatabaseConnection;
import javax.swing.JComboBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author sebas
 */
public class ControladorAdmin {
    private AdminDAO aDAO; //Atributo de tipo AdminDAO

    public ControladorAdmin() {
        this.aDAO = new AdminDAO(); // Inicializa el DAO
    }
    
    //Pendiente crear validaciones
    public static void cargarEspecialidades(JComboBox<String> cmbEspecialidad) {
        // Conexión a la base de datos (asegúrate de tener configurada tu conexión)
        DatabaseConnection c = new DatabaseConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Suponiendo que tienes una clase de conexión llamada DatabaseConnection
            conn = c.conectar();
            
            // Consulta SQL para obtener los nombres de las especialidades
            String query = "SELECT nombre FROM especialidades";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            // Limpiar el JComboBox para evitar duplicados si ya contiene elementos
            cmbEspecialidad.removeAllItems();

            // Llenar el JComboBox con los nombres de especialidades
            while (rs.next()) {
                String especialidad = rs.getString("nombre");
                cmbEspecialidad.addItem(especialidad);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // Cerrar los recursos de la base de datos
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
