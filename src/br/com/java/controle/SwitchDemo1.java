package br.com.java.controle;

import java.util.Scanner;

public class SwitchDemo1 {
	
	public static void main(String[] args) {
		System.out.println("Insira um mês:");

		Scanner teclado = new Scanner(System.in);
		int mes = teclado.nextInt();

		String mesString;

		switch(mes) {
			case 1:
			case 2:
			case 3:

			mesString = "Janeiro";
			break;

			case 4:
			mesString = "Abril";
			break;

			case 5:
			mesString = "Maio";

			case 6:
			mesString = "Junho";
			break;

			case 7:
			mesString = "Julho";
			break;

			case 8:
			mesString = "Agosto";
			break;

			case 9:
			mesString = "Setembro";
			break;

			case 10:
			mesString = "Outubro";
			break;

			case 11:
			mesString = "Novembro";
			break;

			case 12:
			mesString = "Dezembro";
			break;

			default:
			mesString = "Mês inválido";
			break;
			
		}
		System.out.println(mesString);
	}
}
