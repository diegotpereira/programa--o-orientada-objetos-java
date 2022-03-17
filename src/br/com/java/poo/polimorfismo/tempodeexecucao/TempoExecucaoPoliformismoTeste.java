package br.com.java.poo.polimorfismo.tempodeexecucao;

public class TempoExecucaoPoliformismoTeste {
	public static void main(String[] args) {
		Banco standChart = new StandChart();
		System.out.println("StandChart Avaliação: " + standChart.getAvaliacao());

		Banco nabil = new Nabil();
		System.out.println("Nabil avaliação: " + nabil.getAvaliacao());

		Banco nicAsia = new NicAsia();
		System.out.println("NicAsia avaliação: " + nicAsia.getAvaliacao());
	}
}
