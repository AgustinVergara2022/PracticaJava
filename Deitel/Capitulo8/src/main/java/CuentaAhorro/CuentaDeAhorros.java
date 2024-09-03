
package CuentaAhorro;


public class CuentaDeAhorros {
    
    private static double tasaInteresAnual;
    private double saldoAhorros;
    
    public CuentaDeAhorros( double saldo){
        this.saldoAhorros = saldo;
        
    }
    
     public void setSaldoAhorros(double saldoAhorros){
            if(saldoAhorros < 0.0)
                throw new IllegalArgumentException("Saldo ahorros debe ser positivo");
            this.saldoAhorros = saldoAhorros;
        }
        
        
        public double getSaldoAhorros(){
            return saldoAhorros;
        }
        
       public void calcularInteresMensual(){
           double tasaInteresMensual = saldoAhorros * (tasaInteresAnual) / 12;
           saldoAhorros += tasaInteresMensual;
           
       }
       
       public static void modificarTasaInteres(double nuevaTasa) {
        tasaInteresAnual = nuevaTasa;
    }
       
       
    
}
