package br.com.java.poo.sobreposicao.banco;

public class TesteDeTaxaDeJuros {
	public static void main(String[] args) {
		StandChart standChart = new StandChart();

		System.out.println("StandChart avaliação: " + standChart.getAvaliacao());

		Nabil nabil = new Nabil();
		System.out.println("Nabil avaliação: " + nabil.getAvaliacao());

		NicAsia nicAsia = new NicAsia();
		System.out.println("NicAsia: " + nicAsia.getAvaliacao());
	}
}
