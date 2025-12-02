package multi_thread;

public class RatonesComiendo {

    public static void main(String[] args) {
        Thread raton1 = new Thread(new Raton(1));
        Thread raton2 = new Thread(new Raton(2));
        Thread raton3 = new Thread(new Raton(3));

        raton1.start();
        raton2.start();
        raton3.start();
    }
}
