package PruebaCollection;

import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class PruebaCollection {
    public static void main(String[] args){
        
        // agrega los elementos en el arreglo colores a la lista
        String[] colors = {"MAGENTA", "ROJO", "BLANCO", "AZUL", "CYAN"};
        List<String> lista = new ArrayList<>();

        for (String color : colors)
            lista.add(color); // agrega el color al final de la lista

        // agrega los elementos en el arreglo eliminarColores a eliminarLista
        String[] eliminarColores = {"ROJO", "BLANCO", "AZUL"};
        List<String> eliminarLista = new ArrayList<>();

        for (String color : eliminarColores)
            eliminarLista.add(color);
        // imprime en pantalla el contenido de la lista
        System.out.println("ArrayList: ");

        for (int cuenta = 0; cuenta < lista.size(); cuenta++)
                System.out.printf("%s ", lista.get(cuenta));
        // elimina de la lista los colores contenidos en eliminarLista
        eliminarColores(lista, eliminarLista);

        // imprime en pantalla el contenido de la lista
        System.out.printf("%n%nArrayList despues de llamar a eliminarColores:%n");

        for (String color : lista)
                System.out.printf("%s ", color);
}

        // elimina de coleccion1 los colores especificados en coleccion2
        private static void eliminarColores(Collection<String> coleccion1 ,
        Collection<String> coleccion2)
        {
            // obtiene el iterador
            Iterator<String> iterador = coleccion1.iterator();

        // itera mientras la colección tenga elementos
            while (iterador.hasNext())
            {
                if (coleccion2.contains(iterador.next()))
                iterador.remove(); // elimina el color actual
            }
        }
        
    }

