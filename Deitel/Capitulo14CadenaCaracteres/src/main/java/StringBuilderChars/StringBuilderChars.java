package StringBuilderChars;

public class StringBuilderChars {
    public static void main (String[] args)
    {
        StringBuilder bufer = new StringBuilder("hola a todos");

        System.out.printf("bufer = %s%n", bufer.toString());
        System.out.printf("Caracter en 0: %s%nCaracter en 3: %s%n%n",bufer.charAt(0), bufer.charAt(4));

        char[] arregloChars = new char[bufer.length()];
        bufer.getChars(0, bufer.length(), arregloChars, 0);
        System.out.print("Los caracteres son: ");
        
        for (char caracter : arregloChars)
        System.out.print(caracter);

        bufer.setCharAt(0, 'H');
        bufer.setCharAt(6, 'T');
        System.out.printf("%n%nbufer = %s", bufer.toString());

        bufer.reverse();
        System.out.printf("%n%nbufer = %s%n", bufer.toString());
    }
}
