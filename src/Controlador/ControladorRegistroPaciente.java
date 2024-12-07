package Controlador;

import Modelo.Paciente;
import Modelo.PacienteDAO;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 * Esta clase es el controlador encargado de manejar el registro de pacientes,
 * validando la información ingresada por el usuario antes de guardar los datos en la base de datos.
 * Utiliza un {@link PacienteDAO} para interactuar con la base de datos.
 */
public class ControladorRegistroPaciente {

    private PacienteDAO pacienteDAO;  // DAO para interactuar con la base de datos

    /**
     * Constructor que inicializa el DAO de pacientes.
     * 
     * @param pacienteDAO El objeto {@link PacienteDAO} encargado de la interacción con la base de datos.
     */
    public ControladorRegistroPaciente(PacienteDAO pacienteDAO) {
        this.pacienteDAO = new PacienteDAO();
    }

    /**
     * Método para validar los campos de la información del paciente.
     * 
     * @param nombre El nombre del paciente.
     * @param apellido El apellido del paciente.
     * @param correo El correo electrónico del paciente.
     * @param numeroTelefono El número de teléfono del paciente.
     * @param cedula La cédula del paciente.
     * @param contraseña La contraseña del paciente.
     * @param genero El género del paciente.
     * @return {@code true} si todos los campos son válidos, {@code false} si alguno es inválido.
     */
    public boolean validarCampos(String nombre, String apellido, String correo, String numeroTelefono, 
                                 String cedula, String contraseña, String genero) {

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

        return true;  // Todos los campos son válidos
    }

    /**
     * Valida el nombre del paciente.
     * 
     * @param nombre El nombre del paciente.
     * @return {@code true} si el nombre es válido, {@code false} si no lo es.
     */
    private boolean validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida el apellido del paciente.
     * 
     * @param apellido El apellido del paciente.
     * @return {@code true} si el apellido es válido, {@code false} si no lo es.
     */
    private boolean validarApellido(String apellido) {
        if (apellido == null || apellido.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El apellido es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida el correo electrónico del paciente.
     * 
     * @param correo El correo electrónico del paciente.
     * @return {@code true} si el correo es válido, {@code false} si no lo es.
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
     * Valida el número de teléfono del paciente.
     * 
     * @param numeroTelefono El número de teléfono del paciente.
     * @return {@code true} si el número es válido, {@code false} si no lo es.
     */
    private boolean validarTelefono(String numeroTelefono) {
        if (numeroTelefono == null || numeroTelefono.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El número de teléfono es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!numeroTelefono.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "El número de teléfono debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida la cédula del paciente.
     * 
     * @param cedula La cédula del paciente.
     * @return {@code true} si la cédula es válida, {@code false} si no lo es.
     */
    private boolean validarCedula(String cedula) {
        if (cedula == null || cedula.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La cédula es obligatoria.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!cedula.matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "La cédula debe contener solo números.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida la contraseña del paciente.
     * 
     * @param contraseña La contraseña del paciente.
     * @return {@code true} si la contraseña es válida, {@code false} si no lo es.
     */
    private boolean validarContraseña(String contraseña) {
        if (contraseña == null || contraseña.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "La contraseña es obligatoria.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Valida el género del paciente.
     * 
     * @param genero El género del paciente.
     * @return {@code true} si el género es válido, {@code false} si no lo es.
     */
    private boolean validarGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El género es obligatorio.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        if (!"Femenino".equalsIgnoreCase(genero) && !"Masculino".equalsIgnoreCase(genero)) {
            JOptionPane.showMessageDialog(null, "Por favor selecciona un género válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * Guarda los datos del paciente en la base de datos.
     * 
     * @param paciente El objeto {@link Paciente} que contiene los datos del paciente.
     */
    public void guardarPaciente(Paciente paciente) {
        try {
            if (pacienteDAO != null) {
                pacienteDAO.registrarPaciente(paciente);
                JOptionPane.showMessageDialog(null,
                        "¡Datos de " + paciente.getNombre() + " capturados exitosamente!",
                        "Confirmación",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el paciente: " + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
