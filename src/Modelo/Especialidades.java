package Modelo;

/**
 *
 * @author sebas
 */
public class Especialidades {
    //Crear atributos
    String nombre;
    String descripcion;
    
    //Crear constructor vacio
    public Especialidades() {}
    
    //Llenar constructor
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
