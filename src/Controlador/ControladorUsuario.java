package Controlador;

import Modelo.Usuarios;
import Modelo.UsuariosDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author sebas
 */
public class ControladorUsuario {
    private UsuariosDAO uDAO;

    public ControladorUsuario() {
        this.uDAO = new UsuariosDAO(); // Inicializa el DAO
    }

    public boolean validarCampos(String nombre, String apellido, String correo, 
                                     String numeroTelefono, String cedula, 
                                     String contraseña, String genero) {
        // Validar campos vacíos
        if (nombre == null || nombre.trim().isEmpty() ||
            apellido == null || apellido.trim().isEmpty() ||
            correo == null || correo.trim().isEmpty() ||
            numeroTelefono == null || numeroTelefono.trim().isEmpty() ||
            cedula == null || cedula.trim().isEmpty() ||
            contraseña == null || contraseña.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null,
                "Todos los campos son obligatorios.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar formato de correo
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null,
                "Por favor ingresa un correo válido.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }

        // Validar género
        if (!"Femenino".equals(genero) && !"Masculino".equals(genero)) {
            JOptionPane.showMessageDialog(null,
                "Por favor selecciona un género.",
                "Error",
                JOptionPane.ERROR_MESSAGE);
            return false;
        }

        return true; // Datos válidos
    }

    public void guardarUsuario(Usuarios usuario) {
        if (uDAO != null) {
            uDAO.agregar(usuario);
            JOptionPane.showMessageDialog(null,
                "¡Datos de " + usuario.getNombre() + " capturados exitosamente!",
                "Confirmación",
                JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
