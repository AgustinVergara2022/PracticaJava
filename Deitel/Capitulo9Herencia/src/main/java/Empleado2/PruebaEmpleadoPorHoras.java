
package Empleado2;


public class PruebaEmpleadoPorHoras {
    

    public static void main(String[] args) {
        // Crear un objeto EmpleadoPorHoras
        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("Juan", "Perez", "123456789", 40, 10.0);

        // Imprimir los detalles del empleado
        System.out.println("Detalles del empleado por horas: ");
        System.out.println(empleadoPorHoras);

        // Establecer nuevas horas y sueldo
        empleadoPorHoras.establecerHoras(50);
        empleadoPorHoras.establecerSueldo(12.0);
        
        

        // Calcular e imprimir los nuevos ingresos
        System.out.println("Nuevos ingresos del empleado por horas: " + empleadoPorHoras.ingresos());
    
}
}
