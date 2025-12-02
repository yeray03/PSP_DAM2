package ej01_enviar100_recibir200.client;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class AppCliente {
    public static void main(String[] args) {

        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        String ipServer = "127.0.0.1";
        int puertoServer = 49171;

        try {
            System.out.println("Cliente - Preparando para conectar con " + ipServer + ":" + puertoServer);
            socket = new Socket(ipServer, puertoServer);

            System.out.println("Cliente - Intento de conexion");
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();

            System.out.println("Cliente - Conectado!!");
            int mensaje = 100;
            outputStream.write(mensaje);

            System.out.println("Cliente - Mensaje enviado: " + mensaje);
            int respuesta = inputStream.read();

            System.out.println("Cliente - Mensaje de respuesta: " + respuesta);

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            // Cerramos en el orden inverso al que las hemos abierto
            System.out.println("Cliente - Cerrando conexiones...");
            try {
                outputStream.close();
            } catch (IOException e) {
                // No importa...
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                // No importa...
            }
            try {
                socket.close();
            } catch (IOException e) {
                // No importa...
            }
        }
        System.out.println("Cliente - Finalizado!");
    }
}
