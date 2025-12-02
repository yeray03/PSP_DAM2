package cronometros;

public class menu {
    public static void main(String[] args) {
        try {
            Thread crono = new Thread(new Cronometro(1));
            Thread crono2 = new Thread(new Cronometro(2));
            Thread crono3 = new Thread(new Cronometro(3));
            crono.start();
            Thread.sleep(2000);
            crono2.start();
            Thread.sleep(3000);
            crono3.start();
        } catch (Exception e) {

        }
    }
}
