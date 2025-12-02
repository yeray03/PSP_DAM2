package hilos;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Timers extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField texto1;
	private JTextField texto2;
	private JTextField texto3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Timers frame = new Timers();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Timers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		texto1 = new JTextField();
		texto1.setText("0");
		texto1.setBounds(36, 22, 237, 20);
		contentPane.add(texto1);
		texto1.setColumns(10);
		
		texto2 = new JTextField();
		texto2.setText("10");
		texto2.setColumns(10);
		texto2.setBounds(36, 59, 237, 20);
		contentPane.add(texto2);
		
		texto3 = new JTextField();
		texto3.setText("0");
		texto3.setColumns(10);
		texto3.setBounds(36, 103, 237, 20);
		contentPane.add(texto3);
		Crono2 crono2 = new Crono2(texto2);
		Crono1 cronometro1 = new Crono1(texto1);
		Crono3 cronometro3 = new Crono3(texto3);
		
		JButton boton1 = new JButton("boton1");
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(texto1.getText().equals("0")){
					if (texto3.getText().equals("0")) {
						Thread thread3 = new Thread(cronometro3);
						cronometro3.setPanel(contentPane);
						thread3.start();
					}
					Thread thread = new Thread(cronometro1);
					cronometro1.setPanel(contentPane);
					thread.start();
					
				}else {
					texto1.setText("0");
					cronometro1.pararCrono();
				}
			}
		});
		boton1.setBounds(36, 180, 89, 23);
		contentPane.add(boton1);
		
		JButton boton2 = new JButton("boton2");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thread thread2 = new Thread(crono2);
				if(texto2.getText().equals("10")){
					crono2.setPanel(contentPane);
					thread2.start();
					
				}else {
					texto2.setText("10");
					crono2.pararCrono();
				}
			}
		});
		boton2.setBounds(156, 180, 89, 23);
		contentPane.add(boton2);
		
		JButton boton3 = new JButton("boton3");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cronometro1.pararCrono();
				texto1.setText("0");
				crono2.pararCrono();
				texto2.setText("10");
				cronometro3.pararCrono();
				texto3.setText("0");
			}
		});
		boton3.setBounds(278, 180, 89, 23);
		contentPane.add(boton3);

	}
}
