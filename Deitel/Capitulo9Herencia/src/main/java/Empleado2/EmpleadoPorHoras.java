
package Empleado2;


public class EmpleadoPorHoras extends Empleado{
    
        private double horas;
        private double sueldo;
        
        public EmpleadoPorHoras (String primerNombre, String apellidoPaterno,
        String numeroSeguroSocial, double horas, double sueldo)
        {
            super(primerNombre, apellidoPaterno, numeroSeguroSocial);
            
            if (horas < 0.0 || horas > 168)
                throw new IllegalArgumentException("Las horas trabajadas deben estar entre 0 y 168");
                this.horas = horas;
            
            if (sueldo < 0.0)
                throw new IllegalArgumentException(
               "El sueldo base debe ser >= 0.0" );
                this.sueldo = sueldo;       
            
        }
        
        public void establecerSueldo(double sueldo){
            if (sueldo < 0.0)
                throw new IllegalArgumentException(
               "El sueldo base debe ser >= 0.0" );
            this.sueldo = sueldo;
        }
        
        public void establecerHoras(double horas){
            if (horas < 0.0 || horas > 168)
                throw new IllegalArgumentException("Las horas trabajadas deben estar entre 0 y 168");
            this.horas = horas;
        }
        
        public double sueldo(){
            return sueldo;
        }
        
        public double horas(){
            return horas;
        }
        
        public double ingresos(){
            return sueldo*horas;
        }
        
        @Override
         public String toString() {
        return String.format("Empleado por horas: %s %s%nNumero de seguro social: %s%nHoras trabajadas: %.2f%nSueldo por hora: %.2f", 
        obtenerPrimerNombre(), obtenerApellidoPaterno(), obtenerNumeroSeguroSocial(), horas, sueldo);
    }
    
}
