package br.com.java.colecao;

import java.util.ArrayList;
import java.util.List;

public class UsuarioArrayList {
	
	public static void main(String[] args) {
		
		List<Usuario> usuarioLista = new ArrayList<Usuario>();
		usuarioLista.add(new Usuario(1, "Usuario1"));
		usuarioLista.add(new Usuario(2, "Usuario2"));
		usuarioLista.add(new Usuario(3, "Usuario3"));
		usuarioLista.add(new Usuario(4, "Usuario4"));
		usuarioLista.add(new Usuario(5, "Usuario5"));

		System.out.println("Usuário no índice 2: " + usuarioLista.get(2) + " \n");

		usuarioLista.add(2, new Usuario(10, "Novo Usuário"));

		for(Usuario usuario : usuarioLista) {
			System.out.println(usuario);
		}
	}
}
