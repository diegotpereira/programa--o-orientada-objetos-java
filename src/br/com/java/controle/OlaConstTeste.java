package br.com.java.controle;

public class OlaConstTeste {

	private final String dy = "SEGUNDA";
	
	public static void main(String[] args) {
		
		OlaConstTeste obj = new OlaConstTeste();
		obj.imprimirSemana(Dia.SEGUNDA);

		// Teste equals
		Dia dia = Dia.SEGUNDA;
		boolean ehIgual = (dia == Dia.SEGUNDA);
		System.out.println(ehIgual);

		boolean ehhIgual = (obj.dy == "ABC");
		boolean ehIgual2 = (Dia.DOMINGO == Dia.SEGUNDA);
	}
	public void imprimirSemana(Dia dia) {
		System.out.println("Dia é: ");

		switch(dia) {
			case SEGUNDA:
			System.out.println(Dia.SEGUNDA);
			break;

			case DOMINGO:
			System.out.println(Dia.DOMINGO);
			break;

			default:
			System.out.println("o dia não é valido");
			break;
		}
	}
}
