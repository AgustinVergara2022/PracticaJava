
package Empleado;


public class PruebaEmpleado {
    
    public static void main(String[] args){
// muestra que la cuenta es 0 antes de crear Empleados
System.out.printf("Empleados antes de instanciar: %d%n",
Empleado.obtenerCuenta());

 // crea dos Empleados; la cuenta debe ser 2
Empleado e1 = new Empleado("Susan", "Baker");
Empleado e2 = new Empleado("Bob", "Blue");

// muestra que la cuenta es 2 después de crear dos Empleados
System.out.printf("%nEmpleados despues de instanciar: %n");
System.out.printf("mediante e1.obtenerCuenta(): %d%n", e1.obtenerCuenta());
System.out.printf("mediante e2.obtenerCuenta(): %d%n", e2.obtenerCuenta());
System.out.printf("mediante Empleado.obtenerCuenta(): %d%n",
Empleado.obtenerCuenta());

 // obtiene los nombres de los Empleados
System.out.printf("%nEmpleado 1: %s %s%nEmpleado 2: %s %s%n", e1.obtenerNombre(), e1.obtenerApellido(), e2.obtenerNombre(), e2.obtenerApellido());
 }
    
}
