public class Bicicleta {
    private String  marca;
    private String modelo;
    private static int contadorBicileta;

    public static int getBicicletasTotales() {
        return contadorBicileta;
    }

    public void nuevaBicicleta(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
        contadorBicileta++;
    }
}
