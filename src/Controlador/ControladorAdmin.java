package Controlador;

import Modelo.AdminDAO;
import Modelo.DatabaseConnection;
import Modelo.Doctores;
import Modelo.Recepcionista;
import Vista.PantallaAdministrador;
import javax.swing.JComboBox;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * Controlador para gestionar la lógica de la Pantalla de Administración. 
 * Este controlador interactúa con el modelo (datos) y la vista (interfaz gráfica).
 */
public class ControladorAdmin {

    private AdminDAO aDAO; // Objeto DAO para operaciones de datos.
    private PantallaAdministrador pAdmin; // Vista vinculada al controlador.
    private DefaultTableModel modelo; // Modelo para manejar la tabla en la vista.

    /**
     * Constructor predeterminado. Inicializa el DAO, la vista y el modelo.
     */
    public ControladorAdmin() {
        this.aDAO = new AdminDAO();
        this.pAdmin = new PantallaAdministrador();
        this.modelo = new DefaultTableModel();
    }

    /**
     * Constructor con referencia a la vista.
     * 
     * @param pAdmin La vista de la pantalla de administrador.
     */
    public ControladorAdmin(PantallaAdministrador pAdmin) {
        this.pAdmin = pAdmin;
        this.aDAO = new AdminDAO();
        this.modelo = (DefaultTableModel) pAdmin.tablaDoctores.getModel();
    }

    /**
     * Carga las especialidades desde la base de datos en un JComboBox.
     * 
     * @param cmbEspecialidad JComboBox donde se llenarán las especialidades.
     */
    public static void cargarEspecialidades(JComboBox<String> cmbEspecialidad) {
        DatabaseConnection c = new DatabaseConnection();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            conn = c.conectar();
            String query = "SELECT nombre FROM especialidades";
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();

            cmbEspecialidad.removeAllItems();

            while (rs.next()) {
                cmbEspecialidad.addItem(rs.getString("nombre"));
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar especialidades: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Elimina un doctor identificado por su ID.
     * 
     * @param idDoctor ID del doctor a eliminar.
     * @return Resultado de la operación: 1 si se eliminó, 0 si no.
     */
    public int eliminarDoctor(int idDoctor) {
        int resultado = 0;

        try {
            resultado = aDAO.eliminarDoctor(idDoctor);
            if (resultado == 1) {
                JOptionPane.showMessageDialog(pAdmin, "¡Doctor eliminado exitosamente!");
            } else {
                JOptionPane.showMessageDialog(pAdmin, "No se pudo eliminar el doctor.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(pAdmin, "Error al intentar eliminar el doctor: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        return resultado;
    }

    /**
     * Busca doctores que coincidan con un valor dado y actualiza la tabla.
     * 
     * @param valorBuscar Valor utilizado para buscar doctores.
     */
    public void buscarYActualizarTabla(String valorBuscar) {
        List<Doctores> doctoresEncontrados = aDAO.buscarDoctores(valorBuscar);

        DefaultTableModel modelo = (DefaultTableModel) pAdmin.tablaDoctores.getModel();
        modelo.setRowCount(0);

        for (Doctores doctor : doctoresEncontrados) {
            modelo.addRow(new Object[] {
                doctor.getIdDoctor(),
                doctor.getNombres(),
                doctor.getApellidos(),
                doctor.getEspecialidad(),
                doctor.getTelefono(),
                doctor.getCorreoElectronico(),
                doctor.getCedula()
            });
        }
    }

    /**
     * Actualiza la información de un doctor seleccionado en la tabla.
     * 
     * @param nombre Nuevo nombre del doctor.
     * @param apellido Nuevo apellido del doctor.
     * @param especialidad Nueva especialidad del doctor.
     * @param telefono Nuevo teléfono del doctor.
     * @param correo Nuevo correo electrónico del doctor.
     * @param cedula Nueva cédula del doctor.
     */
    public void actualizarDoctor(String nombre, String apellido, String especialidad, String telefono, String correo, String cedula) {
        int filaSeleccionada = pAdmin.tablaDoctores.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(pAdmin, "Debe seleccionar un doctor para actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(pAdmin.tablaDoctores.getValueAt(filaSeleccionada, 0).toString());

        Doctores doctor = new Doctores();
        doctor.setIdDoctor(id);
        doctor.setNombres(nombre);
        doctor.setApellidos(apellido);
        doctor.setEspecialidad(especialidad);
        doctor.setTelefono(telefono);
        doctor.setCorreoElectronico(correo);
        doctor.setCedula(cedula);

        int resultado = aDAO.actualizarDoctor(doctor);

        if (resultado == 1) {
            JOptionPane.showMessageDialog(pAdmin, "¡Doctor actualizado exitosamente!");
            pAdmin.mostrarDatosDoctores();
        } else {
            JOptionPane.showMessageDialog(pAdmin, "Error al actualizar el doctor.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    public void actualizarRecepcionista(String nombre, String apellido, String telefono, String correo, String cedula) {
        int filaSeleccionada = pAdmin.tablaRecep.getSelectedRow();

        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(pAdmin, "Debe seleccionar una recepcionista para actualizar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        int id = Integer.parseInt(pAdmin.tablaRecep.getValueAt(filaSeleccionada, 0).toString());

        Recepcionista recep = new Recepcionista();
        recep.setIdRecepcionista(id);
        recep.setNombres(nombre);
        recep.setApellidos(apellido);
        recep.setTelefono(telefono);
        recep.setCorreoElectronico(correo);
        recep.setCedula(cedula);

        int resultado = aDAO.actualizarRecepcionista(recep);

        if (resultado == 1) {
            JOptionPane.showMessageDialog(pAdmin, "¡Recepcionista actualizada exitosamente!");
            pAdmin.mostrarDatosDoctores();
        } else {
            JOptionPane.showMessageDialog(pAdmin, "Error al actualizar la recepcionista.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Edita un doctor, cargando sus datos desde la base de datos hacia los campos del formulario.
     * 
     * @param id ID del doctor a editar.
     */
    public void editarDoctor(int id) {
        Doctores doctor = aDAO.obtenerDoctorPorId(id);

        if (doctor != null) {
            pAdmin.txtNombre.setText(doctor.getNombres());
            pAdmin.txtApellido.setText(doctor.getApellidos());
            pAdmin.txtEspecialidad.setText(doctor.getEspecialidad());
            pAdmin.txtTelefono.setText(doctor.getTelefono());
            pAdmin.txtCorreo.setText(doctor.getCorreoElectronico());
            pAdmin.txtCedula.setText(doctor.getCedula());
        } else {
            JOptionPane.showMessageDialog(pAdmin, "No se encontró al doctor con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    /**
     * Edita una recepcionista, cargando sus datos desde la base de datos hacia los campos del formulario.
     * 
     * @param id ID de la recepcionista a editar.
     */
    public void editarRecepcionista(int id) {
        Recepcionista recep = aDAO.obtenerRecepcionistaPorId(id);

        if (recep != null) {
            pAdmin.txtNombre.setText(recep.getNombres());
            pAdmin.txtApellido.setText(recep.getApellidos());
            pAdmin.txtTelefono.setText(recep.getTelefono());
            pAdmin.txtCorreo.setText(recep.getCorreoElectronico());
            pAdmin.txtCedula.setText(recep.getCedula());
        } else {
            JOptionPane.showMessageDialog(pAdmin, "No se encontró a la recepcionista con el ID proporcionado.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
