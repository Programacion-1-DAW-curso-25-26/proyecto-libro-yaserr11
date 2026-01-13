public class Libro {
    String titulo;
    String autor;
    int numPaginas;
    int valoracion;

   public void mostrarInfo(){
       System.out.println("el libro "+ titulo+" de "+autor+" tiene "+numPaginas+" páginas con valoracion " +valoracion);
   }
    public void setValoracion(int valoracion){
        if ((valoracion >0) && (valoracion <10)){
            this.valoracion = valoracion;
        } else System.out.println(" Invalid valoracion");
    }
}
