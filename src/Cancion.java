public class Cancion {
    private String titulo;
    private String autor;
    private int duracion;

    public void setDuracion(int duracion) {
        if (duracion >0) this.duracion = duracion;
        else System.out.println("Error: Duracíon negativa");
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(String autor){
        this.autor = autor;
    }
    public void imprimirInfo(){
        System.out.println("el cancion "+titulo+" de "+autor+" tiene "+duracion+" segundos.");
    }
}
