package OrdenarNombres;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class OrdenarNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listaNombres = new ArrayList<>();

        while(true) {
            System.out.println("Ingrese nombres, 0 para finalizar: ");
            String nombre = scanner.nextLine();
            if (nombre.equals("0")){
                break;
            } else {
                listaNombres.add(nombre);
            }
        }

        Collections.sort(listaNombres);
        System.out.println(listaNombres);

    }
}
