package ej06_comunicacion_entre_procesos;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class AppSub {

	//	Subproceso que recibe un comando y devuelve una respuesta
	public static void main(String[] args) {
		try {
			BufferedReader leerComando = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter responderAlProceso = new PrintWriter(System.out, true);
			
			// Leemos el comando del proceso principal
			String comando = leerComando.readLine();
			responderAlProceso.println(comando);
			
			//Leer el input
			String input = leerComando.readLine();
		
			// Enviamos una respuesta al proceso principal
			responderAlProceso.println(input);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
