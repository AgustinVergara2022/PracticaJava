package EliminacionPalabrasDuplicadas;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;


/*
Escriba un programa que reciba un enunciado del usuario (asuma
que no hay signos de puntuación), luego determine y muestre las palabras únicas en orden alfabético. Trate igual las
letras mayúsculas y minúsculas.
*/
public class EliminadorPalabrasDuplicadas {
    
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un enunciado:");
        String sentence = scanner.nextLine();
        
        String[] words = sentence.toLowerCase().split(" ");
        
        // Obtener palabras únicas en orden alfabético
        String uniqueWords = Arrays.stream(words)
                                    .distinct()
                                    .sorted()
                                    .collect(Collectors.joining(" "));
        
        System.out.println("Palabras únicas en orden alfabético: " + uniqueWords);
        
        scanner.close();
        
    }
    
    
    
}
