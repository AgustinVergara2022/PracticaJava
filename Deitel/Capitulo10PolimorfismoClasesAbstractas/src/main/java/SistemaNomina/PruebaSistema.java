package SistemaNomina;

public class PruebaSistema 
{
    public static void main (String[] args)
    {
        Empleado[] empleados = new Empleado[3];
        
        empleados[0] = new EmpleadoAsalariado("Carlos", "Velmonte","25113D",5000);
        empleados[1] = new EmpleadoPorHoras("Laura","Fear","481516",2500,8);
        empleados[2] = new TrabajadorPorPiezas("Pedro","Feller","137589",6000,8);
        
        for(Empleado empleado: empleados)
        {
            
            System.out.println(empleado);
            
            System.out.printf("ingresos $%,.2f%n%n", empleado.ingresos());
         
        }
      
        
    }
}
