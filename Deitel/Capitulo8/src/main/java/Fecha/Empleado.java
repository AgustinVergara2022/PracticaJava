
package Fecha;


public class Empleado {
    private String nombre;
    private String apellido;
    private Fecha fechaNacimiento;
    private Fecha fechaContratacion;
    
    // constructor para inicializar nombre, fecha de nacimiento y fecha de contratación
    public Empleado(String nombre, String apellido, Fecha fechaDeNacimiento, Fecha fechaDeContratacion)
     {
         this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
       }

 // convierte Empleado a formato String
 
 public String toString()
     {
        return String.format("%s, %s Contratado: %s Cumpleanios: %s", apellido, nombre, fechaContratacion, fechaNacimiento);
    }
    
}
