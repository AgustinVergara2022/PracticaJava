
package Empleado;

public abstract class Empleado 
{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    
    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial)
    {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
    }
    
    public String obtenerPrimerNombre()
    {
        return primerNombre;
    }


    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    }
    
    public String obtenerNumeroSeguroSocial()
    {
        return numeroSeguroSocial;
    }
    
    // devuelve representación String de un objeto Empleado
    @Override
    public String toString()
    {
        return String.format("%s %s%nnumero de seguro social: %s",
        obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }

    // método abstracto sobrescrito por las subclases concretas
    public abstract double ingresos(); // aquí no hay implementación
    
    
}
