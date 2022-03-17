package br.com.java.poo.polimorfismo.binding;

public class Garoto extends Humano{
	@Override
	public void anda() {
		
		System.out.println("Garotos andam");
	}
	public static void main(String[] args) {
		Humano h = new Humano();
		h.anda();

		Garoto g = new Garoto();
		g.anda();

		Humano humano = new Garoto();
		humano.anda();
	}
}
