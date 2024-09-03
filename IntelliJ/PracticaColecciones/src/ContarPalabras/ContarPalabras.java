package ContarPalabras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContarPalabras {

    public static void main(String[] args) {
        // 1. Leer la cadena de texto
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto:");
        String texto = scanner.nextLine();

        // 2. Contar la frecuencia de palabras usando la función separada
        HashMap<String, Integer> frecuenciaPalabras = contarFrecuenciaPalabras(texto);

        // 3. Mostrar el resultado
        System.out.println("Frecuencia de palabras:");
        for (HashMap.Entry<String, Integer> entry : frecuenciaPalabras.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    // Función separada para contar la frecuencia de palabras
    public static HashMap<String, Integer> contarFrecuenciaPalabras(String texto) {
        // Convertir la cadena a minúsculas
        texto = texto.toLowerCase();

        // Dividir la cadena en palabras
        String[] palabras = texto.split(" ");

        // Usar un HashMap para contar las palabras
        HashMap<String, Integer> contadorPalabras = new HashMap<>();

        for (String palabra : palabras) {
            if (contadorPalabras.containsKey(palabra)) {
                // Si la palabra ya está en el mapa, incrementa su contador
                contadorPalabras.put(palabra, contadorPalabras.get(palabra) + 1);
            } else {
                // Si la palabra no está en el mapa, agrégala con un contador de 1
                contadorPalabras.put(palabra, 1);
            }
        }

        return contadorPalabras;
    }
}





