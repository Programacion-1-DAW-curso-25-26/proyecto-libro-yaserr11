import java.util.Objects;

public class Libro extends Publicacion {
    private int isbn;


    public Libro(Autor autor, int numPaginas, String titulo, int valoracion, int isbn) {
        super(autor, numPaginas, titulo, valoracion);
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void mostrarInfo(){
       System.out.println("el libro "+ getTitulo()+" de "+getAutor()+" tiene "+getValoracion()+" páginas con valoracion " +getValoracion());
   }


    @Override
    public String toString() {
        return "Libro{" + getTitulo() +
                "autor=" + getAutor() +'\''+
                ", titulo='" + getTitulo() + '\''+
                ", numPaginas=" + getNumPaginas() +
                ", valoracion=" + getValoracion() +
                ", isbn=" + isbn +
                '}';
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

}
