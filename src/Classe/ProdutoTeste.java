package Classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto(0.20);
		p1.nome = "Laptop";
		p1.preco = 3000;
		System.out.println("Produto: " + p1.nome);
		System.out.println("Valor: " + "R$ " + p1.preco);
		System.out.println("Desconto: " + p1.precentagemDesconto());
		System.out.println("Valor com desconto: " + p1.descontoProduto());
	}
}
