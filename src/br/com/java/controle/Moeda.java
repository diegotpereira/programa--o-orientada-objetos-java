package br.com.java.controle;

public enum Moeda {
	
	PENNY(1), NICKLE(5), DIME(10), QUARTER(25);

	private int valor;

	private Moeda(int valor) {
		this.valor = valor;
	}
	public int getValor() {
		return this.valor;
	}
	public void printEnums() {
		for(Moeda moeda : values()) {
			System.out.println(moeda);
		}
	}
}
