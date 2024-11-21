package Modelo;

/**
 *
 * @author Sebastian
 */
public class Departamentos {

    //Crear atributos
    int idDepartamentos;
    int idDoctores;
    String tipos;
    String jefeDepartamento;
    String correoElectronico;
    String telefono;
    int piso;

    //Crear constructor
    public Departamentos() {
    }

    //Llenar constructor
    public Departamentos(int idDepartamentos,
            int idDoctores,
            String tipos,
            String jefeDepartamento,
            String correoElectronico,
            String telefono,
            int piso) {
        this.idDepartamentos = idDepartamentos;
        this.idDoctores = idDoctores;
        this.tipos = tipos;
        this.jefeDepartamento = jefeDepartamento;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.piso = piso;
    }

    //Agregar Getters y Setters
    public int getIdDepartamentos() {
        return idDepartamentos;
    }

    public void setIdDepartamentos(int idDepartamentos) {
        this.idDepartamentos = idDepartamentos;
    }

    public int getIdDoctores() {
        return idDoctores;
    }

    public void setIdDoctores(int idDoctores) {
        this.idDoctores = idDoctores;
    }

    public String getTipos() {
        return tipos;
    }

    public void setTipos(String tipos) {
        this.tipos = tipos;
    }

    public String getJefeDepartamento() {
        return jefeDepartamento;
    }

    public void setJefeDepartamento(String jefeDepartamento) {
        this.jefeDepartamento = jefeDepartamento;
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

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

}
