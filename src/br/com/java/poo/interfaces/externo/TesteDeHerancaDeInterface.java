package br.com.java.poo.interfaces.externo;

public class TesteDeHerancaDeInterface implements Exibivel, Legivel{

	public static void main(String[] args) {
		TesteDeHerancaDeInterface obj = new TesteDeHerancaDeInterface();
		obj.imprimir();
		obj.ler();
		obj.exibir();

		System.out.println(obj.hashCode());

		Exibivel exibivel = new TesteDeHerancaDeInterface();
		exibivel.imprimir();
		exibivel.imprimir();
		exibivel.exibir();

		((Legivel) exibivel).ler();

		Imprimivel imprimivel = new TesteDeHerancaDeInterface();
		imprimivel.imprimir();

		((Legivel) imprimivel).ler();
		((Exibivel) imprimivel).exibir();

		Legivel legivel = new TesteDeHerancaDeInterface();
		System.out.println(Legivel.nenhumaPessoaLida);

		legivel.ler();

		// Casting para outra interface
		((Imprimivel) legivel).imprimir();
		((Exibivel) legivel).exibir();
	}

	@Override
	public void imprimir() {
		System.out.println("Imprimir");
	}

	@Override
	public void ler() {
		System.out.println("Ler");
	}

	@Override
	public void exibir() {
		System.out.println("Exibir");
	}
}
