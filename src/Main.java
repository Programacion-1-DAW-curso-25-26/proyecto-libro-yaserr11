public class Main {

    public void main(String[] args) {
        Libro michiavelli = new Libro();
        michiavelli.autor = "michiavelli";
        michiavelli.titulo = "prince";
        michiavelli.numPaginas=475;
        michiavelli.setValoracion(5);
        michiavelli.mostrarInfo();

        Cancion popstar = new Cancion();
        popstar.setAutor("shaw");
        popstar.setTitulo("popstar");
        popstar.setDuracion(-5);
        popstar.imprimirInfo();





        Alumno Juan = new Alumno();
        Juan.Alumno("Juan",16,"2 DAM");
        Alumno Maria = new Alumno();
        Maria.Alumno("Maria", 15);
        Juan.mostrarDatos();
        Maria.mostrarDatos();


    }
}