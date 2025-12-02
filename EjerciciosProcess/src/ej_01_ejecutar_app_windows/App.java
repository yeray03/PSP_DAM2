package ej_01_ejecutar_app_windows;

public class App {
    public static void main(String[] args) {
        try {
//             ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Microsoft Office\\root\\Office16\\WINWORD.EXE"); // Ruta de Word
            ProcessBuilder pb = new ProcessBuilder("calc.exe"); // Abrir calculadora
            Process process = pb.start();

            long pid = process.pid();
            System.out.println("Proceso iniciado con PID: " + pid);
            // Esperar a que el proceso termine
            int exitCode = process.waitFor();
            System.out.println("Proceso terminado con código de salida: " + exitCode); // 0 indica éxito
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
