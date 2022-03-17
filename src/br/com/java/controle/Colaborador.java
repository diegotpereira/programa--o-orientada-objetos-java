package br.com.java.controle;

import javax.swing.text.AttributeSet.ColorAttribute;

public class Colaborador {

	int id;
	String nome;
	Endereco endereco;

	public Colaborador(int id, String nome, Endereco endereco) {
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
	}

	
	@Override
	public String toString() {
		return id + " " + nome + " " + endereco;
	}

	public static void main(String[] args) {
		
		Endereco endereco1 = new Endereco("Porto Alegre", "RS", "Brasil");
		Colaborador colaborador1 = new Colaborador(111, "João", endereco1);

		System.out.println(colaborador1);
	}
}
