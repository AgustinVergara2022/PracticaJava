package AsociacionArchivos;

public class RegistroTransaccion {
    private int numCuenta;
    private double monto;

    public RegistroTransaccion(int numCuenta, double monto) {
        this.numCuenta = numCuenta;
        this.monto = monto;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    
    
    // Método para representar el registro como una cadena de texto
    @Override
    public String toString() {
        return String.format("Cuenta: %d, Monto: %.2f", numCuenta, monto);
    }
    
    
}
