package multi_thread;

public class Raton implements Runnable {

    private final int numero;

    public Raton(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        System.out.println("El ratón " + numero + " está comiendo.");
        try {
            Thread.sleep(5000); // Simula el tiempo que tarda en comer
            System.out.println("El ratón " + numero + " ha terminado de comer.");

        } catch (InterruptedException e) {
            System.err.println("El ratón " + numero + " fue interrumpido mientras comía.");
        }
    }

}
