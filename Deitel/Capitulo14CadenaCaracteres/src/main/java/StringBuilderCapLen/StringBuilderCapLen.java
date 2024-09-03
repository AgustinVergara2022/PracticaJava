package StringBuilderCapLen;

public class StringBuilderCapLen {
    public static void main(String[] args)
    {
        StringBuilder buffer = new StringBuilder("Hola, como estas?");

        System.out.printf("buffer = %s%nlongitud = %d%ncapacidad = %d%n%n", buffer.toString(), buffer.length(), buffer.capacity());

        buffer.ensureCapacity(75);
        System.out.printf("Nueva capacidad = %d%n%n", buffer.capacity());

        buffer.setLength(10);
        System.out.printf("Nueva longitud = %d%nbuffer = %s%n", buffer.length(), buffer.toString());
    }
}
