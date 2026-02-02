public class Persona {

    private String nombre;
    private String nacionalidad;

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nacionalidad, String nombre) {
        this.nacionalidad = nacionalidad;
        this.nombre = nombre;
    }
}
