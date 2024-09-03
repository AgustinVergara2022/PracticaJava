
package Rectangulo;

import java.util.Scanner;


public class PruebaRectangulo {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        Rectangulo rectangulo = new Rectangulo(1.0, 1.0);
        
        System.out.print("Ingrese la longitud: ");
        double longitud = scanner.nextDouble();
        rectangulo.setLongitud(longitud);
        
        
        System.out.print("Ingrese la anchura: ");
        double anchura = scanner.nextDouble();
        rectangulo.setAnchura(anchura);
        
        double perimetro = rectangulo.calculaPerimetro(rectangulo.getLongitud(),rectangulo.getAnchura());
        double area = rectangulo.calculaArea(rectangulo.getLongitud(),rectangulo.getAnchura());
        
        System.out.println("El perimetro del rectangulo es: "+ perimetro );
        System.out.println("El area del rectangulo es: "+ area);
    }   
        
    }

