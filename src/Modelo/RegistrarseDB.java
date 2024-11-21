
package Modelo;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Modelo.DatabaseConnection; 



public class RegistrarseDB {
    
    private Connection conn;


    // Constructor que recibe la conexión
    
  DatabaseConnection dbConnection = new DatabaseConnection();

   public RegistrarseDB(DatabaseConnection dbConnection) {
        this.conn = dbConnection.getConnection();
    }


  
    public void registrarUsuario(String nombre, String apellido, String correo, String numero_telefono, String cedula, String contraseña ,String genero) throws SQLException {
        String query = "INSERT INTO Paciente (nombre, apellido, correo, numero_telefono, cedula, contraseña,genero) VALUES (?, ?, ?, ?, ?, ?,?)";

        try 
            //Class.forName("com.mysql.jdbc.Driver");
           //sqlcoon=DriverManager.getConnection(url, root, JohanD1024**)
            (PreparedStatement pst = conn.prepareStatement(query)) {
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

