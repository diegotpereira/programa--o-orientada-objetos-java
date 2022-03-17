package br.com.java.poo.abstrata;

public class Nabil extends Banco {

	@Override
	public String getBancoNome() {
		
		return "Nabil";
	}

	@Override
	protected int getAvalicao() {
		
		return 6;
	}
	
}
