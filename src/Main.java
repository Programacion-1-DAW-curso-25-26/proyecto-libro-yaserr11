public class Main {

    public void main(String[] args) {
        Libro michiavelli = new Libro();
        michiavelli.autor = "michiavelli";
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

        CuentaBancaria Yassir = new CuentaBancaria("Yassir");
//        Yassir.setTitular("Yassir");
        Yassir.ingresar(1000);
        Yassir.retirar(2000);
        Yassir.retirar(500);
        Yassir.mostrarInfo();

        System.out.println("total de bicicletas " +Bicicleta.getBicicletasTotales());
        Bicicleta Orbea = new Bicicleta();
        Orbea.nuevaBicicleta("Orbea","BMX");
        Bicicleta Trek = new Bicicleta();
        Trek.nuevaBicicleta("Trek","Trek");
        Bicicleta Specialized = new Bicicleta();
        Specialized.nuevaBicicleta("Specialized","Trek");
        System.out.println("total de bicicletas " +Bicicleta.getBicicletasTotales());
    }
}