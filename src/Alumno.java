public class Alumno {
    private String nombre;
    private int edad;
    private String curso;
    public void Alumno(String nombre, int edad, String curso){
        this.nombre = nombre;
        this.edad = edad;
        this.curso = curso;
    }
    public void Alumno(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.curso ="1º DAM";
    }
    public void mostrarDatos(){
        System.out.println("mi nombre es "+ nombre);
        System.out.println("tengo "+edad+" año");
        System.out.println("estudio en "+curso);
    }
}
