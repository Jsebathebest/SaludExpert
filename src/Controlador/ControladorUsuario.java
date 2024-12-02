package Controlador;

import Modelo.Usuarios;
import Modelo.UsuariosDAO;
import javax.swing.JOptionPane;

/**
 * Controlador para la gestión de usuarios en el sistema.
 * Este controlador valida los campos ingresados por el usuario, interactúa
 * con el modelo de datos (Usuarios y UsuariosDAO) y maneja las interacciones
 * relacionadas con la creación y validación de usuarios.
 *
 */
public class ControladorUsuario {

    private UsuariosDAO uDAO;

    /**
     * Constructor predeterminado. Inicializa el DAO de usuarios.
     */
    public ControladorUsuario() {
        this.uDAO = new UsuariosDAO();
    }

    /**
     * Valida los campos de un formulario de usuario.
     * 
     * @param nombre Nombre del usuario.
     * @param apellido Apellido del usuario.
     * @param correo Correo electrónico del usuario.
     * @param numeroTelefono Número de teléfono del usuario.
     * @param cedula Cédula del usuario.
     * @param contraseña Contraseña del usuario.
     * @param genero Género del usuario.
     * @return true si todos los campos son válidos, false de lo contrario.
     */
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

    /**
     * Valida el nombre del usuario.
     * 
     * @param nombre Nombre del usuario.
     * @return true si el nombre no está vacío, false de lo contrario.
     */
    private boolean validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida el apellido del usuario.
     * 
     * @param apellido Apellido del usuario.
     * @return true si el apellido no está vacío, false de lo contrario.
     */
    private boolean validarApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apellido es obligatorio.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida el correo electrónico del usuario.
     * 
     * @param correo Correo electrónico del usuario.
     * @return true si el correo es válido, false de lo contrario.
     */
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

    /**
     * Valida el número de teléfono del usuario.
     * 
     * @param numeroTelefono Número de teléfono del usuario.
     * @return true si el número de teléfono es válido, false de lo contrario.
     */
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

    /**
     * Valida la cédula del usuario.
     * 
     * @param cedula Cédula del usuario.
     * @return true si la cédula es válida, false de lo contrario.
     */
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

    /**
     * Valida la contraseña del usuario.
     * 
     * @param contraseña Contraseña del usuario.
     * @return true si la contraseña no está vacía, false de lo contrario.
     */
    private boolean validarContraseña(String contraseña) {
        if (contraseña == null || contraseña.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La contraseña es obligatoria.", "Error", 
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida el género del usuario.
     * 
     * @param genero Género del usuario.
     * @return true si el género es "Masculino" o "Femenino", false de lo contrario.
     */
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

    /**
     * Guarda un usuario en la base de datos.
     * 
     * @param usuario Objeto usuario a guardar.
     */
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
