package InterfazImpactoEcologico;

public class Bicicleta implements ImpactoEcologico{
    private double mantenimiento;

    public Bicicleta(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }

    public double getMantenimiento() {
        return mantenimiento;
    }

    public void setMantenimiento(double mantenimiento) {
        this.mantenimiento = mantenimiento;
    }
    
    @Override
    public double obtenerImpactoEcologico(){
        return mantenimiento * 15;
    }
    
    @Override
    public String toString() {
        return "Bicicleta [mantenimiento=" + mantenimiento + "]";
    }
}
