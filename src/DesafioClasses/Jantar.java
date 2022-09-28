package DesafioClasses;

public class Jantar {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Felipe" , 76.58);
		Comida comida1 = new Comida("Macarrão a bolonhesa", 0.5);
		Comida comida2 = new Comida("Filet mignon", 0.3);
		Comida comida3 = new Comida("Purê de batata", 0.2);
		Comida comida4 = new Comida("Pudim de chocolate", 0.3);
		System.out.println("Peso de "+ pessoa.nome + " antes de comer: " + pessoa.peso + ".");
		pessoa.Comer(comida1);
		pessoa.Comer(comida2);
		pessoa.Comer(comida3);
		pessoa.Comer(comida4);
		System.out.println("O seu peso total depois do jantar: " + pessoa.peso);
		System.out.println("Melhor preparar uma boa dieta!");
	}
}
