package VariosString;

public class VariosString2 {
    public static void main(String[] args){
        
        String s1 = "hola";
        String s2 = "ADIOS";
        String s3 = " espacios ";

        System.out.printf("s1 = %s%ns2 = %s%ns3 = %s%n%n", s1, s2, s3);

        // prueba del método replace
        System.out.printf("Remplazar ‘l’ con ‘L’ en s1: %s%n%n", s1.replace('l', 'L'));

        // prueba de toLowerCase y toUpperCase
        System.out.printf("s1.toUpperCase() = %s%n", s1.toUpperCase());
        System.out.printf("s2.toLowerCase() = %s%n%n", s2.toLowerCase());
        
        // test trim method
        System.out.printf("s3 despues de trim = \"%s\"%n%n", s3.trim());

        // prueba del método toCharArray
        char[] arregloChar = s1.toCharArray();
        System.out.print("s1 como arreglo de caracteres = ");

        for (char caracter : arregloChar)
        System.out.print(caracter);

        System.out.println();
        
        
    }
}
