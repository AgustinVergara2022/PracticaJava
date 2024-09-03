package UsoDeExcepciones2;

public class UsoDeExcepciones2 {
    public static void main(String[] args)
    {
        try
    {
        metodo1();
    }
        catch (Exception excepcion) // atrapa la excepción lanzada en metodo1
    {
        System.err.printf("%s%n%n", excepcion.getMessage());
        excepcion.printStackTrace();
        
        // obtiene la información de rastreo de la pila
        StackTraceElement[] elementosRastreo = excepcion.getStackTrace();

        System.out.println("%nRastreo de la pila de getStackTrace:%n");
        System.out.println( "Clase\t\t\tArchivo\t\t\tLinea\tMetodo");

        // itera a través de elementosRastreo para obtener la descripción de la excepción
    for (StackTraceElement elemento : elementosRastreo)
    {
        System.out.printf("%s\t", elemento.getClassName());
        System.out.printf("%s\t", elemento.getFileName());
        System.out.printf("%s\t", elemento.getLineNumber());
        System.out.printf("%s%n", elemento.getMethodName());
    }
    }
    } // fin de main
    
    // llama a metodo2; lanza las excepciones de vuelta a main
    public static void metodo1() throws Exception
    {
        metodo2();
    }
    
    // llama a metodo3; lanza las excepciones de vuelta a metodo1
    public static void metodo2() throws Exception
    {
        metodo3();
    }

    // lanza la excepción Exception de vuelta a metodo2
    public static void metodo3() throws Exception
    {
        throw new Exception("La excepcion se lanzo en metodo3");
    }
    
}
