package ej05_matar_notepad;

// import java.io.BufferedReader;
// import java.io.InputStream;
// import java.io.InputStreamReader;
// import java.io.OutputStream;
// import java.io.PrintWriter;

public class App {
    public static void main(String[] args) {
        try {
            // Comando para matar Notepad.exe
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "taskkill /F /IM Notepad.exe");
            Process process = pb.start();
            String output = new String(process.getInputStream().readAllBytes()); // Leer la salida del comando
            int exitCode = process.waitFor(); // Esperar a que el proceso termine
            if (exitCode == 0) { // Si el código de salida es 0, el proceso fue exitoso
                System.out.println(output);
            } else { // Si el código de salida no es 0, Notepad.exe no estaba abierto
                System.out.println("> El Bloc de Notas no estaba abierto.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
