package br.com.java.poo.heranca;

public class Carro extends Veiculo{

	private int cc;
	private int engrenagens;

	public void atributosCarro() {
		System.out.println("Cor: " + getCor());
		System.out.println("Velocidade: " + velocidade);
		System.out.println("Tamanho: " + tamanho);
		System.out.println("CC: " + this.cc);
		System.out.println("Engrenagens: " + engrenagens);
	}
	public static void main(String[] args) {
		Carro carro = new Carro();
		carro.cc = 100;
		carro.engrenagens = 5;
		carro.setVeiculoProp("Vermelho", 80, 500);
		carro.atributosCarro();

		System.out.println(carro.getCor());
	}
}
