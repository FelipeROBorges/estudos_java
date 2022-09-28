package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		/*
		 * Para esse exercicio não foi permitudo o uso de if e case, somente estruturas condicionais mais promitivas
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite os valores:");
		final double val1 = entrada.nextDouble();
		final double val2 = entrada.nextDouble();
		System.out.println("Digite o operador:");
		String operador = entrada.next().trim();
		double result = operador.equals("*") ? val1 * val2 : 0;
		result = operador.equals("/") ?  val1 / val2 : result;
		result = operador.equals("-") ?  val1 - val2 : result;
		result = operador.equals("+") ? val1 + val2 : result;
		System.out.println("Resultado: " + result);
		entrada.close();
	}
}
