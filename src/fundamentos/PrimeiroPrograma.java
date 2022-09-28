package fundamentos;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		System.out.println("Oi mundo!");
		int var = 0;
		int var2 = 0;

		var++;
		var2 = 9;

		if (var == 1) {
			System.out.println("Valor da variavel 1: " + var);
			System.out.println("Valor da variavel 2: " + var2);
		}
		var = 0;
		for (int i = 0; i < 10; i++) {
			var++;
			System.out.println(var);
		}
	}
}
