package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import java.util.Date;

public class JpaPrueba {

    public static void main(String[] args) {
        
       Controladora control = new Controladora();
       
       //Creacion carrera
       Carrera carrera = new Carrera(20, "Ingenieria en Sistemas de Información");
       //Guardado carrera en DB
       control.crearCarrera(carrera);
       //Creacion de alumno (con carrera)
       Alumno alumno = new Alumno(23, "Carlos","Zaravia", new Date(),carrera);
       //Guardar alumno en DB
       control.crearAlumno(alumno);
       
        System.out.println("-------------------------------");
        Alumno alu = control.traerAlumno(23);
        System.out.printf("Alumno: %s %s%n",alumno.getNombre(),alumno.getApellido());
        System.out.printf("Cursa la carrera: %s%n",alu.getCarrera().getNombre());
       
    }
}
