package Modelo;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    String url = "jdbc:mysql://localhost:3307/RecetasElectronicas1";
    String user = "root";
    String passw = "JohanD1024**";
    private Connection connection;

     public void conectar() { 
        try {
            // Establecer la conexión y asignarla a la variable de instancia 'connection'
            this.connection = DriverManager.getConnection(url, user, passw); 
            System.out.println("La conexión fue hecha de forma exitosa.");
        } catch (SQLException e) {
            System.out.println("Lo sentimos, hubo un error al intentar conectarnos.");
            e.printStackTrace(); 
        }
    }
    
    // Método para obtener la conexión
    public Connection getConnection() {
        return this.connection;  // Devolver la conexión de la instancia
    }
}

