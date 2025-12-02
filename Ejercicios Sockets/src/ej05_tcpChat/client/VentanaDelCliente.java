package ej05_tcpChat.client;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.*;

/**
 * Interfaz para el lado cliente. Delega en la clase Cliente la comunicacion
 * mediante socket tcp.
 * 
 * No importa cuantos clientes diferentes lancemos, el servidor da soporte a
 * todos ellos.
 * 
 */
public class VentanaDelCliente extends JFrame {

	private static final long serialVersionUID = 7398467837254400777L;

	private JTextArea jTextArea = null;
	private Cliente cliente = null;

	// Cambialo manualmente...
	private static final String ipServer = "127.0.0.1";
	private static final int puertoServer = 49171;
	private static final String nombreUsuario = "JUAN";

	public VentanaDelCliente() {
		super("Cliente");

		jTextArea = new JTextArea();
		jTextArea.setEnabled(false);
		jTextArea.setLineWrap(true);
		jTextArea.setWrapStyleWord(true);

		JScrollPane jScrollPane = new JScrollPane(jTextArea);
		JTextField jTextField = new JTextField("");
		JButton jButton = new JButton("Enviar");

		Container container = this.getContentPane();
		container.setLayout(new GridBagLayout());

		GridBagConstraints gridBagConstraints = new GridBagConstraints();

		gridBagConstraints.insets = new Insets(20, 20, 20, 20);

		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 0;
		gridBagConstraints.gridwidth = 2;
		gridBagConstraints.weightx = 1;
		gridBagConstraints.weighty = 1;
		gridBagConstraints.fill = GridBagConstraints.BOTH;
		container.add(jScrollPane, gridBagConstraints);

		gridBagConstraints.gridwidth = 1;
		gridBagConstraints.weighty = 0;

		gridBagConstraints.fill = GridBagConstraints.HORIZONTAL;
		gridBagConstraints.insets = new Insets(0, 20, 20, 20);

		gridBagConstraints.gridx = 0;
		gridBagConstraints.gridy = 1;
		container.add(jTextField, gridBagConstraints);

		gridBagConstraints.weightx = 0;

		gridBagConstraints.gridx = 1;
		gridBagConstraints.gridy = 1;
		container.add(jButton, gridBagConstraints);

		this.setBounds(400, 100, 400, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// El cliente...
		
		// TODO Something to do here...

		// Boton envio texto...
		jButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// TODO Something to do here...
				
				jTextField.setText("");
			}
		});

		// A cerrar la ventana, cerramos todo...
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent evt) {

				// TODO Something to do here...
				
				System.exit(0);
			}
		});
	}

	public static void main(String[] args) {
		VentanaDelCliente ventanaDelClient = new VentanaDelCliente();
		ventanaDelClient.setVisible(true);
	}
}