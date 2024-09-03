package com.mycompany.peluqueriacanina.logica;

import com.mycompany.peluqueriacanina.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMascota, String raza, String color, 
            String observaciones, String alergico, String atenEsp, 
            String nombreDuenio, String celDuenio) {
        
        //Creamos dueño y asignamos valores
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        //Creamos mascota y asignamos valores
        Mascota mascota = new Mascota();
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setAlergico(alergico);
        mascota.setAtencion_especial(atenEsp);
        mascota.setObservaciones(observaciones);
        mascota.setUnDuenio(duenio);
        
        controlPersis.guardar(duenio,mascota);
        
    }

    public List<Mascota> traerMascotas() {
        
        return controlPersis.traerMascotas();
        
    }

    public void borrarMascota(int num_cliente) {
        controlPersis.borrarMascota(num_cliente);
    }

    public Mascota buscarMascota(int num_cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    public Mascota traerMascota(int num_cliente) {
        return controlPersis.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota mascota, String nombreMascota, String raza, String color, String observaciones, String alergico, String atenEsp, String nombreDuenio, String celDuenio) {
        
        mascota.setNombre(nombreMascota);
        mascota.setRaza(raza);
        mascota.setColor(color);
        mascota.setObservaciones(observaciones);
        mascota.setAtencion_especial(atenEsp);
        mascota.setAlergico(alergico);
        
        //modifico mascota
        controlPersis.modificarMascota(mascota);
        
        Duenio duenio = this.buscarDuenio(mascota.getUnDuenio().getId_duenio());
        duenio.setCelDuenio(celDuenio);
        duenio.setNombre(nombreDuenio);
        
        this.modificarDuenio(duenio);
    }
    
    private Duenio buscarDuenio(int id_duenio) {
        
        return controlPersis.traerDuenio(id_duenio);
        
    }

    private void modificarDuenio(Duenio duenio) {
        controlPersis.modificarDuenio(duenio);
    }
    
    
    
}
