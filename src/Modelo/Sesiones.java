package Modelo;

/**
 *
 * @author Sebastian
 */
public class Sesiones {

    // Crear atributos
    int idSesion;
    int idUser; // Relación con el usuario
    String token;
    String fechaInicio;
    String fechaFin;

    //Crear constructor
    public Sesiones() {
    }

    //Llenar constructor
    public Sesiones(int idSesion,
            int idUser,
            String token,
            String fechaInicio,
            String fechaFin) {
        this.idSesion = idSesion;
        this.idUser = idUser;
        this.token = token;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    //Agregar Getters y Setters
    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        this.idSesion = idSesion;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

}
