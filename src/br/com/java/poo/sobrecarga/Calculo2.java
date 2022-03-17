package br.com.java.poo.sobrecarga;

public class Calculo2 {
	
	int soma(int a, int b) {
		return(a + b);
	}
	int soma(double a, double b) {
		int r = (int)(a + b);

		return r;
	}
	int soma(String a, String b){
		int r = Integer.valueOf(a) + Integer.valueOf(b);

		return r;
	}
	public static void main(String[] args) {
		Calculo2 calculo2 = new Calculo2();
		int r = calculo2.soma(10.5, 10.5);

		System.out.println(r);
		System.out.println(calculo2.soma(10.5, 10.5));
		System.out.println(calculo2.soma("55", "44"));
		System.out.println(calculo2.soma(100, 100));
	}
}
