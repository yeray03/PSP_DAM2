package procesos;

public class SecondaryProcessA {
	public static void main(String[] args) {
		boolean flag = true;
		if (flag) {
			System.exit(666);
		}
		System.exit(100);
	}
}
