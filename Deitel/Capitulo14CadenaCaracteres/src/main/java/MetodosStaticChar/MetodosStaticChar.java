package MetodosStaticChar;

import java.util.Scanner;

public class MetodosStaticChar {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in); // crea objeto scanner
        System.out.println("Escriba un caracter y oprima Intro");
        String entrada = scanner.next();
        char c = entrada.charAt(0); // obtiene el caracter de entrada

        // muestra información sobre los caracteres
        System.out.printf("esta definido: %b%n", Character.isDefined(c));
        System.out.printf("es digito: %b%n", Character.isDigit(c));
        System.out.printf("es el primer caracter en un identificador de Java: %b%n",
        Character.isJavaIdentifierStart(c));
        System.out.printf("es parte de un identificador de Java: %b%n",
        Character.isJavaIdentifierPart(c));
        System.out.printf("es letra: %b%n", Character.isLetter(c));
        System.out.printf("es letra o digito: %b%n", Character.isLetterOrDigit(c));
        System.out.printf("es minuscula: %b%n", Character.isLowerCase(c));
        System.out.printf("es mayuscula: %b%n", Character.isUpperCase(c));
        System.out.printf("a mayuscula: %s%n", Character.toUpperCase(c));
        System.out.printf("a minuscula: %s%n", Character.toLowerCase(c));
    }
}
