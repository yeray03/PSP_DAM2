package procesos;


public class ProcessMainA {
	public static void main(String[] args) {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", "bin", "procesos.SecondaryProcessA");
			Process process = processBuilder.start();
			int exitCode = process.waitFor();
			
			if (exitCode == 666) {
				System.out.println("proceso secundario finalizado con codigo de salida: " + exitCode);
			}else {
				System.out.println("proceso secundario finalizado con codigo de salida: " + exitCode);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
