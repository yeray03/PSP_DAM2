package procesos;

public class SecondaryProcessB {
	public static void main(String[] args) {
		int valor1 = 10;
		int valor2 = 0;
		
		System.out.println("Suma: " + (valor1 + valor2));
		System.out.println("Resta: " + (valor1 - valor2));
		System.out.println("Producto: " + (valor1 * valor2));
		
		if (valor2 == 0) {
			System.out.println("Divison por cero");
		} else {
			System.out.println("Division: " + (valor1 / valor2));
		}
		System.exit(0);
	}
}
