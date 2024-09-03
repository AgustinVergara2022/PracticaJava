
package ReceptorUDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class ReceptorUDP {
    
    private static final int PORT = 80;
    private static final int MAX_LEN = 1024; // Longitud máxima del paquete
    
    public static void main(String[] args) {
        try {
            // Crear un socket UDP en el puerto especificado
            DatagramSocket socket = new DatagramSocket(PORT);

            // Buffer para almacenar los datos recibidos
            byte[] buffer = new byte[MAX_LEN];

            // Crear un DatagramPacket vacío para recibir los datos
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

            System.out.println("Esperando recibir paquetes UDP en el puerto " + PORT + "...");
            
            // Recibir el paquete UDP
            socket.receive(packet);

            // Convertir los datos recibidos a una cadena de texto
            String data = new String(packet.getData(), 0, packet.getLength());

            // Mostrar la cadena de texto por consola
            System.out.println("Datos recibidos: " + data);

            // Cerrar el socket después de usarlo
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }
}
