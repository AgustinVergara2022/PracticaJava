package AsociacionArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

public class AsociarArchivos {

    private List<Cuenta> cuentas;
    private List<RegistroTransaccion> transacciones;

    public AsociarArchivos() {
        cuentas = new ArrayList<>();
        transacciones = new ArrayList<>();
    }

    public void leerArchivoMaestro(String archivoMaestro) throws FileNotFoundException {
        Scanner entrada = new Scanner(new File(archivoMaestro));
        while (entrada.hasNext()) {
            int cuenta = entrada.nextInt();
            String primerNombre = entrada.next();
            String apellidoPaterno = entrada.next();
            double saldo = entrada.nextDouble();
            cuentas.add(new Cuenta(cuenta, primerNombre, apellidoPaterno, saldo));
        }
        entrada.close();
    }

    public void leerArchivoTransacciones(String archivoTransacciones) throws FileNotFoundException {
        Scanner entrada = new Scanner(new File(archivoTransacciones));
        while (entrada.hasNext()) {
            int cuenta = entrada.nextInt();
            double monto = entrada.nextDouble();
            transacciones.add(new RegistroTransaccion(cuenta, monto));
        }
        entrada.close();
    }

    public void combinarArchivos(String archivoNuevoMaestro, String archivoRegistro) throws IOException {
        Formatter salidaNuevoMaestro = new Formatter(archivoNuevoMaestro);
        Formatter salidaRegistro = new Formatter(archivoRegistro);

        for (Cuenta cuentaMaestro : cuentas) {
            boolean encontrado = false;
            for (RegistroTransaccion transaccion : transacciones) {
                if (cuentaMaestro.obtenerCuenta() == transaccion.getNumCuenta()) {
                    cuentaMaestro.combinar(transaccion);
                    encontrado = true;
                }
            }
            salidaNuevoMaestro.format("%d %s %s %.2f%n", cuentaMaestro.obtenerCuenta(),
                    cuentaMaestro.obtenerPrimerNombre(), cuentaMaestro.obtenerApellidoPaterno(), cuentaMaestro.obtenerSaldo());
            if (!encontrado) {
                salidaNuevoMaestro.format("%d %s %s %.2f%n", cuentaMaestro.obtenerCuenta(),
                        cuentaMaestro.obtenerPrimerNombre(), cuentaMaestro.obtenerApellidoPaterno(), cuentaMaestro.obtenerSaldo());
            }
        }

        for (RegistroTransaccion transaccion : transacciones) {
            boolean asociado = false;
            for (Cuenta cuentaMaestro : cuentas) {
                if (cuentaMaestro.obtenerCuenta() == transaccion.getNumCuenta()) {
                    asociado = true;
                    break;
                }
            }
            if (!asociado) {
                salidaRegistro.format("Hay un registro de transacciones no asociado para ese numero de cliente %d%n",
                        transaccion.getNumCuenta());
            }
        }

        salidaNuevoMaestro.close();
        salidaRegistro.close();
    }

    public static void main(String[] args) {
        try {
            AsociarArchivos asociarArchivos = new AsociarArchivos();
            asociarArchivos.leerArchivoMaestro("antmaest.txt");
            asociarArchivos.leerArchivoTransacciones("trans.txt");
            asociarArchivos.combinarArchivos("nuevomaest.txt", "registro.txt");
        } catch (IOException e) {
            System.err.println("Error al procesar los archivos: " + e.getMessage());
        }
    }
}

