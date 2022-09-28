package Classe;

public class Produto {
	public String nome;
	public double preco;
	public static double desconto = 0.25;

	Produto() {

	}

	Produto(double a) {
		desconto = a;
	}

	public double descontoProduto() {
		return preco - preco * desconto;
	}

	public String precentagemDesconto() {
		double porcento = desconto * 100;
		return (int) porcento + "%";
	}
}
