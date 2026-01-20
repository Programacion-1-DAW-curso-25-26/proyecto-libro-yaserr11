import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public void main(String[] args) {
        Libro michiavelli = new Libro();
        michiavelli.autor = "michiavelli";
        michiavelli.autor = "michiavelli";
        michiavelli.titulo = "prince";
        michiavelli.numPaginas=475;
        michiavelli.setValoracion(5);
        michiavelli.setIsbn(10);
        michiavelli.mostrarInfo();
        Libro libro1 = new Libro("DADO", "papa", 50, 10, 9);
        Libro libro2 = new Libro("DADO", "papa", 50, 10, 9);

        if (libro2.equals(libro1)) System.out.println("libro1");
        else System.out.println("no va");
        System.out.println(michiavelli);

        ArrayList <Libro> biblioteca = new ArrayList<>();
        biblioteca.add(libro1);

        System.out.println(biblioteca.contains(libro2));
        // true, por que hay un libro en la bibiliot con el mismo isbn contain=equals

        HashSet<Libro> casera = new HashSet<>();
        System.out.println(casera.add(libro1));
        System.out.println(casera.add(libro2));
        System.out.println(casera.size());

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
}