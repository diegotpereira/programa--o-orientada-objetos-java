package br.com.java.controle;

public class SwitchDemo {
	
	public static void main(String[] args) {
		
		int mes = 25;
		int ano = 2001;
		int numDias = 0;

		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:

			numDias = 31;
			break;

			case 4:
			case 6:
			case 9:
			case 11:
			numDias = 30;
			break;

			case 2:
			if((ano % 4 == 0 && !(ano % 100 == 0)) || (ano % 400 == 0))
			numDias = 29;
			else 
			numDias = 28;
			break;

			default:
			System.out.println("Mês inválido.");
		}
		System.out.println("Número de dias: " + numDias);
	}
}
