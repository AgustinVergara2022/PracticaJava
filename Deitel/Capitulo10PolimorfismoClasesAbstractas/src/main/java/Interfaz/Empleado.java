package Interfaz;

public abstract class Empleado implements PorPagar{
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    
    public Empleado(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial)
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
    
    @Override
    public String toString()
    {
        return String.format("%s %s%nnumero de seguro social: %s",
        obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial());
    }
    
    // Nota: Aquí no implementamos el método obtenerMontoPago de PorPagar, así que
    // esta clase debe declararse como abstract para evitar un error de compilación.
}
