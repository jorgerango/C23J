package trabajoEnClase2;

import java.sql.SQLOutput;
import java.util.Scanner;

// Crear una calculadora que funcione por consola pidiendo 2 datos numericos
public class trabajoEnClase2 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Escriba segundo numero: ");
        double num2 = scanner.nextDouble();

        double suma= num1 + num2;
        double resta= num1 - num2;
        double multiplicacion = num1 * num2;

        System.out.println("El resultado de la suma es: "+ suma);
        System.out.println("El resultado de la resta es: "+ resta);
        System.out.println("El resultado de la multiplicacion es: "+ multiplicacion);

        if (num2 != 0) {
            double division = num1 / num2;
            System.out.println("El resultado de la division es: "+ division);
        }
        else{
            System.out.println("No se puede dividir por cero.");
        }
    }
}
