package cronometros;

import java.util.ArrayList;

public class Cronometro extends Thread {
    private int contador;
    private int numero;
    private static ArrayList<Cronometro> cronometros = new ArrayList<>();

    public Cronometro(int numero) {
        this.numero = numero;
        this.contador = 0;
        synchronized (Cronometro.class) {
            cronometros.add(this);
        }
    }

    @Override
    public void run() {
        while (true) {
            try {
                contador++;
                // Limpiar consola e imprimir los cronos
                imprimirCronos();
                Thread.sleep(1000);
            } catch (Exception e) {
                break;
            }
        }
    }

    private static synchronized void imprimirCronos() {
        // Limpiar consola (compatible con Windows y Linux)
        System.out.print("\033[H\033[2J");
        System.out.flush();

        // Imprimir todos los cronómetros
        for (Cronometro crono : cronometros) {
            if (crono.contador > 0) { // Solo muestra si el thread está corriendo
                System.out.println("Cronometro " + crono.numero + ": " + crono.contador);
            }
        }
    }

}
