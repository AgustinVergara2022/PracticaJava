package CompararObjetos;

import java.util.Scanner;


/*Escriba una aplicación que utilice el método regionMatches
de la clase String para comparar dos cadenas introducidas por el usuario. La aplicación deberá recibir como entrada
el número de caracteres a comparar y el índice inicial de la comparación. La aplicación deberá indicar si
las cadenas son iguales. Ignore si los caracteres están en mayúsculas o en minúsculas al momento de realizar la
comparación.*/
public class CompararPorciones {
    public static void main (String[] args)
    {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese una cadena de texto: ");
         String texto1 = scanner.nextLine();
         System.out.print("Ingrese una cadena de texto: ");
         String texto2 = scanner.nextLine();
         
         System.out.print("Introduce el número de caracteres a comparar: ");
        int numCaracteres = scanner.nextInt();

        System.out.print("Introduce el índice inicial de la comparación: ");
        int indiceInicial = scanner.nextInt();

        boolean sonIguales = texto1.regionMatches(true, indiceInicial, texto2, indiceInicial, numCaracteres);

        if (sonIguales) {
            System.out.println("Las cadenas son iguales en la región especificada.");
        } else {
            System.out.println("Las cadenas son diferentes en la región especificada.");
        }

        scanner.close();
         
         
    }
}
