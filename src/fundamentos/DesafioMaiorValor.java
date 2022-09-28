package fundamentos;

import java.util.Scanner;

public class DesafioMaiorValor {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double comparador = 0;
		for(int i= 0; i < 10; i++) {
			System.out.print("Digite um valor: ");
			double valor = entrada.nextDouble(); 
			if(valor > comparador) {
				comparador = valor;
			}
		}
		System.out.println("Maior valor: " + comparador);
		entrada.close();
	}
}
