package Modelo;

/**
 *
 * @author sebas
 */
public class TestDB {

    public static void main(String[] args) {
        DatabaseConnection dbt = new DatabaseConnection();
        dbt.conectar();
    }

}
