package ej04_mostrar_procesos_ejecucion;

public class App {
    public static void main(String[] args) {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd.exe", "/c", "tasklist");
            Process process = pb.start();
            String output = new String(process.getInputStream().readAllBytes());
            process.waitFor();
            System.out.println(output);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
