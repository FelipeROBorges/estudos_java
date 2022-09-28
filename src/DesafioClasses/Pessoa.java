package DesafioClasses;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String a,double b){
		nome = a;
		peso = b;
	}
	
	public void Comer(Comida a){
		peso += a.peso;
		System.out.println(nome + " acabou de comer " + a.nome + ".");
	}
}
