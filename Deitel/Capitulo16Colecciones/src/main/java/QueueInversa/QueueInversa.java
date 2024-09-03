package QueueInversa;

import java.util.Comparator;
import java.util.PriorityQueue;


public class QueueInversa
{
    public static void main(String[] args)
    {
        Comparator<Double> comparadorInverso = (s1, s2) -> s2.compareTo(s1);
        // cola con capacidad de 11
        
        PriorityQueue<Double> cola = new PriorityQueue<>(comparadorInverso);
            
        // inserta elementos en la cola
        cola.offer(3.2);
        cola.offer(9.8);
        cola.offer(5.4);

        System.out.print("Sondeando de cola: ");

        // muestra los elementos en la cola
        while (cola.size() > 0)
        {
            System.out.printf("%.1f ", cola.peek()); // ve el elemento superior
            cola.poll(); // elimina el elemento superior
        }
    }
} // fin de la clase PruebaPriorityQueue

