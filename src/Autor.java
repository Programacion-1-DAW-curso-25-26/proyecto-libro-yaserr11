public class Autor {
    private String nombre;
    private String nacionalidad;

    public Autor(String nacionalidad, String nombre) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nacionalidad='" + nacionalidad + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
