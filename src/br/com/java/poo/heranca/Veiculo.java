package br.com.java.poo.heranca;

public class Veiculo {
	
	private String cor;
	public int velocidade;
	protected int tamanho;

	public Veiculo() {}

	public Veiculo(String cor, int velocidade, int tamanho) {
		this.cor = cor;
		this.velocidade = velocidade;
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public void setVeiculoProp(String cor, int velocidade, int tamanho) {
		this.cor = cor;
		this.velocidade = velocidade;
		this.tamanho = tamanho;
	}
}
