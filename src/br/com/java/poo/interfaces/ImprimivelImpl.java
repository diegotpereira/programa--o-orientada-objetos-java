package br.com.java.poo.interfaces;

public class ImprimivelImpl implements Imprimivel{

	@Override
	public void imprimir() {
		System.out.println("ImprimivelImpl está imprimindo...");
	}
	public static void main(String[] args) {
		Imprimivel obj = new ImprimivelImpl();
		obj.imprimir();
	}
}
