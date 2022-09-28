package fundamentos;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String valor = "";
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Digite algo: ");
			valor = entrada.nextLine();
			if(!valor.equalsIgnoreCase("sair")) {
				System.out.println("Para sair digite: \"sair\"");
			}
		}
		System.out.println("Saiu com sucesso!");
		entrada.close();
	}
}
