package Classe;

public class Data {
	public int dia;
	public int mes;
	public int ano;

	Data() {
		dia = 1;
		mes = 1;
		ano = 1970;
	}

	Data(int a, int b, int c) {
		dia = a;
		mes = b;
		ano = c;
	}

	public String obterDataFormatada() {
		if (dia < 10 && mes < 10) {
			return "0" + dia + "/0" + mes + "/" + ano;
		} else if (dia < 10) {
			return "0" + dia + "/" + mes + "/" + ano;
		} else if (mes < 10) {
			return dia + "/0" + mes + "/" + ano;
		} else {
			return dia + "/" + mes + "/" + ano;
		}
	}
}
