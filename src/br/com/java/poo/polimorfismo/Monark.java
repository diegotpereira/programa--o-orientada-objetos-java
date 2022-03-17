package br.com.java.poo.polimorfismo;

public class Monark extends Bicicleta{
	
	@Override
	public void rodar() {
		
		System.out.println("Rodando bicicleta monark");
	}
	public static void main(String[] args) {
		Bicicleta bicicleta = new Monark();
		bicicleta.rodar();
	}
}
