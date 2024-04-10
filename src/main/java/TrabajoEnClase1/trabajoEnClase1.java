package TrabajoEnClase1;

//AUTO
public class trabajoEnClase1 {

    String color;
    String modelo;
    String marca;
    String tipoVehiculo;
    String placa;
    double precio;
    String cilindraje;

    trabajoEnClase1(){
    }

    trabajoEnClase1(String modelo, String color, String marca, String tipoVehiculo, String placa, double precio, String cilindraje ){
        this.modelo = modelo;
        this.precio = precio;
        this.cilindraje = cilindraje;
        this.marca = marca;
        this.tipoVehiculo = tipoVehiculo;
        this.color = color;
        this.placa = placa;
    }

    public void encender(){
        System.out.println("El auto esta encendido");
    }
    public void arrancar(){
        System.out.println("El auto inicio marcha");
    }

    public void frenar(){
        System.out.println("El auto frenó");
    }
}
