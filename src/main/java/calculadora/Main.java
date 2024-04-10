package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escriba el primer numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Escriba el segundo numero: ");
        double num2 = scanner.nextDouble();

        System.out.println("MENU");
        System.out.println("1. SUMAR");
        System.out.println("2. RESTAR");
        System.out.println("3. MULTIPLICAR");
        System.out.println("4. DIVIDIR");

        double resultado = 0;

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                resultado = sumar(num1, num2);
                break;
            case 2:
                resultado = restar(num1, num2);
                break;
            case 3:
                resultado = multiplicar(num1, num2);
                break;
            case 4:
                resultado = dividir(num1, num2);
                break;
        }
        System.out.println("El resultado es: " + resultado);
    }


    public static double sumar(double a, double b){
        return a + b;
    }

    public static double restar(double a, double b){
        return a-b;
    }

    public static double multiplicar(double a, double b){
        return a*b;
    }

    public static double dividir(double a, double b){
        return a/b;
    }
}
