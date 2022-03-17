package br.com.java.poo.abstrata;

public class StandChart extends Banco {

	@Override
	public String getBancoNome() {
		
		return "Standard Chartered";
	}

	@Override
	protected int getAvalicao() {
		
		return 4;
	}
	
}
