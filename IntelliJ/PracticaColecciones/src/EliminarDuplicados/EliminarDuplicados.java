package EliminarDuplicados;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.Set;

public class EliminarDuplicados {
    public static void main(String[] args) {
        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(4);
        listaNumeros.add(7);
        listaNumeros.add(4);
        listaNumeros.add(9);
        listaNumeros.add(9);
        listaNumeros.add(92);
        HashSet<Integer> listaNumerosUnicos = new HashSet<>(listaNumeros);

        System.out.println(listaNumerosUnicos);
}
}