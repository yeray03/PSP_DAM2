package ej05_tcpChat.server;

import java.awt.EventQueue;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Interfaz para el lado servidor. Delega en la clase Servidor (un Hilo) la
 * comunicacion mediante socket tcp.
 * 
 * No importa cuantos clientes diferentes lancemos, el servidor da soporte a
 * todos ellos.
 * 
 */
public class VentanaDelServer extends JFrame {

	private static final long serialVersionUID = 80016694043401373L;

	private JTextField jTextField = new JTextField();
	private JScrollPane jScrollPane = null;
	private JTextArea jTextArea = null;

	private static final int puertoServer = 49171;
	private Servidor servidor = null;
	
	public VentanaDelServer() {
		super("Server");

		this.setBounds(0, 0, 500, 450);

		getContentPane().setLayout(null);
		jTextField.setBounds(10, 10, 400, 30);
		jTextField.setEditable(false);
		getContentPane().add(jTextField);
		
		jTextArea = new JTextArea();
		jTextArea.setText("Esperando conexiones... \n");
		jTextArea.setEditable(false);
		jScrollPane = new JScrollPane(jTextArea);
		jScrollPane.setBounds(10, 50, 400, 300);
		getContentPane().add(jScrollPane);

		// La gestion del socket del servidor se hace en un hilo a parte...
		
		// TODO Something to do here...
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent evt) {

				// TODO Something to do here...
				
				System.exit(0);
			}
		});
	}

	public static void main(String args[]) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaDelServer frame = new VentanaDelServer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}