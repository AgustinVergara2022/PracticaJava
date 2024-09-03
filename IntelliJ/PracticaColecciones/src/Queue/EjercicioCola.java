package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class EjercicioCola {
    public static void main(String[] args) {
        Queue<Integer> cola = new LinkedList<>();
        cola.add(1);
        cola.add(3);
        cola.add(2);
        cola.add(5);
        cola.add(6);

        while(!cola.isEmpty()){
            Integer cliente = cola.poll(); //retira el primer elemento de la cola
            System.out.println("Atendiendo al cliente nro "+cliente);
        }

    }
}
