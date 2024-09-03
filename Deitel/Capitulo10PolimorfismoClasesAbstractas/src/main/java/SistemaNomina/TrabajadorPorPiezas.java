package SistemaNomina;

public class TrabajadorPorPiezas extends Empleado{
    private double sueldo;
    private int piezas;
    
    public TrabajadorPorPiezas(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, int piezas)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        if (sueldo < 0.0) // valida sueldo
        throw new IllegalArgumentException(
            "El sueldo por piezas debe ser >= 0.0");

        if (piezas < 0)
            throw new IllegalArgumentException(
                "Las piezas deben ser mayores a 0");
        
        this.sueldo = sueldo;
        this.piezas = piezas;
    }
    
    public void establecerSueldo(double sueldo)
    {
        if (sueldo < 0.0) // valida sueldo
            throw new IllegalArgumentException("El sueldo por horas debe ser >= 0.0");

        this.sueldo = sueldo;
    }
    
    public double obtenerSueldo()
    {
        return sueldo;
    }
    
    
    public void cantidadPiezas(int piezas)
    {
        if (piezas < 0)
            throw new IllegalArgumentException("Las piezas deben ser mayores a 0");
        
        this.piezas = piezas;
    }
    
    public int obtenerPiezas()
    {
        return piezas;
    }
    
    @Override
    public double ingresos()
    {
        return sueldo * piezas;
    }
    
    @Override
    public String toString()
    {
        return String.format("empleado por piezas: %s%n%s: $%,.2f",
        super.toString(), "sueldo por pieza", obtenerSueldo());
    }
    
}
