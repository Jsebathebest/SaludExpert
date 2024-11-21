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
     * Este metodo se encarga de listar un registro.El mismo devuelve un objeto
     * tipo arrayList.
     *
     * @param usuariof
     * @param clavef
     * @return datos
     */
    public boolean iniciarSesion(String correo, String contraseña) {
        conn = conectar.conectar();

        String sql = "select * from users where correo = ? and contraseña = ?";

        try {
            ps = conn.prepareStatement(sql);

            ps.setString(1, correo);
            ps.setString(2, contraseña);

            rs = ps.executeQuery();

            while (rs.next()) {
                conn.close();
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(IniciarSesionDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
}