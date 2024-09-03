package Empleado;

public class EmpleadoPorComision extends Empleado 
{
    private double ventasBrutas; // ventas totales por semana
    private double tarifaComision; // porcentaje de comisión
    
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno,
        String numeroSeguroSocial, double ventas,
        double tarifaComision)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) // valida
            throw new IllegalArgumentException(
                "La tarifa de comision debe ser > 0.0 y < 1.0");
        
        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }
    
    public void establecerVentasBrutas(double ventasBrutas)
    {
        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException("Las ventas brutas deben ser >= 0.0");
        
        this.ventasBrutas = ventasBrutas;
    }
    
    // devuelve el monto de ventas brutas
    public double obtenerVentasBrutas()
    {
        return ventasBrutas;
    }

    public void establecerTarifaComision(double tarifaComision)
    {
        if (tarifaComision <= 0.0 || tarifaComision >= 1.0) // valida
            throw new IllegalArgumentException("La tarifa de comision debe ser > 0.0 y < 1.0");
            
        this.tarifaComision = tarifaComision;
    }


    public double obtenerTarifaComision()
    {
        return tarifaComision;
    }
    
    @Override
    public double ingresos()
    {
        return obtenerTarifaComision() * obtenerVentasBrutas();
    }
    
    @Override
    public String toString()
    {
        return String.format("%s: %s%n%s: $%,.2f; %s: %.2f",
        "empleado por comision", super.toString(),
        "ventas brutas", obtenerVentasBrutas(),
        "tarifa de comision", obtenerTarifaComision());
    }
}
