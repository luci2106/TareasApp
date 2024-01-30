package Modelo;

public class Rol {
    private int id;
    private String Descripcion;

    public Rol() {
    }

    public Rol(int id, String descripcion) {
        this.id = id;
        Descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Rol{" +
                "id=" + id +
                ", Descripcion='" + Descripcion + '\'' +
                '}';
    }
}
