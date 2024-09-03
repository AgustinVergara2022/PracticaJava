package CompararObjetos;

import java.util.Scanner;


/*Escriba una aplicación que utilice el método compareTo de la clase String
para comparar dos cadenas introducidas por el usuario. Muestre si la primera cadena es menor, igual o mayor que
la segunda.*/
public class CompararObjetos {
    public static void main (String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto1 = scanner.nextLine();
        System.out.print("Ingrese una cadena de texto: ");
        String texto2 = scanner.nextLine();
        
        int resultado = texto1.compareTo(texto2);
        if (resultado < 0){
            System.out.println("La primer cadena es menor a la segunda");
        } else if (resultado == 0){
            System.out.println("La cadenas son iguales");
        } else
            System.out.println("La primer cadena es mayor a la segunda");
        
        scanner.close();
    }
    
}
