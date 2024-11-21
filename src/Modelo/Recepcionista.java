package Modelo;

/**
 *
 * @author Sebastian
 */
public class Recepcionista {

    //Crear atributos
    int idRecepcionista; //Autogenerado
    String nombres;
    String apellidos;
    String correoElectronico; //Lleva nascara
    String telefono; //Lleva mascara
    String horario; //Lleva mascara (Ej: 8:00AM - 2:00PM)
    String turno; //Lleva mascara (Ej: 'Tarde')
    String genero; //Femenino/Masculino

    //Crear constructor vacio
    public Recepcionista() {
    }

    //Llenar constructor
    public Recepcionista(int idRecepcionista, String nombres, String apellidos, String correoElectronico,
            String telefono, String horario, String turno, String genero) {
        this.idRecepcionista = idRecepcionista;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.horario = horario;
        this.turno = turno;
        this.genero = genero;
    }

    //Crear Getters y Setters
    public int getIdRecepcionista() {
        return idRecepcionista;
    }

    public void setIdRecepcionista(int idRecepcionista) {
        this.idRecepcionista = idRecepcionista;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

}
