package br.com.java.controle;

public class MoedaEnumTeste {
	
	public static void main(String[] args) {
		
		Moeda moeda = Moeda.DIME;

		System.out.println(moeda == Moeda.PENNY);

		int dimeValor = Moeda.DIME.getValor();

		System.out.println("Dime Valor: " + dimeValor);

		System.out.println(dimeValor);
	}
}
