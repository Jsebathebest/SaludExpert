package Controlador;

import Modelo.RegistrarseDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ControladorRegistroPaciente {

    private RegistrarseDB PacienteModelo;

    public ControladorRegistroPaciente(RegistrarseDB PacienteModelo) {
        this.PacienteModelo = PacienteModelo;
    }

    public void registrarPacienteDesdeVista(String nombre, String apellido, String correo, String numero_telefono, String cedula, String contraseña, String genero) {
        try {
            PacienteModelo.registrarUsuario(nombre, apellido, correo, numero_telefono, cedula, contraseña, genero);
            System.out.println("Registro exitoso");
        } catch (SQLException e) {
            System.err.println("Error al registrar usuario: " + e.getMessage());
        }
    }
}
