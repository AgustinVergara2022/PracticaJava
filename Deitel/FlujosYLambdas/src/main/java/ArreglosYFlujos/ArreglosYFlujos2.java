package ArreglosYFlujos;

// Demostración de las lambdas y los flujos con un arreglo de objetos String.
import java.util.Arrays;
import java.util.stream.Collectors;

    public class ArreglosYFlujos2
    {
        public static void main(String[] args)
        {
            String[] cadenas = {"Rojo", "naranja", "Amarillo", "verde", "Azul", "indigo", "Violeta"};

            // muestra las cadenas originales
            System.out.printf("Cadenas originales: %s%n", Arrays.asList(cadenas));
            
            // cadenas en mayúscula
            System.out.printf("cadenas en mayuscula: %s%n",
                Arrays.stream(cadenas)
                    .map(String::toUpperCase)
                    .collect(Collectors.toList()));

            // cadenas mayores que “m” (sin susceptibilidad al uso de mayúsculas/minúsculas) en orden ascendente
            System.out.printf("cadenas mayores que m en orden ascendente: %s%n",
            Arrays.stream(cadenas)
                    .filter(s -> s.compareToIgnoreCase("m") > 0)
                    .sorted(String.CASE_INSENSITIVE_ORDER)
                    .collect(Collectors.toList()));

            // cadenas mayores que “m” (sin susceptibilidad al uso de mayúsculas/minúsculas) en orden descendente
            System.out.printf("cadenas mayores que m en orden descendente: %s%n",
                    Arrays.stream(cadenas)
                    .filter(s -> s.compareToIgnoreCase("m") > 0)
                    .sorted(String.CASE_INSENSITIVE_ORDER.reversed())
                    .collect(Collectors.toList()));
        }
} // fin de la clase ArreglosYFlujos2