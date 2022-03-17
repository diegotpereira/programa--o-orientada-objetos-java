package br.com.java.poo.polimorfismo.superex;

public class Bicicleta extends Veiculo{
	int velocidade = 100;

	public void exibirVelocidade() {
		System.out.println("Bicicleta velocidade: " + velocidade);
		System.out.println("Veiculo velocidade: " + super.velocidade);
	}
	public static void main(String[] args) {
		Bicicleta bicicleta = new Bicicleta();
		bicicleta.exibirVelocidade();
	}
}
