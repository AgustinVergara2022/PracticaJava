package com.mycompany.concesionaria.persistencia;

import com.mycompany.concesionaria.logica.Automovil;
import com.mycompany.concesionaria.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    AutomovilJpaController autoJpa = new AutomovilJpaController();

    public void guardar(Automovil auto) {
        autoJpa.create(auto);
    }

    public List<Automovil> traerAutos() {
        
        return autoJpa.findAutomovilEntities();
        
    }

    public void borrarAuto(int id) {
        try {
            autoJpa.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Automovil traerAuto(int id) {
        return autoJpa.findAutomovil(id);
    }


    public void modificarAuto(Automovil auto) {
        try {
            autoJpa.edit(auto);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
