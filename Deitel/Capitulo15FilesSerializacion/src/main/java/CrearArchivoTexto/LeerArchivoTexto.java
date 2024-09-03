package CrearArchivoTexto;

import java.io.IOException;
import java.lang.IllegalStateException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class LeerArchivoTexto {
    
    private static Scanner entrada;

     public static void main(String[] args)
    {
        abrirArchivo();
        leerRegistros();
        cerrarArchivo();
    }

     // abre el archivo clientes.txt
    public static void abrirArchivo()
    {
        try
    {
        entrada = new Scanner(Paths.get("clientes.txt"));
    }
        catch (IOException ioException)
        {
            System.err.println("Error al abrir el archivo. Terminando.");
            System.exit(1);
        }
    }

        // lee registro del archivo
        public static void leerRegistros()
        {
            System.out.printf("%-10s%-12s%-12s%10s%n", "Cuenta",
            "Primer nombre", " Apellido paterno", "Saldo");
        try
        {
        while (entrada.hasNext()) // mientras haya más qué leer
        {
        // muestra el contenido del registro
        System.out.printf("%-10d%-12s%-12s%10.2f%n", entrada.nextInt(),entrada.next(), entrada.next(), entrada.nextDouble());
        }
        }
        catch (NoSuchElementException elementException)
        {
            System.err.println("El archivo no esta bien formado. Terminando.");
        }
        catch (IllegalStateException stateException)
        {
            System.err.println("Error al leer del archivo. Terminando.");
         }
        } // fin del método leerRegistros

// cierra el archivo y termina la aplicación    
      public static void cerrarArchivo()
    {
        if (entrada != null)
        entrada.close();
    }
} // fin de la clase LeerArchivoTexto
    

