package UsoDeExcepciones;

public class UsoDeExcepciones {
    public static void main(String[] args)
    {
        try
        {
        lanzaExcepcion();
        }
        catch (Exception excepcion) // excepción lanzada por ThrowException
        {
            System.err.println("La excepcion se manejo en main");
        }

        noLanzaExcepcion();
    }

     // demuestra los bloques try...catch...finally
    public static void lanzaExcepcion() throws Exception
    {
        try // lanza una excepción y la atrapa de inmediato
        {
        System.out.println("Metodo lanzaExcepcion");
            throw new Exception(); // genera la excepción
        }
        catch (Exception excepcion) // atrapa la excepción lanzada en el bloque try
    {
        System.err.println("La excepcion se manejo en el metodo lanzaExcepcion" );
        throw excepcion; // vuelve a lanzar para procesarla más adelante
        
    // no se llegaría al código que se coloque aquí; se producirían errores de compilación

    }
        finally // se ejecuta sin importar lo que ocurra en los bloques try...catch
    {
        System.err.println("Se ejecuto finally en lanzaExcepcion");
    }

    // no se llegaría al código que se coloque aquí; se producirían errores de compilación

    }
    
    // demuestra el uso de finally cuando no ocurre una excepción
    public static void noLanzaExcepcion()
    {
        try // el bloque try no lanza una excepción
        {
            System.out.println("Metodo noLanzaExcepcion");
         } // fin de try
        catch (Exception excepcion) // no se ejecuta
        {
            System.err.println(excepcion);
        }
        finally // se ejecuta sin importar lo que ocurra en los bloques try...catch
        {
            System.err.println("Se ejecuto Finally en noLanzaExcepcion");
        }

        System.out.println("Fin del metodo noLanzaExcepcion");
        }
    
}
