import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class PruebaBusquedaLineal {

    public static int busquedaLineal(int datos[], int claveBusqueda)
    {
        // itera a través del arreglo en forma secuencial
        for (int indice = 0; indice < datos.length; indice++)
            if (datos[indice] == claveBusqueda)
                return indice; // devuelve el índice del entero

        return -1; // no se encontró el entero
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SecureRandom generador = new SecureRandom();

        int[] datos = new int[10]; // crea arreglo

        for (int i = 0; i < datos.length; i++) // llena el arreglo
            datos[i] = 10 + generador.nextInt(90);
        System.out.printf("%s%n%n", Arrays.toString(datos)); // muestra el arreglo

        // obtiene la entrada del usuario
        System.out.print("Escriba un valor entero (-1 para terminar): ");
        int enteroBusqueda = entrada.nextInt();

        // recibe en forma repetida un entero como entrada; -1 termina el programa
        while (enteroBusqueda != -1)
        {
            int posicion = busquedaLineal(datos, enteroBusqueda); // realiza busqueda

            if (posicion == -1) // no se encontró
                System.out.printf("%d no se encontro%n%n", enteroBusqueda);
            else // se encontró
                System.out.printf("%d se encontro en la posicion %d%n%n", enteroBusqueda, posicion);

            // obtiene la entrada del usuario
            System.out.print("Escriba un valor entero (-1 para terminar): ");
                enteroBusqueda = entrada.nextInt();
        }

    }

}
