package BusquedaString;

import java.util.Scanner;


public class BusquedaCaracter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una línea de texto
        System.out.print("Ingrese una línea de texto: ");
        String texto = scanner.nextLine();

        // Solicitar al usuario que ingrese el carácter de búsqueda
        System.out.print("Ingrese el carácter a buscar: ");
        char caracter = scanner.next().charAt(0);

        // Contador para almacenar el número de ocurrencias del carácter
        int numOcurrencias = 0;

        // Buscar ocurrencias del carácter en el texto utilizando indexOf
        int index = texto.indexOf(caracter);
        while (index != -1) {
            numOcurrencias++;
            index = texto.indexOf(caracter, index + 1);
        }

        // Mostrar el número de ocurrencias del carácter en el texto
        System.out.println("El carácter '" + caracter + "' aparece " + numOcurrencias + " veces en el texto.");
    }
}

