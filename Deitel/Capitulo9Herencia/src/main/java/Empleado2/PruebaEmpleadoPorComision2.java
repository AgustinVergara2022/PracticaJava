
package Empleado2;

public class PruebaEmpleadoPorComision2 {
     
    
    public static void main (String[] args){
        
        Empleado empleado = new Empleado(
        "Sue", "Jones", "222-22-2222");
    
        System.out.println("Informacion del empleado obtenida por los metodos establecer: ");
        System.out.printf("%n%s %s%n", "El primer nombre es", empleado.obtenerPrimerNombre()); 
        System.out.printf("%s %s%n", "El apellido paterno es",empleado.obtenerApellidoPaterno());
        System.out.printf("%s %s%n", "El numero de seguro social es",   empleado.obtenerNumeroSeguroSocial());
       

        System.out.printf("%n%s:%n%n%s%n",
        "Informacion actualizada del empleado, obtenida mediante toString", empleado);
    } 
}

