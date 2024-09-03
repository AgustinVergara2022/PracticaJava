package MetodosDeColecciones;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class Sort {
    public static void main(String[] args)
    {
        String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};

        // Crea y muestra una list que contiene los elementos del arreglo palos
        List<String> lista = Arrays.asList(palos);
        System.out.printf("Elementos del arreglo desordenados: %s%n", lista);

        Collections.sort(lista); // ordena ArrayList
        System.out.printf("Elementos del arreglo ordenados: %s%n", lista);
    }
}
