package RevertirLista;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class RevertirLista {
    public static void main(String[] args) {
        LinkedList<Integer> listaOriginal = new LinkedList<>();
        listaOriginal.add(4);
        listaOriginal.add(8);
        listaOriginal.add(56);
        listaOriginal.add(16);
        listaOriginal.add(2);
        System.out.println(listaOriginal);
        Collections.reverse(listaOriginal);
        System.out.println(listaOriginal);
    }
}
