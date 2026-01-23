import java.util.Objects;

public class Libro {
    String titulo;
    Autor autor;
    int numPaginas;
    int valoracion;
    private int isbn;

    public int getIsbn() {
        return isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }


    public int getNumPaginas() {
        return numPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }



    public Libro(){

    }
    public Libro (String titulo, Autor autor, int numPaginas, int valoracion, int isbn){
        this.titulo=titulo;
        this.autor=autor;
        this.numPaginas=numPaginas;
        this.valoracion=valoracion;
        this.isbn=isbn;
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
    public String toString() {
        return "Libro{" +
                "autor=" + autor +
                ", titulo='" + titulo + '\'' +
                ", numPaginas=" + numPaginas +
                ", valoracion=" + valoracion +
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
