package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * La clase AdminDAO gestiona las operaciones de acceso a datos para las entidades
 * relacionadas con el sistema médico, incluyendo Doctores, Recepcionistas y Especialidades.
 */
public class AdminDAO {

    private final DatabaseConnection c = new DatabaseConnection();
    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    /**
     * Agrega un nuevo doctor a la base de datos.
     * 
     * @param d un objeto de tipo {@link Doctores} que contiene la información del doctor.
     * @return un entero indicando el éxito de la operación (1 si tuvo éxito).
     */
    public int agregarDoctor(Doctores d) {
        String mySQL = "insert into doctores (nombre, apellidos, especialidad, telefono, "
                     + "correo, fecha_registro, Edad, Genero, Cedula, contraseña) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            conn = c.conectar();
            ps = conn.prepareStatement(mySQL);
            ps.setString(1, d.getNombres());
            ps.setString(2, d.getApellidos());
            ps.setString(3, d.getEspecialidad());
            ps.setString(4, d.getTelefono());
            ps.setString(5, d.getCorreoElectronico());
            ps.setString(6, d.getFechaRegistro());
            ps.setInt(7, d.getEdad());
            ps.setString(8, d.getGenero());
            ps.setString(9, d.getCedula());
            ps.setString(10, d.getContraseña());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al tratar de insertar datos: " + e);
        }
        return 1;
    }

    /**
     * Agrega un nuevo recepcionista a la base de datos.
     * 
     * @param r un objeto de tipo {@link Recepcionista} que contiene la información del recepcionista.
     * @return un entero indicando el éxito de la operación (1 si tuvo éxito).
     */
    public int agregarRecepcionista(Recepcionista r) {
        String mySQL = "insert into recepcionista (nombre, apellidos, correo, telefono, genero, "
                     + "Edad, Cedula, fecha_registro, contraseña) values (?,?,?,?,?,?,?,?,?)";
        try {
            conn = c.conectar();
            ps = conn.prepareStatement(mySQL);
            ps.setString(1, r.getNombres());
            ps.setString(2, r.getApellidos());
            ps.setString(3, r.getCorreoElectronico());
            ps.setString(4, r.getTelefono());
            ps.setString(5, r.getGenero());
            ps.setInt(6, r.getEdad());
            ps.setString(7, r.getCedula());
            ps.setString(8, r.getFechaRegistro());
            ps.setString(9, r.getContraseña());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al tratar de insertar datos: " + e);
        }
        return 1;
    }

    /**
     * Agrega una nueva especialidad a la base de datos.
     * 
     * @param esp un objeto de tipo {@link Especialidades} que contiene el nombre y descripción de la especialidad.
     * @return un entero indicando el éxito de la operación (1 si tuvo éxito).
     */
    public int agregarEspecialidad(Especialidades esp) {
        String mySQL = "insert into especialidades (nombre, descripcion) values (?,?)";
        try {
            conn = c.conectar();
            ps = conn.prepareStatement(mySQL);
            ps.setString(1, esp.getNombre());
            ps.setString(2, esp.getDescripcion());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al tratar de insertar datos: " + e);
        }
        return 1;
    }

    /**
     * Obtiene una lista de todos los doctores registrados en la base de datos.
     * 
     * @return una lista de objetos {@link Doctores}.
     */
    public List<Doctores> listarDoctores() {
        String sql = "SELECT id_doctor, nombre, apellidos, especialidad, telefono, correo, Cedula FROM doctores";
        List<Doctores> listaDoctores = new ArrayList<>();
        try (Connection con = c.conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Doctores doctor = new Doctores();
                doctor.setIdDoctor(rs.getInt("id_doctor"));
                doctor.setNombres(rs.getString("nombre"));
                doctor.setApellidos(rs.getString("apellidos"));
                doctor.setEspecialidad(rs.getString("especialidad"));
                doctor.setTelefono(rs.getString("telefono"));
                doctor.setCorreoElectronico(rs.getString("correo"));
                doctor.setCedula(rs.getString("Cedula"));
                listaDoctores.add(doctor);
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar los doctores: " + ex);
        }
        return listaDoctores;
    }

    /**
     * Obtiene una lista de todos los recepcionistas registrados en la base de datos.
     * 
     * @return una lista de objetos {@link Recepcionista}.
     */
    public List<Recepcionista> listarRecepcionistas() {
        String sql = "SELECT id_recepcionista, nombre, apellidos, correo, telefono, Cedula FROM recepcionista";
        List<Recepcionista> listaRecepcionistas = new ArrayList<>();
        try (Connection con = c.conectar(); PreparedStatement ps = con.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Recepcionista recep = new Recepcionista();
                recep.setIdRecepcionista(rs.getInt("id_recepcionista"));
                recep.setNombres(rs.getString("nombre"));
                recep.setApellidos(rs.getString("apellidos"));
                recep.setCorreoElectronico(rs.getString("correo"));
                recep.setTelefono(rs.getString("telefono"));
                recep.setCedula(rs.getString("Cedula"));
                listaRecepcionistas.add(recep);
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar las recepcionistas: " + ex);
        }
        return listaRecepcionistas;
    }
}