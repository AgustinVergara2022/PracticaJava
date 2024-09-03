package MetodosDeColecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMethod {
    public static void main(String[] args) {
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Carlos", 30));
        personas.add(new Persona("Ana", 25));
        personas.add(new Persona("Beatriz", 22));
        personas.add(new Persona("Daniel", 28));

        System.out.println("Lista original:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar por nombre usando Comparator
        Collections.sort(personas, new NombreComparator());
        System.out.println("\nLista ordenada por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar por edad usando Comparator
        Collections.sort(personas, new EdadComparator());
        System.out.println("\nLista ordenada por edad:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

     
    }
}

class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + ")";
    }
}

class NombreComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return p1.getNombre().compareTo(p2.getNombre());
    }
}

class EdadComparator implements Comparator<Persona> {
    @Override
    public int compare(Persona p1, Persona p2) {
        return Integer.compare(p1.getEdad(), p2.getEdad());
    }
}
