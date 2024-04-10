package b4;

import java.util.ArrayList;
import java.util.List;

public class controlFlujo {
    public static void  main(String[] args) {
        System.out.println("Hola Mundo");

        int contador = 0;

        while (contador < 5){
            System.out.println();

        }

        List<String> lista= new ArrayList<>();
        lista.add("Comida 1");
        lista.add("Comida 2");
        lista.add("Comida 3");
        lista.add("Comida 4");
        lista.add("Comida 5");

        for (int i=0 ; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }

    }
}
