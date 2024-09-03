package InterseccionDeConjuntos;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class InterseccionDeConjuntos {
    public static void main(String[] args) {
        HashSet<Integer> c1 = new HashSet<>();
        HashSet<Integer> c2 = new HashSet<>();
        c1.add(4);
        c1.add(8);
        c1.add(16);
        c1.add(15);
        c2.add(15);
        c2.add(4);
        c2.add(8);
        c2.add(44);
        c2.add(52);

        c1.retainAll(c2);
        for (Integer num : c1) {
            System.out.printf("%d ",num);
        }
    }
}
