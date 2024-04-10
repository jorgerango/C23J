package TrabajoEnClase1;

public class Main {
    public static void main(String[] args) {

        trabajoEnClase1 auto = new trabajoEnClase1();
        auto.placa = "XXX111";
        auto.marca = "toyota";
        auto.color = "azul";
        auto.tipoVehiculo = "Campero";
        auto.cilindraje = "2000";
        auto.precio = 2000000;
        auto.modelo = "2010";

        auto.arrancar();
        auto.frenar();
        auto.encender();
    }
}
