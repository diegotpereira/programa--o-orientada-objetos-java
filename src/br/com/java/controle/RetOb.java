package br.com.java.controle;

public class RetOb {
	
	public static void main(String[] args) {
		Teste obj1 = new Teste(2);
		Teste obj2;

		obj2 = obj1.incrementaPorDez();

		System.out.println("obj1.a: " + obj1.a);
		System.out.println("obj2.a: " + obj2.a);

		obj2 = obj2.incrementaPorDez();

		System.out.println("obj2.a após o segundo incremento: " + obj2.a);
	}
}
class Teste {
	int a;
	
	Teste(int i) {
		a = i;
	}
	Teste incrementaPorDez() {
		Teste tmp = new Teste(a + 10);

		return tmp;
	}
}