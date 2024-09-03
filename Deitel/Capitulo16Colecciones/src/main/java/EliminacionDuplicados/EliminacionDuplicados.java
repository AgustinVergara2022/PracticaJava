package EliminacionDuplicados;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

/*Escriba un programa que lea una serie de nombres de pila y elimine duplicados
almacenándolos en un objeto Set. Permita al usuario buscar un nombre de pila.*/
public class EliminacionDuplicados {
    public static void main (String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        String [] listaNombres = {"Carlos","Julian","Pedro","Maria","Julian","Cristian","Jesse", "Walter", "Saul","Carlos"};
        List<String> nombres = Arrays.asList(listaNombres);
    
        System.out.printf("Nombres: %s%n", nombres);
    
        System.out.println("Nombres luego de eliminar duplicados");
        eliminarDuplicados(nombres);
        
        System.out.println("Desea buscar un nombre? ");
        String respuesta = entrada.next();
        while(!respuesta.equalsIgnoreCase("no"))
        {
            System.out.println("Ingrese el nombre a buscar: ");
            String nombreBuscado = entrada.next();
            Collections.sort(nombres);
            imprimirResultadosBusqueda(nombres,nombreBuscado);
            
            System.out.println("Desea buscar otro nombre? (sí/no) ");
            respuesta = entrada.next();
            
        }
}
    
    public static void eliminarDuplicados(List<String> lista){
        
        Set<String> conjunto = new HashSet<>(lista);
        
        for(String valor : conjunto)
            System.out.printf(" %s",valor);
            System.out.println();
    }
    
     private static void imprimirResultadosBusqueda(
    List<String> lista, String clave)
    {
        int resultado = 0;

        System.out.printf("%nBuscando: %s%n", clave);
        resultado = Collections.binarySearch(lista, clave);

        if (resultado >= 0)
            System.out.printf("Se encontro en el indice %d%n", resultado);
        else
            System.out.printf("No se encontro (%d)%n",resultado);
    }
}
    

    