package trabajoEnClase3;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class trabajoEnClase3 {
    public static void  main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> lista= new ArrayList<>();

        for (int i=1; i < 9; i++){
            System.out.print("ingrese nombre " + i + " : ");
            String palabra = scanner.nextLine();
            lista.add(palabra);
        }

        for (String palabra: lista){
            if (palabra.length() > 4) {
                System.out.println(palabra);
            }
        }
    }
    }

