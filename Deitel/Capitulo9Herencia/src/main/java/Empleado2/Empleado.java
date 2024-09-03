
package Empleado2;


public class Empleado {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    

    // constructor con cinco argumentos
    public Empleado(String primerNombre, String apellidoPaterno,
    String numeroSeguroSocial)
    {
    this.primerNombre = primerNombre;
    this.apellidoPaterno = apellidoPaterno;
    this.numeroSeguroSocial = numeroSeguroSocial; 
     } 
    
     // devuelve el primer nombre
     public String obtenerPrimerNombre()
     {
     return primerNombre;
     }
     
    // devuelve el apellido paterno
     public String obtenerApellidoPaterno()
     {
     return apellidoPaterno;
     }
     
     // devuelve el número de seguro social
    public String obtenerNumeroSeguroSocial()
    {
    return numeroSeguroSocial;
    } // fin del método obtenerNumeroSeguroSocial
    
    

    // devuelve representación String del objeto EmpleadoPorComision
    @Override // Indica que este método sobrescribe el método de una superclase
    public String toString()
    {
         return String.format("%s: %s %s%n%s: %s", 
        "Empleado por comision", primerNombre, apellidoPaterno,
        "Numero de seguro social", numeroSeguroSocial);
     }
}
