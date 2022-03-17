package br.com.java.poo.bloco;

public class Bicicleta {
	
	private int velocidade;

	public Bicicleta() {
		System.out.println("Construtor: " + velocidade);
	}
	{
		velocidade = 100;
		System.out.println("Bloco: " + velocidade);
	}
	public static void main(String[] args) {
		Bicicleta bicicleta = new Bicicleta();
	}
}
