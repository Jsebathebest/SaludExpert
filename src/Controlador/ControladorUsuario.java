package Controlador;

import Modelo.Usuarios;
import Modelo.UsuariosDAO;
import javax.swing.JOptionPane;

/**
 * Controlador para gestionar la lógica de validación y almacenamiento de usuarios.
 * Este controlador interactúa con el modelo de usuarios (Usuarios y UsuariosDAO)
 * y proporciona validaciones para los campos de usuario.
 */
public class ControladorUsuario {

    private UsuariosDAO uDAO; // Objeto DAO para operaciones de usuarios en la base de datos.

    /**
     * Constructor predeterminado que inicializa el DAO para usuarios.
     */
    public ControladorUsuario() {
        this.uDAO = new UsuariosDAO();
    }

    /**
     * Valida los campos proporcionados para la creación de un nuevo usuario.
     * 
     * @param nombre Nombre del usuario.
     * @param apellido Apellido del usuario.
     * @param correo Correo electrónico del usuario.
     * @param numeroTelefono Número de teléfono del usuario.
     * @param cedula Cédula de identidad del usuario.
     * @param contraseña Contraseña del usuario.
     * @param genero Género del usuario.
     * @return true si todos los campos son válidos, false si alguno es inválido.
     */
    public boolean validarCampos(String nombre, String apellido, String correo,
                                  String numeroTelefono, String cedula, String contraseña, String genero) {

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

        return true; // Todos los campos son válidos.
    }

    /**
     * Valida que el nombre no sea nulo ni vacío.
     * 
     * @param nombre Nombre del usuario a validar.
     * @return true si el nombre es válido, false si es inválido.
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
     * Valida que el apellido no sea nulo ni vacío.
     * 
     * @param apellido Apellido del usuario a validar.
     * @return true si el apellido es válido, false si es inválido.
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
     * Valida que el correo no sea nulo, vacío y tenga el formato adecuado.
     * También verifica que el correo no pertenezca a dominios no permitidos.
     * 
     * @param correo Correo electrónico del usuario a validar.
     * @return true si el correo es válido, false si es inválido.
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
     * Valida que el número de teléfono contenga solo números y no esté vacío.
     * 
     * @param numeroTelefono Número de teléfono del usuario a validar.
     * @return true si el número de teléfono es válido, false si es inválido.
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
     * Valida que la cédula no sea nula, vacía y contenga solo números.
     * 
     * @param cedula Cédula de identidad del usuario a validar.
     * @return true si la cédula es válida, false si es inválida.
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
     * Valida que la contraseña no sea nula ni vacía.
     * 
     * @param contraseña Contraseña del usuario a validar.
     * @return true si la contraseña es válida, false si es inválida.
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
     * Valida que el género sea "Femenino" o "Masculino".
     * 
     * @param genero Género del usuario a validar.
     * @return true si el género es válido, false si es inválido.
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
     * Guarda un nuevo usuario en la base de datos utilizando el DAO.
     * 
     * @param usuario El objeto Usuario que contiene los datos a guardar.
     */
    public void guardarUsuario(Usuarios usuario) {
        if (uDAO != null) {
            uDAO.agregar(usuario); // Llama al método agregar del DAO para insertar al usuario.
            JOptionPane.showMessageDialog(null,
                    "¡Datos de " + usuario.getNombre() + " capturados exitosamente!",
                    "Confirmación",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
}