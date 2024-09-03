package InsercionElementosEnLinkedList;

import java.util.LinkedList;
import java.util.Random;

public class Insercion {
    public static void main(String[] args) {
        LinkedList<Integer> lista = new LinkedList<>();
        Random random = new Random();

        // Inserta 25 enteros aleatorios de 0 a 100 en la lista en orden
        for (int i = 0; i < 25; i++) {
            int numero = random.nextInt(101);
            insertarEnOrden(lista, numero);
        }

        // Calcula la suma de los elementos
        int suma = 0;
        for (int numero : lista) {
            suma += numero;
        }

        // Calcula el promedio
        double promedio = (double) suma / lista.size();

        // Muestra los resultados
        System.out.println("Lista ordenada: " + lista);
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }

    // Método para insertar un número en orden en una lista
    private static void insertarEnOrden(LinkedList<Integer> lista, int numero) {
        int i = 0;
        // Encuentra la posición correcta para insertar el número
        while (i < lista.size() && lista.get(i) < numero) {
            i++;
        }
        lista.add(i, numero); // Inserta el número en la posición encontrada
    }
}

