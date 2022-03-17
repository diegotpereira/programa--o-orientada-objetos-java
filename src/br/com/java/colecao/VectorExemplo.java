package br.com.java.colecao;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExemplo {
	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();

		// Adicionado elementos no Vector
		vector.addElement("Maça");
		vector.addElement("Laranja");
		vector.addElement("Manga");
		vector.addElement("Figo");

		System.out.println("Tamanho é: " + vector.size());

		// Exibindo elemento no Vector
		Enumeration<String> en = vector.elements();

		System.out.println("\nElementos são: ");
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement() + " ");
		}
	}
}
