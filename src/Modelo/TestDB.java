package Modelo;

/**
 * Clase de prueba para verificar la conexión a la base de datos.
 * Esta clase ejecuta una conexión a la base de datos utilizando la clase DatabaseConnection.
 * 
 * @author Sebastian
 */
public class TestDB {

    /**
     * Método principal que ejecuta la prueba de conexión a la base de datos.
     * Crea una instancia de DatabaseConnection y establece una conexión.
     * 
     * @param args los argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        DatabaseConnection dbt = new DatabaseConnection();
        dbt.conectar();
    }
}
