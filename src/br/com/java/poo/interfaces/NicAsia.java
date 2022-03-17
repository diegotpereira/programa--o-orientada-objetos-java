package br.com.java.poo.interfaces;

public class NicAsia implements Banco {

	@Override
	public String getBancoNome() {
		return "NIC Asia";
	}

	@Override
	public int getAvaliacao() {
		return 10;
	}
	
}
