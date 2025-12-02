package ej06_comunicacion_entre_procesos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppMain {
    // Le manda un comando a un subproceso y lee su respuesta
    public static void main(String[] args) {
        System.out.println("Process running...");

        try {																  // en vs poner "EjerciciosProcess\\bin"
            ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", "bin", "ej06_comunicacion_entre_procesos.AppSub");
            Process process = processBuilder.start();

            PrintWriter mandarAlSubproceso = new PrintWriter(process.getOutputStream(), true);
            BufferedReader leerSubproceso = new BufferedReader(new InputStreamReader(process.getInputStream()));

            // Pedir input al usuario
            System.out.println("Introduce un texto:");
            
            // Leer input del usuario
            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            
            // Enviar el input al subproceso
            mandarAlSubproceso.println(userInput);
            System.out.println("Comando enviado al subproceso.");
            
            // Leer la respuesta del subproceso
            String respuesta = leerSubproceso.readLine();
            System.out.println("Respuesta del subproceso: " + respuesta);

            process.waitFor();
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
