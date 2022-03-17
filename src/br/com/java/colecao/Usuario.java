package br.com.java.colecao;

import java.io.Serializable;

public class Usuario  implements Serializable{

	private static final long serialVersionUID = 7031679283226403692L;

	private int id;
	private String nome;

	public Usuario(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
