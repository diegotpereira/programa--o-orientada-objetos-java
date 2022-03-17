package br.com.java.colecao;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortExemplo {
	
	// O método java.util.Collections.sort() 
	// está presente na classe java.util.Collections. É usado 
	// para classificar os elementos presentes na lista 
	// especificada da Coleção em ordem crescente.
	public static void main(String[] args) {
		
		String[] ordenar = { "Corações", "Diamante", "Clubes", "Espadas"};

		// Crie e exiba uma lista contendo os elementos da matriz de ternos
		List<String> lista = Arrays.asList(ordenar);

		System.out.printf("Elementos de array não ordenados: %s\n", lista);

		Collections.sort(lista, Collections.reverseOrder());

		System.out.printf("Elementos de array ordenados: %s\n", lista);
	}
}
