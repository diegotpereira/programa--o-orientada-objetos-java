package br.com.java.poo.heranca;

public class Onibus extends Veiculo{
	
	private int cc;
	private int engrenagens;

	public Onibus(String cor, int velocidade, int tamanho, int cc, int engrenagens ) {
		super(cor, velocidade, tamanho);
		this.cc = cc;
		this.engrenagens = engrenagens;
	}
	public void atributosOnibus() {
		System.out.println("Cor: " + super.getCor());
		System.out.println("Velocidade: " + super.velocidade);
		System.out.println("Tamanho: " + super.tamanho);
		System.out.println("CC: " + this.cc);
		System.out.println("Engrenagens: " + this.engrenagens);
	}
	public static void main(String[] args) {
		Onibus onibus = new Onibus("Vermelho", 100, 500, 150, 5);
		onibus.atributosOnibus();

		onibus.setCor("Verde");
		onibus.atributosOnibus();
	}
}
