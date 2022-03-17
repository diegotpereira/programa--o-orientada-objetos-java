package br.com.java.poo.sobrecarga;

public class Calculo {
	
	void soma(int a, int b) {
		System.out.println(a + b);
	}
	void soma(int a, int b, int c) {
		System.out.println(a + b + c);
	}
	public static void main(String[] args) {
		Calculo calculo = new Calculo();
		calculo.soma(10, 10, 10);
		calculo.soma(20, 20);
	}
}
