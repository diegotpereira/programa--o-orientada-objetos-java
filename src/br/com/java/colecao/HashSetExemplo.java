package br.com.java.colecao;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExemplo {
	
	public static void main(String[] args) {
		HashSet<String> paisSet = new HashSet<String>();

		paisSet.add("Argentina");
		paisSet.add("Bolivia");
		paisSet.add("Chile");
		paisSet.add("Paraguai");
		paisSet.add("Uruguai");

		Iterator<String> itr = paisSet.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		paisSet.remove("Paraguai");

		for(String pais : paisSet) {
			System.out.println(pais);
		}
	}
}
