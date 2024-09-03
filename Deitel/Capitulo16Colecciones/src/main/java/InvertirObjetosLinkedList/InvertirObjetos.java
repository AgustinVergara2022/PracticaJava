package InvertirObjetosLinkedList;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/*(Copiar e invertir objetos LinkedList) Escriba un programa que cree un objeto LinkedList de 10 caracteres;
después el programa debe crear un segundo objeto LinkedList que contenga una copia de la primera lista,
pero en orden inverso.*/
public class InvertirObjetos {
    public static void main (String[] args){
        
        String[] caracteres = {"a", "2","b","44","c","d","ef","g","h","10"};
       
        List<String> listaOrig = new LinkedList<>();
        List<String> listaInversa = new LinkedList<>(); 
        
        for (String c : caracteres)
            listaOrig.add(c);
        
        System.out.println("Lista original " + listaOrig);
        
        listaInversa = new LinkedList<>(Arrays.asList(new String[listaOrig.size()]));
        Collections.copy(listaInversa, listaOrig);
        Collections.reverse(listaInversa); 
        System.out.println("Lista invertida: "+listaInversa);
    }
    
}
