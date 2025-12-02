package procesos;

public class ProcessMainB {
	public static void main(String[] args) {
		try {
			ProcessBuilder processBuilder = new ProcessBuilder("java", "-cp", "bin", "procesos.SecondaryProcessB");
			Process process = processBuilder.start();

			int exitCode = process.waitFor();
			
			if(exitCode == 0) {
				String output = new String(process.getInputStream().readAllBytes());
				System.out.println(output);
			}else {
				System.out.println("algo ha salido mal con el proceso secundario.");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
