package InterfazImpactoEcologico;


public class Auto implements ImpactoEcologico{
    private double gasolina;
  
    
    public Auto(double gasolina)
    {
        this.gasolina = gasolina;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }
    
    @Override
    public double obtenerImpactoEcologico(){
        return gasolina * 1200;
    }
    
    @Override
    public String toString() {
        return "Auto [consumoGasolina=" + gasolina + "]";
    }

}
