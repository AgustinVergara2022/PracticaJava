package OrdenarPalabrasTreeSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/*(Ordenar palabras con un objeto TreeSet) Escriba un programa que utilice el método split de String para
dividir en tokens una línea de texto introducida por el usuario, y que coloque cada token en un objeto TreeSet. Imprima
los elementos del objeto TreeSet. [Nota: esto debe hacer que se impriman los elementos en orden ascendente].*/
public class Main {
    public static void main(String[] args) {
        Set<String> arbol = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        
        // divide la entrada en tokens y agrega a TreeSet
            String[] tokens = texto.split(" ");
            for (String token : tokens) {
                arbol.add(token);
        }
            for (String palabra : arbol) {
                System.out.print(palabra);
        }
            scanner.close();
        }
}
