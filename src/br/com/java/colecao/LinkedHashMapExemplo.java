package br.com.java.colecao;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class LinkedHashMapExemplo {
	
	public static void main(String[] args) {
		
		// Declaração HashMap
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();

		// Adicionando elementos no LinkedHashMap
		linkedHashMap.put(12, "Core Java");
		linkedHashMap.put(2, "JSF");
		linkedHashMap.put(7, "Spring");
		linkedHashMap.put(49, "Hibernate");
		linkedHashMap.put(3, "Maven");

		// Gerando um conjunto de entradas
		Set<Entry<Integer, String>>set = linkedHashMap.entrySet();

		// Exibindo elementos da LinkedHashMap
		Iterator<Entry<Integer, String>> iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry<Integer, String> me = iterator.next();

			System.out.println("Chave é: " + me.getKey() + " & valor é: " + me.getValue() + "\n");
		}
	}
}
