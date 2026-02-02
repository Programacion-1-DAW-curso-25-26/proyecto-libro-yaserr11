public class Publicacion {
    private String titulo;
    private Autor autor;
    private int numPaginas;
    private int valoracion;
    public Autor getAutor() {
        return autor;
    }

    public Publicacion(Autor autor, int numPaginas, String titulo, int valoracion) {
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.titulo = titulo;
        this.valoracion = valoracion;
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

    public int getValoracion() {
        return valoracion;
    }

    public void setValoracion(int valoracion){
        if ((valoracion >0) && (valoracion <10)){
            this.valoracion = valoracion;
        } else System.out.println(" Invalid valoracion");
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

}
