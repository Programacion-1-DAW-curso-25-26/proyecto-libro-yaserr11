public class CuentaBancaria {
    private String numCuenta;
    private String titular;
    private double saldo;
    private static int numCuentas=0;

    public void crearCuentaBancaria(String titular) {
        this.numCuenta = generarNumCuenta();
        this.titular = titular;
        saldo = 0;
        numCuentas++;
    }
    public void mostrarInfo(){
        System.out.println("el num de cuenta "+numCuenta);
        System.out.println("Titular "+titular);
        System.out.println("Su saldo es "+saldo);
        System.out.println("salut a otro cuenatas : "+numCuentas);
    }


    public void ingresar(double cantidad) {
        if (cantidad >= 0) saldo += cantidad;
        else System.out.println("cantidad invalida");
    }

    public void retirar(double cantidad) {
        if (cantidad <= 0) System.out.println("Cantidad invalida");
        else if (saldo >= cantidad) {
            saldo -= cantidad;
        } else {
            System.out.println("Saldo insufiente");
        }
    }

    private  String generarNumCuenta(){
        numCuenta="";
        for (int i=0;i<12;i++){
            numCuenta += (int) (Math.random()*10);
        }
        return numCuenta;
    }
}
