package Diccionario;

import java.util.*;

public class Diccionario {
    private static HashMap<String, List<String>> diccionario = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> sinonimos = new ArrayList<>();
        agregarPalabra(diccionario, "feliz", Arrays.asList("alegre", "contento", "happy"));

        while (true) {
            System.out.print("Ingresa una palabra para buscar en el diccionario o escriba 'salir' para terminar: ");
            String palabraBuscada = scanner.nextLine();
            if (palabraBuscada.equals("salir")) {
                break;
            }

            // Buscar la palabra ingresada en el diccionario
            List<String> palabrasAsociadas = buscarPalabra(palabraBuscada);
        }

        scanner.close();
    }

    public static void agregarPalabra(HashMap<String, List<String>> diccionario, String palabra, List<String> sinonimos) {
        diccionario.put(palabra.toLowerCase(), sinonimos);
    }

    public static List<String> buscarPalabra(String palabraBuscada) {
        List<String> sinonimos = diccionario.get(palabraBuscada.toLowerCase());

        if (sinonimos != null) {
            System.out.println("Sinónimos de '" + palabraBuscada + "': " + sinonimos);
        } else {
            System.out.println("La palabra '" + palabraBuscada + "' no se encontró en el diccionario.");
        }

        return sinonimos;
    }
}