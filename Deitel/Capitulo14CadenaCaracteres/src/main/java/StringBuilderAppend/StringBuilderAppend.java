package StringBuilderAppend;

public class StringBuilderAppend {
    public static void main (String[] args)
    {
        Object refObjeto = "hola";
        String cadena = "adios";
        char[] arregloChar = {'a', 'b', 'c', 'd', 'e', 'f'};
        boolean valorBoolean = true;
        char valorChar = 'Z';
        int valorInt = 7;
        long valorLong = 10000000000L;
        float valorFloat = 2.5f;
        double valorDouble = 33.333;
        
        
        StringBuilder ultimoBufer = new StringBuilder("ultimo bufer");
        StringBuilder bufer = new StringBuilder();
        
        bufer.append(refObjeto)
                 .append("\n")
                .append(cadena)
                .append("\n")
                .append(arregloChar)
                .append("\n")
                .append(arregloChar, 0, 3)
                .append("\n")
                .append(valorBoolean)
                .append("\n")
                .append(valorChar)
                .append("\n")
                .append(valorInt)
                .append("\n")
                .append(valorLong)
                .append("\n")
                .append(valorFloat)
                .append("\n")
                .append(valorDouble)
                .append("\n")
                .append(ultimoBufer);

        System.out.printf("bufer contiene%n%s%n", bufer.toString());
    }
}
