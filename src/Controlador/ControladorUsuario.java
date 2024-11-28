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
            String numeroTelefono, String cedula, String contraseña, String genero) {

        // Validar cada campo individualmente
        if (!validarNombre(nombre)) {
            return false;
        }
        if (!validarApellido(apellido)) {
            return false;
        }
        if (!validarCorreo(correo)) {
            return false;
        }
        if (!validarTelefono(numeroTelefono)) {
            return false;
        }
        if (!validarCedula(cedula)) {
            return false;
        }
        if (!validarContraseña(contraseña)) {
            return false;
        }
        if (!validarGenero(genero)) {
            return false;
        }

        return true; // Todos los campos son válidos
    }

    private boolean validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apellido es obligatorio.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarCorreo(String correo) {
        if (correo == null || correo.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El correo es obligatorio.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!correo.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            JOptionPane.showMessageDialog(null, "Por favor ingresa un correo válido.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (correo.endsWith("@doctor.saludxpert.com") || 
                correo.endsWith("@recepcionista.saludxpert.com") || 
                correo.endsWith("@admin.saludxpert.com")) {
            JOptionPane.showMessageDialog(null, "No tienes permiso para crear usuarios de este tipo. Por favor contacte al administrador", 
                    "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarTelefono(String numeroTelefono) {
        if (numeroTelefono == null || numeroTelefono.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El número de teléfono es obligatorio.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!numeroTelefono.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe contener solo números.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarCedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La cédula es obligatoria.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!cedula.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "La cédula debe contener solo números.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarContraseña(String contraseña) {
        if (contraseña == null || contraseña.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La contraseña es obligatoria.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private boolean validarGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El género es obligatorio.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!"Femenino".equals(genero) && !"Masculino".equals(genero)) {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un género válido.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
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
