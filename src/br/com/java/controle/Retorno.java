package br.com.java.controle;

import java.util.Arrays;

public class Retorno {

	public static void main(String[] args) {
		
			
	int[] a = { 6, 2, 3 };
	Arrays.sort(a);

	for(int a2 : a)
	System.out.println(a2);

	boolean t = true;

	System.out.println("Antes do retorno.");

	if(t)
	return;

	System.out.println("Isso não será executado.");
	}
}
