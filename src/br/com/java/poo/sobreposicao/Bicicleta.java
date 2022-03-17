package br.com.java.poo.sobreposicao;

public class Bicicleta extends Veiculo{
	@Override
	public void rodar() {
		
		super.rodar();
		System.out.println("Bicicleta está funcionando!");
	}
	public static void main(String[] args) {
		Bicicleta bicicleta = new Bicicleta();
		bicicleta.rodar();
	}
}
