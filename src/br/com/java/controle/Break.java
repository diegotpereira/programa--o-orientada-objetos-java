package br.com.java.controle;

public class Break {
	
	public static void main(String[] args) {
		boolean t = true;

		primeiro: {
			segundo: {
				terceiro: {
					System.out.println("Antes do break");
					if(t)
					break segundo;

					System.out.println("Isso não será executado");
				}
				System.out.println("Isso não será executado");
			}
			System.out.println("Isto é depois do segundo bloco.");
		}
	}
}
