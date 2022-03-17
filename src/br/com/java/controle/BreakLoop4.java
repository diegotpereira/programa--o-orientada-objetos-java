package br.com.java.controle;

public class BreakLoop4 {
	
	public static void main(String[] args) {
		exterior: for(int index = 0; index < 3; index++) {
			System.out.println("Passar " + index + ": ");

			for(int j = 0; j < 100; j++) {
				if(j == 10)
				break exterior;

				System.out.print(j + " ");
			}
			System.out.println("Isso não será impresso");
		}
		System.out.println("Loop Completo");
	}
}
