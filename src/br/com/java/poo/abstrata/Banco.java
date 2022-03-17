package br.com.java.poo.abstrata;

public abstract class Banco {
	
	public abstract String getBancoNome();

	protected abstract int getAvalicao();

	public int taxaSeServico = 4;

	protected double getTaxaSeCambioDoDolar() {
		return 101.5;
	}
}
