
package Modelo;
import java.sql.*;

public class UsuarioDB {
    
    private DatabaseConnection dbConnection = new DatabaseConnection();

    // Método para validar usuario y contraseña
    public boolean validarCredenciales(String usuario, String contrasena) {
        boolean esValido = false;

        try (Connection con = dbConnection.conectar()) { // Reutilizamos la conexión
            if (con != null) {
                
              // Consulta preparada para evitar inyección SQL evitar usar usario = usario o contraseña = contraña
                String sql = "SELECT * FROM usuario WHERE usuario = ? AND contrasena = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, usuario);   
                pstmt.setString(2, contrasena); 

                // Ejecutamos la consulta
                ResultSet rs = pstmt.executeQuery();
                esValido = rs.next(); 

                
                rs.close();
                
            }
        } catch (SQLException e) {
            System.out.println("Error al validar credenciales: " + e.getMessage());
        }

        return esValido;
    }
}
