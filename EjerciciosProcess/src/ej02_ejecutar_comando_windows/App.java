package ej02_ejecutar_comando_windows;

public class App {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "dir"); // "/c" para ejecutar el comando
            Process process = pb.start();
            String outoput = new String(process.getInputStream().readAllBytes());
            System.out.println(outoput);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
