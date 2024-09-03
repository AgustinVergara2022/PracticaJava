package EjercicioA;

import java.net.InetAddress;
import java.net.DatagramPacket;

public class EjercicioA {

    public static void main(String[] args) {
        try {
            DatagramPacket paqueteUDP; // Declaración del paquete UDP
            String host = "127.0.0.1"; // Dirección de Internet del host remoto

            InetAddress dir_remota = InetAddress.getByName(host);
            int port = 1000;

            String datos = "Hola, estos son los datos !!";
            byte[] buffer = datos.getBytes();

            // Crear el paquete UDP
            paqueteUDP = new DatagramPacket(buffer, buffer.length, dir_remota, port);

            // Mostrar datos del paquete
            System.out.println("Paquete UDP :");
            System.out.println("Dirección Internet:" + paqueteUDP.getAddress());
            System.out.println("Datos :" + datos);
            System.out.println("Datos como bytes:" + new String(paqueteUDP.getData(), 0, paqueteUDP.getLength()));
            System.out.println("Longitud :" + paqueteUDP.getLength());
            System.out.println("Offset :" + paqueteUDP.getOffset());
            System.out.println("Puerto :" + paqueteUDP.getPort());
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
