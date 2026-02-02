import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

    public void main(String[] args) {
//        Libro michiavelli = new Libro();
//        michiavelli.autor = "michiavelli";
//        michiavelli.autor = "michiavelli";
//        michiavelli.titulo = "prince";
//        michiavelli.numPaginas=475;
//        michiavelli.setValoracion(5);
//        michiavelli.setIsbn(10);
//        michiavelli.mostrarInfo();
//        Libro libro1 = new Libro("DADO", "papa", 50, 10, 9);
//        Libro libro2 = new Libro("DADO", "papa", 50, 10, 9);
//
//        if (libro2.equals(libro1)) System.out.println("libro1");
//        else System.out.println("no va");
//        System.out.println(michiavelli);
        HashSet<Autor> autores = new HashSet<>();
        ArrayList <Libro> biblioteca = new ArrayList<>();
//        biblioteca.add(libro1);
//        biblioteca.remove(libro1);
//        System.out.println(biblioteca.contains(libro2));
         //true, por que hay un libro en la bibiliot con el mismo isbn contain=equals
        char opcion;
        Scanner sc = new Scanner(System.in);
        do {
            imprimirMenu();
            opcion = sc.nextLine().toLowerCase().charAt(0);

            switch (opcion) {
                case 'a':
                    anyadirLibro(biblioteca, sc,autores);
                    break;
                case 'b':
                    mostrarTodos(biblioteca);
                    break;
                case 'c':
                    buscarISBN(biblioteca, sc);
                    break;
                case 'd':
                    eliminarISBN(biblioteca, sc);
                    break;
                case 'f':
                    anyadirAutor(autores, sc);
                    break;
                case 'g':
                    buscarPorAutor(autores, sc);
                    break;
//                case 'h':
//                    eliminarPorAutor(autores, sc);
//                    break;
//                case 'i':
//                    mostrarAutores(autores);
//                    break;
                case 'j':
                    vaciarLista(biblioteca);
                    break;
                case 'e':
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("opcion incorrecta");
                    break;
            }
        }  while (opcion!= 's');
//        HashSet<Libro> casera = new HashSet<>();
//        System.out.println(casera.add(libro1));
//        System.out.println(casera.add(libro2));
//        System.out.println(casera.size());

//        for (Libro l: biblioteca){
//            System.out.println(l);
//        }

//        Cancion popstar = new Cancion();
//        popstar.setAutor("shaw");
//        popstar.setTitulo("popstar");
//        popstar.setDuracion(-5);
//        popstar.imprimirInfo();



//
//
//        Alumno Juan = new Alumno();
//        Juan.Alumno("Juan",16,"2 DAM");
//        Alumno Maria = new Alumno();
//        Maria.Alumno("Maria", 15);
//        Juan.mostrarDatos();
//        Maria.mostrarDatos();
//
//        CuentaBancaria Yassir = new CuentaBancaria();
////        Yassir.setTitular("Yassir");
//        Yassir.ingresar(1000);
//        Yassir.retirar(2000);
//        Yassir.retirar(500);
//        Yassir.mostrarInfo();
//
//        System.out.println("total de bicicletas " +Bicicleta.getBicicletasTotales());
//        Bicicleta Orbea = new Bicicleta();
//        Orbea.nuevaBicicleta("Orbea","BMX");
//        Bicicleta Trek = new Bicicleta();
//        Trek.nuevaBicicleta("Trek","Trek");
//        Bicicleta Specialized = new Bicicleta();
//        Specialized.nuevaBicicleta("Specialized","Trek");
//        System.out.println("total de bicicletas " +Bicicleta.getBicicletasTotales());
    }

    private void buscarPorAutor(HashSet<Autor> autores, Scanner sc) {
        String nombreAutor;
        String nacionalidadAutor;
        System.out.println("Dime el nombre del autor");
        nombreAutor = sc.nextLine();
        System.out.println("Dime la nacionalidad del autor");
        nacionalidadAutor = sc.nextLine();

    }

    private Autor anyadirAutor(HashSet<Autor> autores, Scanner sc) {
        System.out.println("Dime el nombre del autor");
        String nombre = sc.nextLine();
        System.out.println("Dime el nacionalidad del autor");
        String nacionalidad = sc.nextLine();
        System.out.println("Dime el estilo del autor");
        String estilo = sc.nextLine();
        Autor autorlib = new Autor(nacionalidad,nombre,estilo);
        autores.add(autorlib);
        return autorlib;
    }

    private void eliminarISBN(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("Dime el ISBN");
        int isbnBuscado = sc.nextInt();
        sc.nextLine();
        Iterator <Libro> it = biblioteca.iterator();
        while (it.hasNext()){
            Libro libroActual = it.next();
            if (libroActual.getIsbn()==isbnBuscado){
                it.remove();
                System.out.println("ha eliminado con exito");
            } else System.out.println("No encontreado");
        }
        // option 2 elimnar por equals
//        Libro borrar = new Libro("","",0,0,isbnBuscado);
//        biblioteca.remove(borrar);
    }

    private void buscarISBN(ArrayList<Libro> biblioteca, Scanner sc) {
        System.out.println("Dime el ISBN");
        int isbnBuscado = sc.nextInt();
        sc.nextLine();
        // option 1.
        for (Libro libroEncontrado : biblioteca){
         if (libroEncontrado.getIsbn()==isbnBuscado){
             System.out.println("Encontrado");
             System.out.println(libroEncontrado);
         }
        }
        // option 2 buscado por equals
//        Libro libroBuscar = new Libro("","",0,0,isbnBuscado);
//      if(  biblioteca.contains(libroBuscar)) {
//          System.out.println("El libro existe");
//      }
    }

    private static void vaciarLista(ArrayList<Libro> biblioteca) {
        int tamanyo = biblioteca.size();
        biblioteca.clear();
        System.out.println("Borrados " + tamanyo + " libros");
    }

    private void mostrarTodos(ArrayList<Libro> biblioteca) {
        if (biblioteca.isEmpty()) System.out.println("no hay libros");
        else for (Libro libro : biblioteca){

            System.out.println("El"+ libro.getTitulo()+"(ISBN: "+libro.getIsbn()+") - "+libro.getAutor()+". "+libro.getNumPaginas()+" págs");
            System.out.println(biblioteca);
        }
        // iterator
//        Iterator<Libro> it = biblioteca.iterator();
//        while(it.hasNext()) {         // Mientras queden elementos por visitar...
//            Libro libroActual = it.next();
//            System.out.println(libroActual);
//        }
    }

    private void imprimirMenu() {
        System.out.println(""" 
                --- MENÚ LIBRERÍA ---
                a. Añadir Libro
                b. Mostrar Libros
                c. Buscar por ISBN.
                d. Eliminar por ISBN.
                f. Anyadir Autor.
                g. Buscar Por Autor.
                h. Eliminar por Autor.
                i. Mostrar Autores
                e. Salir
                Seleccione opción:
                """);
    }

    private void anyadirLibro(ArrayList<Libro> biblioteca, Scanner sc,HashSet<Autor> autores) {
        String titulo;
        int numPaginas;
        int valoracion;
        int isbn;
        System.out.println("Dime el titulo");
        titulo = sc.nextLine();
       Autor autor = anyadirAutor(autores, sc);
        System.out.println("Dime el numero de paginas");
        numPaginas = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime el isbn");
        isbn = sc.nextInt();
        sc.nextLine();
        System.out.println("Dame el valoracion");
        valoracion = sc.nextInt();
        sc.nextLine();

        Libro nuevo = new Libro(autor,numPaginas,titulo,valoracion,isbn);
        biblioteca.add(nuevo);
    }

//    private static Autor buscarAutor(HashSet<Autor> autores, String nombre, String nacionalidad) {
//        for (Autor autor: autores){
//            if (autor.getNombre().equals(nombre) && autor.getNacionalidad().equals(nacionalidad)){
//                return autor;
//            }
//        }
//        return null;
//    }
}