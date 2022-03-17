package br.com.java.poo.sobrecarga;

public class SobrecargaTipoPromocaoCalc {
	
	void soma(int a, int b) {
		System.out.println("int arg método invocado");
	}
	void soma(long a, long b) {
		System.out.println("long arg método invocado");
	}
	public static void main(String[] args) {
		SobrecargaTipoPromocaoCalc sobrecargaTipoPromocaoCalc = new SobrecargaTipoPromocaoCalc();
		sobrecargaTipoPromocaoCalc.soma(20, 20);
		sobrecargaTipoPromocaoCalc.soma(50, 20);
	}
}
