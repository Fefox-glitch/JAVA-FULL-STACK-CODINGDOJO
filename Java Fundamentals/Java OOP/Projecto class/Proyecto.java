// import java.util.ArrayList;

public class Proyecto {

    private String nombre;
    private String descripcion;
    private double costo;

    public String elevatorPitch() {
        return ("Nombre: " + this.getNombre() + " Costo: ($" + Double.toString(getCosto()) + ")" + " Descripcion: " + this.getDescripcion());
    }

    // Constructors
    public void Project() {
        this.nombre = "";
        this.descripcion = "";
        this.costo = 0.00;
    }

    public void Project(String projectNombre) {
        this.nombre = projectNombre;
        this.descripcion = "";
        this.costo = 0.00;
    }

    public void Project(String projectNombre, String projectDescripcion) {
        this.nombre = projectNombre;
        this.descripcion = projectDescripcion;
        this.costo = 0.00;
    }

    public void Project(String projectNombre, String projectDescripcion, Double projectCosto) {
        this.nombre = projectNombre;
        this.descripcion = projectDescripcion;
        this.costo = projectCosto;
    }

    // Getters
    public String getNombre() {
        return (nombre);
    }

    public String getDescripcion() {
        return (descripcion);
    }

    public Double getCosto() {
        return (costo);
    }

    // Setters
    public void setNombre(String newNombre) {
        this.nombre = newNombre;
    }

    public void setDescripcion(String newDescripcion) {
        this.descripcion = newDescripcion;
    }

    public void setCosto(Double projectCosto) {
        this.costo = projectCosto;
    }


}
