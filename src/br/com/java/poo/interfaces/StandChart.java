package br.com.java.poo.interfaces;

public class StandChart implements Banco{

	@Override
	public String getBancoNome() {
		
		return "Standard Chartered";
	}

	@Override
	public int getAvaliacao() {
		
		return 4;
	}
	public int taxaSeCobrancaSeServico = 10;
}
