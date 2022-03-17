package br.com.java.colecao;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExemplo {
	
	public static void main(String[] args) {
		
		// TreeSet do tipo de String
		TreeSet<String> set = new TreeSet<String>();

		// Adicionado elementos no TreeSet String
		set.add("ABC");
		set.add("String");
		set.add("Teste");
		set.add("Pen");
		set.add("Ink");
		set.add("Jack");

		System.out.println(set);

		// TreeSet do tipo de Integer
		TreeSet<Integer> set2 = new TreeSet<Integer>();

		// Adicionado elementos no TreeSet Integer
		set2.addAll(Arrays.asList(88, 7, 101, 0, 3, 222));

		System.out.println(set2);
	}
}
