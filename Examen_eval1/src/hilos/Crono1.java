package hilos;


import javax.swing.JPanel;
import javax.swing.JTextField;


public class Crono1 extends Thread {
	private JTextField texto;
	private int segundos;
	JPanel panel;
	boolean pausado;

	public Crono1(JTextField texto) {
		this.texto = texto;
		this.pausado = false;
	}
	public void setPanel(JPanel contentPane) {
		this.panel = contentPane;
	}

	@Override
	public void run() {
		try {
			while (!pausado) {
					segundos++;
					texto.setText(String.valueOf(segundos));
					Thread.sleep(1000);
					
			}			
		}catch (Exception e) {
		}
	}

	public void pararCrono() {
		this.pausado = true;
	}
}
