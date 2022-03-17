package br.com.java.colecao;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExemplo {
	
	public static void main(String[] args) {
		
		// Como se declara TreeMap
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		// Adicionando elementos na TreeMap
		treeMap.put(12, "Core Java");
		treeMap.put(2, "JSF");
		treeMap.put(7, "Spring");
		treeMap.put(49, "Hibernate");
		treeMap.put(3, "Maven");

		// Exbindo o conteúdo usado Iterator
		Set set = treeMap.entrySet();
		Iterator iterator = set.iterator();
		while(iterator.hasNext()) {
			Map.Entry mente = (Map.Entry) iterator.next();

			System.out.println("Chave é:" + mente.getKey() + " & valor é: " + mente.getValue() + "\n");
		}
	}
}
