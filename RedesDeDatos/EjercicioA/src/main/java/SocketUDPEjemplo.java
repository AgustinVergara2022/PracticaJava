import java.net.DatagramSocket;
import java.net.SocketException;

public class SocketUDPEjemplo {
    public static void main(String[] args) {
        try {
            // Crear el socket UDP
            DatagramSocket socket = new DatagramSocket();
            
            // Configurar el tamaño del buffer de envío
            socket.setSendBufferSize(1024); // tamaño en bytes
            // Configurar el tamaño del buffer de recepción
            socket.setReceiveBufferSize(1024); // tamaño en bytes
            
            // Activar el TimeOUT del socket a 1000 milisegundos
            socket.setSoTimeout(1000);
            
            // Imprimir el estado del socket
            System.out.println("Socket creado.");
            System.out.println("Tamaño del buffer de envio: " + socket.getSendBufferSize());
            System.out.println("Tamaño del buffer de recepcion: " + socket.getReceiveBufferSize());
            System.out.println("TimeOut del SO: " + socket.getSoTimeout() + " ms");
            System.out.println("Está enlazado: " + socket.isBound());
            System.out.println("Está cerrado: " + socket.isClosed());
            
            // Cerrar el socket
            socket.close();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }
}

