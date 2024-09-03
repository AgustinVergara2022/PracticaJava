/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClaseAbstracta;

/**
 *
 * @author Agustín
 */
public class PruebaFigura {
    public static void main (String[] args){
        
        Circulo circulo = new Circulo (10);
        Rectangulo rectangulo = new Rectangulo(6,8);
        
        circulo.imprimirInformacion();
        System.out.println("El area del circulo es: "+circulo.calcularArea());
        rectangulo.imprimirInformacion();
        System.out.println("El area del rectangulo es: "+rectangulo.calcularArea());
        
        
    }
}
