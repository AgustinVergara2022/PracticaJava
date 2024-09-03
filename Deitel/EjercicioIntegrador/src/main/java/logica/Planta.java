
package logica;


public abstract class Planta {
    private String nombre;
    private int altoDelTallo;
    private boolean tieneHojas;
    private int climaIdeal;

    public Planta(String nombre, int altoDelTallo, boolean tieneHojas, int climaIdeal) {
        this.nombre = nombre;
        this.altoDelTallo = altoDelTallo;
        this.tieneHojas = tieneHojas;
        this.climaIdeal = climaIdeal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAltoDelTallo(int altoDelTallo) {
        this.altoDelTallo = altoDelTallo;
    }

    public void setTieneHojas(boolean tieneHojas) {
        this.tieneHojas = tieneHojas;
    }

    public void setClimaIdeal(int climaIdeal) {
        this.climaIdeal = climaIdeal;
    }

    public String getNombre() {
        return nombre;
    }

    public int getAltoDelTallo() {
        return altoDelTallo;
    }


    public boolean isTieneHojas() {
        return tieneHojas;
    }

    public int getClimaIdeal() {
        return climaIdeal;
    }
 
     @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", altoDelTallo=" + altoDelTallo + ", tieneHojas=" + tieneHojas + ", climaIdeal=" + climaIdeal + '}';
    }
    
}
