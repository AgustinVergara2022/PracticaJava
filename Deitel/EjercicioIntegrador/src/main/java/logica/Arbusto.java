package logica;


public class Arbusto extends Planta implements ISaludar{
    public int anchoArbusto;
    public boolean esDomestico;
    public String variedadArbusto;
    public String colorDeHojas;
    public boolean sePodaONo;

    public int getAnchoArbusto() {
        return anchoArbusto;
    }

    public boolean isEsDomestico() {
        return esDomestico;
    }

    public String getVariedadArbusto() {
        return variedadArbusto;
    }

    public String getColorDeHojas() {
        return colorDeHojas;
    }

    public boolean isSePodaONo() {
        return sePodaONo;
    }

    public void setAnchoArbusto(int anchoArbusto) {
        this.anchoArbusto = anchoArbusto;
    }

    public void setEsDomestico(boolean esDomestico) {
        this.esDomestico = esDomestico;
    }

    public void setVariedadArbusto(String variedadArbusto) {
        this.variedadArbusto = variedadArbusto;
    }

    public void setColorDeHojas(String colorDeHojas) {
        this.colorDeHojas = colorDeHojas;
    }

    public void setSePodaONo(boolean sePodaONo) {
        this.sePodaONo = sePodaONo;
    }

    public Arbusto(int anchoArbusto, boolean esDomestico, String variedadArbusto, String colorDeHojas, boolean sePodaONo, String nombre, int altoDelTallo, boolean tieneHojas, int climaIdeal) {
        super(nombre, altoDelTallo, tieneHojas, climaIdeal);
        this.anchoArbusto = anchoArbusto;
        this.esDomestico = esDomestico;
        this.variedadArbusto = variedadArbusto;
        this.colorDeHojas = colorDeHojas;
        this.sePodaONo = sePodaONo;
    }

    @Override
    public void saludar() {
        System.out.println("Hola soy un arbusto");
    }
    
    
}
