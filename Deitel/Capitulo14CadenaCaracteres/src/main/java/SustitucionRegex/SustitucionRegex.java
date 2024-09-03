package SustitucionRegex;
import java.util.Arrays;

public class SustitucionRegex {
    public static void main (String[] args)
    {
        
        String primeraCadena = "Este enunciado termina con 5 estrellas *****";
        String segundaCadena = "1, 2, 3, 4, 5, 6, 7, 8";

        System.out.printf("Cadena 1 original: %s%n", primeraCadena);
        
        // sustituye ‘*’ con ‘^’
        primeraCadena = primeraCadena.replaceAll("\\*", "^");
        
        System.out.printf("^ sustituyen a *: %s%n", primeraCadena);
        
        // sustituye ‘estrellas’ con ‘intercaladores’
        primeraCadena = primeraCadena.replaceAll("estrellas", "intercaladores");

        System.out.printf("\"intercaladores\" sustituye a \"estrellas\": %s%n", primeraCadena);

        // sustituye las palabras con ‘palabra’
        System.out.printf("Cada palabra se sustituye por \"palabra\": %s%n%n", primeraCadena.replaceAll("\\w+", "palabra"));

        System.out.printf("Cadena 2 original: %s%n", segundaCadena);

        // sustituye los primeros tres dígitos con ‘digito’
        for (int i = 0; i < 3; i++)
            segundaCadena = segundaCadena.replaceFirst("\\d", "digito");

        System.out.printf("Los primeros 3 digitos se sustituyeron por \"digito\" : %s%n", segundaCadena);

        System.out.print("Cadena dividida en comas: ");
        String[] resultados = segundaCadena.split(",\\s*"); // se divide en las comas
        System.out.println(Arrays.toString(resultados));
        
    }
}
