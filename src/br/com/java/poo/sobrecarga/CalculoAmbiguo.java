package br.com.java.poo.sobrecarga;

public class CalculoAmbiguo {
	void soma(int a, long b) {
		System.out.println("método a invocado");
	}
	void soma(long a, int b) {
		System.out.println("método b invocado");
	}
	public static void main(String[] args) {
		CalculoAmbiguo calculoAmbiguo = new CalculoAmbiguo();
		//calculoAmbiguo.soma(20, 20); //agora ambiguidade
	}
}
