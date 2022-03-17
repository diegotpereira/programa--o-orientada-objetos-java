package br.com.java.colecao;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class HashMapExemplo {
	
	public static void main(String[] args) {
		
		// Como declarar HashMap
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

		// Adicionadno elementos no HashMap
		hashMap.put(12, "Core Java");
		hashMap.put(2, "JSF");
		hashMap.put(7, "Spring");
		hashMap.put(49, "Hibernate");
		hashMap.put(3, "Maven");

		System.out.println("----Obter valores com base na chave-------");
		String var = hashMap.get(2);
		System.out.println("Valor da chave 2 é: " + var + "\n");

		// Remover valores com base na chave
		hashMap.remove(3);

		System.out.println("-----Exibir conteúdo usando o Iterator-----");
		Set<Entry<Integer, String>> set = hashMap.entrySet();
		Iterator<Entry<Integer, String>> iterator = set.iterator();

		while(iterator.hasNext()) {
			Map.Entry<Integer, String> me = iterator.next();
			System.out.println("Chave é: " + me.getKey() + " & valor é: " + me.getValue() + "\n");
		}
		System.out.println("----------Jeito fácil------------------------");
		for(Entry<Integer, String> hm: hashMap.entrySet()) {
			System.out.println(hm.getKey() + " " + hm.getValue());
		}

		// para string funciona ainda mais fácil
		System.out.println(hashMap);
	}
}
