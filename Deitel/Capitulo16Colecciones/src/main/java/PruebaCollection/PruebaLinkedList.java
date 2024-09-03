package PruebaCollection;

import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

public class PruebaLinkedList {
    public static void main (String[] args){
        // agrega elementos de colores a lista1
        String[] colores =
            {"negro", "amarillo", "verde", "azul", "violeta", "plateado"};
        List<String> lista1 = new LinkedList<>();

        for (String color : colores)
            lista1.add(color);

        // agrega elementos de colores2 a lista2
        String[] colores2 =
            {"dorado", "blanco", "cafe", "azul", "gris", "plateado"};
        List<String> lista2 = new LinkedList<>();

        for (String color : colores2)
            lista2.add(color);

        lista1.addAll(lista2); // concatena las listas
        lista2 = null; // libera los recursos
        imprimirLista(lista1); // imprime los elementos de lista1

        convertirCadenasAMayusculas(lista1); // convierte cadena a mayúsculas
        imprimirLista(lista1); // imprime los elementos de lista1

        System.out.printf("%nEliminando elementos 4 a 6...");
        eliminarElementos(lista1, 4, 7); // elimina los elementos 4 a 6 de la lista
        imprimirLista(lista1); // imprime los elementos de lista1
        imprimirListaInversa(lista1); // imprime la lista en orden inverso
            
    }
    
    // imprime el contenido del objeto List
    private static void imprimirLista(List<String> lista )
    {
        System.out.printf("%nlista:%n");

        for (String color : lista)
            System.out.printf("%s ", color);

        System.out.println();
    }
    
    // localiza los objetos String y los convierte a mayúsculas
   private static void convertirCadenasAMayusculas(List<String> lista ){
       ListIterator<String> iterador = lista.listIterator();
       while (iterador.hasNext())
       {
            String color = iterador.next(); // obtiene elemento
            iterador.set(color.toUpperCase()); // convierte a mayúsculas
        }
   }
    
   // obtiene sublista y utiliza el método clear para eliminar los elementos de la misma
    private static void eliminarElementos(List<String> lista ,
        int inicio, int fin)
    {
        lista.subList(inicio, fin).clear(); // elimina los elementos
    }

    // imprime la lista inversa
    private static void imprimirListaInversa(List<String> lista )
    {
        ListIterator<String> iterador = lista.listIterator(lista.size());

        System.out.printf("%nLista inversa:%n");

    // imprime la lista en orden inverso
    while (iterador.hasPrevious())
        System.out.printf("%s ", iterador.previous());
    }
}
