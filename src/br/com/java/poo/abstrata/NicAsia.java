package br.com.java.poo.abstrata;

public class NicAsia extends Banco {

	@Override
	public String getBancoNome() {
		
		return "NIC Asia";
	}

	@Override
	protected int getAvalicao() {
		
		return 10;
	}
	
}
