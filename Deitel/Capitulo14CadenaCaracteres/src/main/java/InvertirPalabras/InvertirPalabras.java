package InvertirPalabras;

import java.util.Scanner;

public class InvertirPalabras {
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese un texto: ");
        String texto = scanner.nextLine();
      
        String[] tokens = texto.split(" ");
        
        System.out.print("Texto invertido: ");
        for(int i = tokens.length - 1; i>=0 ;i--){
            String textoInvertido = new StringBuilder(tokens[i]).reverse().toString();
            System.out.print(textoInvertido);
        }
    }
}
