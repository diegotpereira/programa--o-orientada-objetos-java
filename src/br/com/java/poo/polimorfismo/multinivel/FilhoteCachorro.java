package br.com.java.poo.polimorfismo.multinivel;

public class FilhoteCachorro extends Cachorro{
	void comer() {
		System.out.println("Classe FilhoteCachorro: bebendo leite");
	}
	public static void main(String[] args) {
		Animal a1 = new Animal();
		Animal a2 = new Cachorro();
		Animal a3 = new FilhoteCachorro();

		a1.comer();
		a2.comer();
		a3.comer();
	}
}
