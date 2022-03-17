package br.com.java.colecao;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExemplo {
	
	public static void main(String[] args) {
		
		Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		linkedHashSet.addAll(Arrays.asList(20, 10, 50, 75, 90));

		System.out.println(linkedHashSet);

		Set<String> linkedHashSet2 = new LinkedHashSet<String>();
		linkedHashSet2.addAll(Arrays.asList("Olá", "Mundo", "Java"));
		
		System.out.println(linkedHashSet2);
	}
}
