
package Empleado;


public class Empleado {
    private static int cuenta = 0; // número de objetos Empleado creados
    private String nombre;
    private String apellido;

    // inicializa Empleado, suma 1 a la variable static cuenta e
    // imprime objeto String que indica que se llamó al constructor
    public Empleado(String nombre, String apellido)
        {
            this.nombre = nombre;
            this.apellido = apellido;
             ++cuenta; // incrementa la variable static cuenta de empleados
            System.out.printf("Constructor de Empleado: %s %s; cuenta = %d%n",nombre, apellido, cuenta);
 }

    // obtiene el primer nombre
    public String obtenerNombre()
    {
        return nombre;
    }

    // obtiene el apellido
    public String obtenerApellido()
    {
        return apellido;
    }

    // método static para obtener el valor de static cuenta
        public static int obtenerCuenta()
        {
            return cuenta;
            }
 } // fin de la clase Empleado
