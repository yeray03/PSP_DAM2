package timer_task;

import java.util.Timer;
import java.util.TimerTask;

public class PruebaRegadoThread extends TimerTask {

    private static int contador = 0;
    private static final int MAX_CICLOS = 4;

    public static void main(String[] args) {
        System.out.println("Iniciando el sistema de riego automático...");
        Timer regadoTimer = new Timer();
        regadoTimer.schedule(new PruebaRegadoThread(), 1000, 2000); // Ejecuta cada 2 segundos después de 1 segundo de retraso
    }

    @Override
    public void run() {
        contador++;
        if (contador >= MAX_CICLOS) {
            System.out.println("El riego se ha completado. Ciclos realizados: " + contador);
            cancel(); // Cancela el timer después de 4 ejecuciones
        } else {
            System.out.println("Regando...");
        }

    }
}
