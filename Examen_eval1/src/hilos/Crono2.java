package hilos;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class Crono2 extends Thread {
	private JTextField texto;
	private int segundos = 10;
	JPanel panel;
	boolean pausado;

	public Crono2(JTextField texto) {
		this.texto = texto;
		this.pausado = false;
	}

	public void setPanel(JPanel contentPane) {
		this.panel = contentPane;
	}

	@Override
	public void run() {
		try {
			while (!pausado && segundos >= 0) {
					segundos--;
					texto.setText(String.valueOf(segundos));
					Thread.sleep(1000);
			}
		} catch (Exception e) {
		}
	}

	public void pararCrono() {
		this.pausado = true;
	}
}
