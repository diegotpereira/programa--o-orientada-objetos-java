package br.com.java.poo.abstrata;

public class AbstrataClasseTeste {
	
	public static void main(String[] args) {
		
		Banco nabil = new Nabil();
		exibirInfoBanco(nabil);

		Banco nicAsia = new NicAsia();
		exibirInfoBanco(nicAsia);

		Banco stdChart = new StandChart();
		exibirInfoBanco(stdChart);

	}
	public static void exibirInfoBanco(Banco banco) {
		System.out.println("Banco nome: " + banco.getBancoNome() + ", Avaliação: " + banco.getAvalicao());
		System.out.println("Taxa de serviço: " + banco.taxaSeServico + ", Taxa Ex do Dólar: " + banco.getTaxaSeCambioDoDolar());
	 }
}
