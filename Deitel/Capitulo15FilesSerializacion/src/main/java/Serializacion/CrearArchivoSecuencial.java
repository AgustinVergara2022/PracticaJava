package Serializacion;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CrearArchivoSecuencial {
    
    private static ObjectOutputStream salida; // envía los datos a un archivo
    
    public static void main(String[] args)
    {
        abrirArchivo();
        agregarRegistros();
        cerrarArchivo();
    }

    // abre el archivo clientes.ser
    public static void abrirArchivo()
    {
         try
        {
            salida = new ObjectOutputStream(Files.newOutputStream(Paths.get("clientes.ser")));
        }
        catch (IOException ioException)
        {
            System.err.println("Error al abrir el archivo. Terminando.");
            System.exit(1); // termina el programa
        }
    }

    // agrega registros al archivo
    public static void agregarRegistros()
    {
        Scanner entrada = new Scanner(System.in);

        System.out.printf("%s%n%s%n? ","Escriba numero de cuenta, primer nombre, apellido paterno y saldo.",
                "Escriba el indicador de fin de archivo para terminar la entrada.");
        while (entrada.hasNext()) // itera hasta el indicador de fin de archivo
        {
            try
            {
             // crea nuevo registro; este ejemplo asume una entrada válida
            Cuenta registro = new Cuenta(entrada.nextInt(),entrada.next(), entrada.next(), entrada.nextDouble());

           // serializa el objeto registro en el archivo
            salida.writeObject(registro);
            }
            catch (NoSuchElementException elementException)
            {
                System.err.println("Entrada invalida. Intente de nuevo.");
                entrada.nextLine(); // descarta la entrada para que el usuario pueda intentar de nuevo
            }
            catch (IOException ioException)
            {
                System.err.println("Error al escribir en el archivo. Terminando.");
            break;
            }
                System.out.print("? ");
        }
    }

    // cierra el archivo y termina la aplicación
    public static void cerrarArchivo()
    {
        try
        {
            if (salida != null)
            salida.close();
        }
        catch (IOException ioException)
        {
            System.err.println("Error al cerrar el archivo. Terminando.");
        }
    }
    
}
