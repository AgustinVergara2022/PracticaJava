
package CuentaAhorro;


public class PruebaCuentaDeAhorros {
    public static void main (String[] args){
        CuentaDeAhorros. modificarTasaInteres(0.04); // Establecer tasa de interés al 4%

        CuentaDeAhorros ahorrador1 = new CuentaDeAhorros(2000.00);
        CuentaDeAhorros ahorrador2 = new CuentaDeAhorros(3000.00);

        for (int i = 1; i <= 12; i++) {
            ahorrador1.calcularInteresMensual();
            ahorrador2.calcularInteresMensual();
            System.out.println("Mes " + i + " - Saldo Ahorrador 1: $" + ahorrador1.getSaldoAhorros());
            System.out.println("Mes " + i + " - Saldo Ahorrador 2: $" + ahorrador2.getSaldoAhorros());
        }

        CuentaDeAhorros. modificarTasaInteres(0.05); // Establecer tasa de interés al 5%

        ahorrador1.calcularInteresMensual();
        ahorrador2.calcularInteresMensual();
        System.out.println("Mes 13 - Saldo Ahorrador 1: $" + ahorrador1.getSaldoAhorros());
        System.out.println("Mes 13 - Saldo Ahorrador 2: $" + ahorrador2.getSaldoAhorros());
    }
    }

