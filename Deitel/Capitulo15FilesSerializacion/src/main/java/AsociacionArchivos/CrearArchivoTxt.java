package AsociacionArchivos;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.FormatterClosedException;

public class CrearArchivoTxt {
    
    private static Formatter salidaMaestro; // envía texto a antmaest.txt
    private static Formatter salidaTransacciones; // envía texto a trans.txt
    
    public static void main(String[] args)
    {
        abrirArchivoMaestro();
        agregarRegistrosMaestro();
        cerrarArchivoMaestro();
        
        abrirArchivoTransacciones();
        agregarRegistrosTransacciones();
        cerrarArchivoTransacciones();
    }

    public static void abrirArchivoMaestro()
    {
        try
        {
            salidaMaestro = new Formatter("antmaest.txt"); // abre el archivo
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error al abrir el archivo antmaest.txt. Terminando.");
            System.exit(1); // termina el programa
        }
    }
    
    public static void agregarRegistrosMaestro()
    {
        try {
            // Agregamos los datos de ejemplo al archivo maestro
            salidaMaestro.format("%d %s %s %.2f%n", 100, "Alan", "Jones", 348.17);
            salidaMaestro.format("%d %s %s %.2f%n", 300, "Mary", "Smith", 27.19);
            salidaMaestro.format("%d %s %s %.2f%n", 500, "Sam", "Sharp", 0.00);
            salidaMaestro.format("%d %s %s %.2f%n", 700, "Susy", "Green", -14.22);
        }
        catch (FormatterClosedException formatterClosedException)
        {
            System.err.println("Error al escribir en el archivo antmaest.txt. Terminando.");
        }
    }

    public static void cerrarArchivoMaestro()
    {
        if (salidaMaestro != null)
            salidaMaestro.close();
    }

    public static void abrirArchivoTransacciones()
    {
        try
        {
            salidaTransacciones = new Formatter("trans.txt"); // abre el archivo
        }
        catch (FileNotFoundException fileNotFoundException)
        {
            System.err.println("Error al abrir el archivo trans.txt. Terminando.");
            System.exit(1); // termina el programa
        }
    }
    
    public static void agregarRegistrosTransacciones()
    {
        try {
            // Agregamos los datos de ejemplo al archivo de transacciones
            salidaTransacciones.format("%d %.2f%n", 100, 27.14);
            salidaTransacciones.format("%d %.2f%n", 300, 62.11);
            salidaTransacciones.format("%d %.2f%n", 400, 100.56);
            salidaTransacciones.format("%d %.2f%n", 900, 82.17);
        }
        catch (FormatterClosedException formatterClosedException)
        {
            System.err.println("Error al escribir en el archivo trans.txt. Terminando.");
        }
    }

    public static void cerrarArchivoTransacciones()
    {
        if (salidaTransacciones != null)
            salidaTransacciones.close();
    }
}


