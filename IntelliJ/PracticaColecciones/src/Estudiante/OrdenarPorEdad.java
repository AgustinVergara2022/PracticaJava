package Estudiante;

import java.util.ArrayList;
import java.util.Comparator;

public class OrdenarPorEdad {
    public static void main(String[] args) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        Estudiante estudiante1 = new Estudiante("Carlos", 15);
        Estudiante estudiante2 = new Estudiante("Lorena", 29);
        Estudiante estudiante3 = new Estudiante("Shady", 27);

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);

        listaEstudiantes.sort(Comparator.comparingInt(Estudiante::getEdad));
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.getNombre() + " - " + estudiante.getEdad() + " años");
        }


    }
}
