package com.mycompany.concesionaria.logica;

import com.mycompany.concesionaria.persistencia.ControladoraPersistencia;
import java.util.List;

public class ControladoraLogica {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Automovil auto = new Automovil();
        
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);
        
        
        
        controlPersis.guardar(auto);
    }

    public List<Automovil> traerAutos() {
        
        return controlPersis.traerAutos();
        
    }

    public void borrarAuto(int id) {
        controlPersis.borrarAuto(id);
    }

    public Automovil traerAuto(int id) {
        return controlPersis.traerAuto(id);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
       auto.setModelo(modelo);
       auto.setMarca(marca);
       auto.setMotor(motor);
       auto.setColor(color);
       auto.setPatente(patente);
       auto.setCantPuertas(cantPuertas);
        
        controlPersis.modificarAuto(auto);
    }
}
