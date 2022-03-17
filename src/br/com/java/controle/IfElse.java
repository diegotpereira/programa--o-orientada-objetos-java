package br.com.java.controle;

public class IfElse {
	
	public static void main(String[] args) {
		
		int mes = 4; // abril
		String estacao;

		if(mes == 12 || mes == 1 || mes == 2) {
			estacao = "verão";
		} else if(mes == 3 || mes == 4 || mes == 5) {
			estacao =  "outono";
		} else if(mes == 6 || mes == 7 || mes == 8) {
			estacao = "inverno";
		} else if(mes == 9 || mes == 10 || mes == 11) {
			estacao = "primavera";
		} else {
			estacao = "Mês falso";
		}
		System.out.println("Abril está no " + estacao + " .");
	}
}
