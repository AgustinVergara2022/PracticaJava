package ConvertirMayusculaMinuscula;

import java.util.Scanner;


public class Conversor {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
        scanner.close();
        System.out.printf("Texto en mayusculas: %s%n",texto.toUpperCase());
        System.out.printf("Texto en minusculas: %s",texto.toLowerCase());
        
    }
}
