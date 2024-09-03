package DividirStringEnTokens;

import java.util.Scanner;

/*Escriba una aplicación que lea una línea de texto, que
divida la línea en tokens utilizando caracteres de espacio como delimitadores, y que imprima sólo aquellas palabras
que comiencen con la letra “b”.*/

public class Dividir 
{
    
    
    private void dividirTexto(String texto)
    {
        String[] tokens = texto.split(" ");
        for (String token : tokens){
            if (token.startsWith("b")){
                System.out.println(token);
            }
        }
    }
    
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        Dividir app = new Dividir();
        
        
        app.dividirTexto("bebelo reynoso boludo");
        
    }
}
