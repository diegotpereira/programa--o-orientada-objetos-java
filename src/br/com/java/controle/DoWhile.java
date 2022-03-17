package br.com.java.controle;

import java.util.Scanner;

public class DoWhile {
	
	public static void main(String[] args) {
		System.out.println("Digite um número: ");

		Scanner teclado = new Scanner(System.in);

		int n = teclado.nextInt();

		do {
			System.out.println("marcação " + n);
			n--;
		} while( n > 10);
	}
}
