package EmisorUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EmisorUDP {
    private static final String HOST = "localhost"; // Cambiar a la dirección IP del host destino si es diferente
    private static final int PORT = 80;
    
    public static void main(String[] args) {
        try {
            // Mensaje a enviar
            String message = "¡Hola desde el emisor UDP!";
            byte[] buffer = message.getBytes(); // Convertir el mensaje a bytes

            // Obtener la dirección IP del host destino
            InetAddress address = InetAddress.getByName(HOST);

            // Crear el paquete UDP con el mensaje y la dirección destino
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, address, PORT);

            // Crear el socket UDP
            DatagramSocket socket = new DatagramSocket();

            // Enviar el paquete UDP
            socket.send(packet);

            // Cerrar el socket después de usarlo
            socket.close();

            System.out.println("Mensaje enviado correctamente.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
      
}
