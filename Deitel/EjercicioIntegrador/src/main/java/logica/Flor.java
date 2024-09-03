package logica;


public class Flor extends Planta implements ISaludar{
    private String color;
    private int cantidadDePetalos;
    private String colorDelPistillo;
    private String colorDePetalos;
    private String variedadDeFlor;
    private String estacionQueFlorece;

    public Flor(String color, int cantidadDePetalos, String colorDelPistillo, String colorDePetalos, String variedadDeFlor, String estacionQueFlorece, String nombre, int altoDelTallo, boolean tieneHojas, int climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.color = color;
        this.cantidadDePetalos = cantidadDePetalos;
        this.colorDelPistillo = colorDelPistillo;
        this.colorDePetalos = colorDePetalos;
        this.variedadDeFlor = variedadDeFlor;
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setCantidadDePetalos(int cantidadDePetalos) {
        this.cantidadDePetalos = cantidadDePetalos;
    }

    public void setColorDelPistillo(String colorDelPistillo) {
        this.colorDelPistillo = colorDelPistillo;
    }

    public void setColorDePetalos(String colorDePetalos) {
        this.colorDePetalos = colorDePetalos;
    }

    public void setVariedadDeFlor(String variedadDeFlor) {
        this.variedadDeFlor = variedadDeFlor;
    }

    public void setEstacionQueFlorece(String estacionQueFlorece) {
        this.estacionQueFlorece = estacionQueFlorece;
    }

    public String getColor() {
        return color;
    }

    public int getCantidadDePetalos() {
        return cantidadDePetalos;
    }

    public String getColorDelPistillo() {
        return colorDelPistillo;
    }

    public String getColorDePetalos() {
        return colorDePetalos;
    }

    public String getVariedadDeFlor() {
        return variedadDeFlor;
    }

    public String getEstacionQueFlorece() {
        return estacionQueFlorece;
    }

    @Override
    public String toString() {
        return "Flor{" + "color=" + color + ", cantidadDePetalos=" + cantidadDePetalos + ", colorDelPistillo=" + colorDelPistillo + ", colorDePetalos=" + colorDePetalos + ", variedadDeFlor=" + variedadDeFlor + ", estacionQueFlorece=" + estacionQueFlorece + '}';
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy una flor");
    }
    
}
