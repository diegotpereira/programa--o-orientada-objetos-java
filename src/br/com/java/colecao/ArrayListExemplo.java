package br.com.java.colecao;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExemplo {
	
	public static void main(String[] args) {

		List<String> paisLista = new LinkedList<String>();
		paisLista.add("Argentina");
		paisLista.add("Bolivia");
		paisLista.add("Chile");
		paisLista.add("Paraguai");
		paisLista.add("Uruguai");

		if (paisLista.contains("Chile")) {
			System.out.println("Sim contém o Chile na lista.");
		}

		System.out.println("-----------Iterator------------");
		// Iterator pode ser usado para percorrer.
		Iterator<String> itr = paisLista.iterator();

		// O método hasNext() é usado para verificar se há algum elemento restante na lista.
		while(itr.hasNext()) {
			String s = itr.next();

			System.out.println("----------Elementos-------------");
			System.out.println(s);

			System.out.println("----------Podemos remover elementos dentro do iterador.-------------");
			if (s.equals("Paraguai")) {
				itr.remove();
			}
		}
		paisLista.remove(2);

		String npl = paisLista.get(0);

		System.out.println("String:" + npl);
		System.out.println("Nº de elementos restantes: " + paisLista.size());


		System.out.println("----------Foreach-------------");

		// Foreach: finalidade de exibição
		for(String s : paisLista) {
			System.out.println(s);
		}
		for(int index = 0; index < paisLista.size(); index++) {
			String s = paisLista.get(index);
			paisLista.remove(index);

			System.out.println(s);
		}

		System.out.println("-----------5------------");
		for(int index = 0; index < paisLista.size(); index++) {
			String s = paisLista.get(index);
			paisLista.remove(index);

			System.out.println(s);
		}

		System.out.println("------------isEmpty-----------");
		paisLista.clear();
		System.out.println(paisLista.isEmpty());

	System.out.println(paisLista);
	}
}
