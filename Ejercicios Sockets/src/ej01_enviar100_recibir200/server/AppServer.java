package ej01_enviar100_recibir200.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class AppServer {
    public static void main(String[] args) {

        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        int puertoServer = 8081; // Coge uno libre...

        try {
            System.out.println("Servidor - Esperando conexiones de Clientes...");
            serverSocket = new ServerSocket(puertoServer);

            while (true) {
                socket = serverSocket.accept(); // En espera...

                System.out.println("Servidor - Intento de conexion en puerto " + puertoServer);
                inputStream = socket.getInputStream();
                outputStream = socket.getOutputStream();

                // inputStream y outputStream leen y escriben bytes
                // Pero se puede enviar cualquier objeto (con la clase correcta)
                System.out.println("Servidor - Cliente conectado!!");
                int mensaje = inputStream.read();

                System.out.println("Servidor - Mensaje del Cliente: " + mensaje);
                int respuesta = 200;
                outputStream.write(respuesta);

                System.out.println("Servidor - Mensaje de respuesta: " + respuesta);

                System.out.println("Servidor - Cerrando conexiones con cliente...");
                if (null != outputStream)
                    outputStream.close();

                if (null != inputStream)
                    inputStream.close();

                if (null != socket)
                    socket.close();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            // Cerramos en el orden inverso al que las hemos abierto
            System.out.println("Servidor - Cerrando conexiones...");

            try {
                serverSocket.close();
            } catch (IOException e) {
                // No importa...
            }
        }

        System.out.println("Servidor - Finalizado!");
    }
}
