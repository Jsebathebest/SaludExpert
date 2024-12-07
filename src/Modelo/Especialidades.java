package Modelo;

/**
 * La clase {@code Especialidades} representa las especialidades médicas disponibles en el sistema.
 * Cada especialidad tiene un nombre y una descripción que define el área de la medicina a la que pertenece.
 */
public class Especialidades {

    // Atributos de la clase
    String nombre;       // Nombre de la especialidad médica
    String descripcion;  // Descripción de la especialidad médica

    /**
     * Constructor vacío para la clase {@code Especialidades}.
     * Crea una instancia de la clase sin inicializar atributos.
     */
    public Especialidades() {}

    /**
     * Constructor que inicializa los atributos de la clase {@code Especialidades}.
     *
     * @param nombre       Nombre de la especialidad médica
     * @param descripcion  Descripción detallada de la especialidad médica
     */
    public Especialidades(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }    
    //Agregar getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}