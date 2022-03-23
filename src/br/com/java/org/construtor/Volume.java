package br.com.java.org.construtor;

public class Volume {
	
	int comprimento;
	int largura;
	int altura;

	public Volume() {}

	Volume(int comprimento, int largura, int altura) {
		this.comprimento = comprimento;
		this.largura = largura;
		this.altura = altura;
	}
	void exibirVolume() {
		int vol = this.comprimento * this.largura * this.altura;
		System.out.println("Volume: " + vol);
	}
	void exibirArea() {
		int area = largura * altura;
		System.out.println("Area: " + area);
	}
}
