package AsociacionArchivos;

public class Cuenta {
    private int cuenta;
    private String primerNombre;
    private String apellidoPaterno;
    private double saldo;
    
    // inicializa un objeto Cuenta con valores predeterminados
    public Cuenta()
    {
        this(0, "", "", 0.0); // llama a otro constructor
    }

    // inicializa un objeto Cuenta con los valores proporcionados
    public Cuenta(int cuenta, String primerNombre,String apellidoPaterno, double saldo)
    {
        this.cuenta = cuenta;
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.saldo = saldo;
    }

    // establece el número de cuenta
    public void establecerCuenta(int cuenta)
    {
        this.cuenta = cuenta;
    }
    
    // obtiene el número de cuenta
    public int obtenerCuenta()
    {
        return cuenta;
    }

    // establece el primer nombre
    public void establecerPrimerNombre(String primerNombre)
    {
        this.primerNombre = primerNombre;
    }

    // obtiene el primer nombre
    public String obtenerPrimerNombre()
    {
        return primerNombre;
    }

    // establece el apellido paterno
    public void establecerApellidoPaterno(String apellidoPaterno)
    {
        this.apellidoPaterno = apellidoPaterno;
    }

   // obtiene el apellido paterno
    public String obtenerApellidoPaterno()
    {
        return apellidoPaterno;
    }
   
    // establece el saldo
    public void establecerSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    // obtiene el saldo
    public double obtenerSaldo()
    {
        return saldo;
    }
    
    public void combinar(RegistroTransaccion transaccion){
        if(this.cuenta == transaccion.getNumCuenta())
            this.saldo += transaccion.getMonto();
    }
    
     @Override
    public String toString() {
        return String.format("%d %s %s %.2f", cuenta, primerNombre, apellidoPaterno, saldo);
    }
    
} 
