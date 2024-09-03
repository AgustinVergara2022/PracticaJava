package MetodosDeColecciones;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortReverse
{
    public static void main(String[] args)
    {
        String[] palos = {"Corazones", "Diamantes", "Bastos", "Espadas"};

        // Crea y muestra una lista que contiene los elementos del arreglo palos
        List<String> lista = Arrays.asList(palos); // crea objeto List
        System.out.printf("Elementos del arreglo desordenados: %s%n", lista);

        // ordena en forma descendente, utilizando un comparador
        Collections.sort(lista, Collections.reverseOrder());
        System.out.printf("Elementos de lista ordenados: %s%n", lista);
    }
} // fin de la clase Ordenamiento2
