package SistemaNomina;

public class EmpleadoPorHoras extends Empleado{
    private double sueldo;
    private double horas;
    
    public EmpleadoPorHoras(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double sueldo, double horas)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        
        if (sueldo < 0.0) // valida sueldo
        throw new IllegalArgumentException(
            "El sueldo por horas debe ser >= 0.0");

        if ((horas < 0.0) || (horas > 168.0)) // valida horas
            throw new IllegalArgumentException(
                "Las horas trabajadas deben ser >= 0.0 y <= 168.0");

         this.sueldo = sueldo;
         this.horas = horas;
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
    
    public void establecerHoras(double horas)
    {
        if ((horas < 0.0) || (horas > 168.0)) // valida horas
            throw new IllegalArgumentException(
                "Las horas trabajadas deben ser >= 0.0 y <= 168.0");

        this.horas = horas;
    }
    
    public double obtenerHoras()
    {
        return horas;
    }
    
    
    // calcula los ingresos; sobrescribe el método abstracto ingresos en Empleado
    @Override
    public double ingresos()
    {
        if (obtenerHoras() <= 40) // no hay tiempo extra
            return obtenerSueldo() * obtenerHoras();
        else
            return 40 * obtenerSueldo() + (obtenerHoras() - 40) * obtenerSueldo() * 1.5;
    }
    
    // devuelve representación String de un objeto EmpleadoPorHoras
    @Override
    public String toString()
    {
        return String.format("empleado por horas: %s%n%s: $%,.2f; %s: %,.2f",
        super.toString(), "sueldo por hora", obtenerSueldo(),
        "horas trabajadas", obtenerHoras());
    }
    
}