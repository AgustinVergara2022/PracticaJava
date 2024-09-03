package logica;


public class Arbol extends Planta implements ISaludar{
    private int variedad;
    private String tipoDeTronco;
    private double radioDeTronco;
    private String color;
    private String tipoDeHojas;

    public int getVariedad() {
        return variedad;
    }

    public String getTipoDeTronco() {
        return tipoDeTronco;
    }

    public double getRadioDeTronco() {
        return radioDeTronco;
    }

    public String getColor() {
        return color;
    }

    public String getTipoDeHojas() {
        return tipoDeHojas;
    }

    public void setVariedad(int variedad) {
        this.variedad = variedad;
    }

    public void setTipoDeTronco(String tipoDeTronco) {
        this.tipoDeTronco = tipoDeTronco;
    }

    public void setRadioDeTronco(double radioDeTronco) {
        this.radioDeTronco = radioDeTronco;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipoDeHojas(String tipoDeHojas) {
        this.tipoDeHojas = tipoDeHojas;
    }

    public Arbol(int variedad, String tipoDeTronco, double radioDeTronco, String color, String tipoDeHojas, String nombre, int altoDelTallo, boolean tieneHojas, int climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.variedad = variedad;
        this.tipoDeTronco = tipoDeTronco;
        this.radioDeTronco = radioDeTronco;
        this.color = color;
        this.tipoDeHojas = tipoDeHojas;
    }

    @Override
    public String toString() {
        return "Arbol{" + "variedad=" + variedad + ", tipoDeTronco=" + tipoDeTronco + ", radioDeTronco=" + radioDeTronco + ", color=" + color + ", tipoDeHojas=" + tipoDeHojas + '}';
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un árbol");
    }
    
    
}
