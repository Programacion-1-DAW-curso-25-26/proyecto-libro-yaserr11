import java.util.Objects;

public class Libro {
    String titulo;
    String autor;
    int numPaginas;
    int valoracion;
    private int isbn;

    public Libro(){

    }
    public Libro (String titulo, String autor, int numPaginas, int valoracion, int isbn){

    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void mostrarInfo(){
       System.out.println("el libro "+ titulo+" de "+autor+" tiene "+numPaginas+" páginas con valoracion " +valoracion);
   }
    public void setValoracion(int valoracion){
        if ((valoracion >0) && (valoracion <10)){
            this.valoracion = valoracion;
        } else System.out.println(" Invalid valoracion");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return isbn == libro.isbn;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numPaginas=" + numPaginas +
                ", valoracion=" + valoracion +
                ", isbn=" + isbn +
                '}';
    }
}
