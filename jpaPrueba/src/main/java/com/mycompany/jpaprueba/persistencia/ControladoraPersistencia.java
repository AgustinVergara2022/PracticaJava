package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    AlumnoJpaController alumnoJPA = new AlumnoJpaController();
    CarreraJpaController carreraJPA = new CarreraJpaController();
    
    public void crearAlumno(Alumno alu){
        alumnoJPA.create(alu);
    }

    public void eliminarAlumno(int id) {
        try {
            alumnoJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alu) {
        try {
            alumnoJPA.edit(alu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return alumnoJPA.findAlumno(id);
    }
    
    public ArrayList<Alumno> traerListaAlumnos(){
        List<Alumno> lista = alumnoJPA.findAlumnoEntities();
        ArrayList<Alumno> listaAlumnos = new ArrayList (lista); 
        return listaAlumnos;
    }

    public void crearCarrera(Carrera carrera) {
        carreraJPA.create(carrera);
    }

    public void eliminarCarrera(int id) {
        try {
            carreraJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    public void editarCarrera(Carrera carrera) {
        try {
            carreraJPA.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return carreraJPA.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lista = carreraJPA.findCarreraEntities();
        ArrayList<Carrera> listaCarreras = new ArrayList (lista);
        return listaCarreras;
    }
    
}
