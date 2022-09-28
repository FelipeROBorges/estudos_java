package fundamentos;

import java.util.Scanner;

public class DesafioConvertString {
	public static void main(String[] args) {
		/*
		 * Maneira mais simples de resolver o problema, porém pode ser melhorada atrazes do uso de um array de 
		 * strings, tulizando o for para fazer o replace em cada um, o que tornaria o código mais reutilizavel
		 * e disponível para absorver uma quantidade muito maior de valores.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite seu primeiro salário:");
		String primsal = scanner.nextLine();
		System.out.println("Digite seu segundo salário:");
		String segunsal = scanner.nextLine();
		System.out.println("Digite seu terceiro salário:");
		String tercsal = scanner.nextLine();
		double media = ( Double.parseDouble(primsal.replace(",",".")) + 
				Double.parseDouble(segunsal.replace(",",".")) + 
				Double.parseDouble(tercsal.replace(",",".")) ) / 3;
		System.out.println("Essa é sua média: " + media);
		scanner.close();
	}

}
