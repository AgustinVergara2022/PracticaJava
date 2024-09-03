package InterfazImpactoEcologico;

public class Edificio implements ImpactoEcologico
{
    private double electricidad;
    private double gasNatural;
  
    
    public Edificio(double electricidad, double gasNatural)
    {
        this.electricidad = electricidad;
        this.gasNatural = gasNatural;
    }
    
    public void establecerElectricidad(double electricidad){
        this.electricidad = electricidad;
    }
    
    public void establecerGasNatural(double gasNatural){
        this.gasNatural = gasNatural;
    }
    
    public double obtenerElectricidad(){
        return electricidad;
    }
    
    public double obtenerGasNatural(){
        return gasNatural;
    }
    
    @Override
    public double obtenerImpactoEcologico(){
        double electricidadAnual = electricidad * 10000;
        double gasAnual = gasNatural * 5000;
        return electricidadAnual * gasAnual;
    }
    
    @Override
    public String toString() {
        return "Edificio [consumoElectricidad=" + electricidad + ", consumoGasNatural=" + gasNatural + "]";
    }
    
}
