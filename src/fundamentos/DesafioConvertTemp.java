package fundamentos;

public class DesafioConvertTemp {
	public static void main(String[] args) {
		double far = 50;
		final int sub = 32;
		final double Div = 5/9.0; // .0 - viabiliza divisão de número real 
		double result = (far - sub) * Div ;
		System.out.println("Resultado: " + result + "C.");
	}
}
