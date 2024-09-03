package IntStreamAleatorio;

import java.security.SecureRandom;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

    public class IntStreamAleatorio
    {
        public static void main(String[] args)
        {
            SecureRandom aleatorio = new SecureRandom();

            // tira un dado 6,000,000 de veces y sintetiza los resultados
            System.out.printf("%-6s%s%n", "Cara", "Frecuencia");
            aleatorio.ints(6_000_000, 1, 7)
                    .boxed()
                    .collect(Collectors.groupingBy(Function.identity(),
            Collectors.counting()))
                    .forEach((cara, frecuencia) ->
            System.out.printf("%-6d%d%n", cara, frecuencia));
        }
    } // fin de la clase IntStreamAleatorio
