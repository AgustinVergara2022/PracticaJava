package ContarLetras;

import java.util.HashMap;
import java.util.Scanner;

public class ContarLetras {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa una cadena de texto:");
        String texto = scanner.nextLine();

        // Contar la frecuencia de letras, ignorando espacios
        HashMap<Character, Integer> frecuenciaLetras = contarFrecuenciaLetras(texto);

        // Mostrar el resultado
        System.out.println("Frecuencia de letras:");
        for (HashMap.Entry<Character, Integer> entry : frecuenciaLetras.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }

    public static HashMap<Character, Integer> contarFrecuenciaLetras(String texto) {
        texto = texto.toLowerCase(); // Convertir todo a minúsculas

        HashMap<Character, Integer> contadorLetras = new HashMap<>();

        // Recorrer cada carácter en la cadena de texto
        for (char letra : texto.toCharArray()) {
            if (letra != ' ') { // Ignorar los espacios
                if (contadorLetras.containsKey(letra)) {
                    // Si la letra ya está en el mapa, incrementa su contador
                    contadorLetras.put(letra, contadorLetras.get(letra) + 1);
                } else {
                    // Si la letra no está en el mapa, agrégala con un contador de 1
                    contadorLetras.put(letra, 1);
                }
            }
        }

        return contadorLetras;
    }
}
