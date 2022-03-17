package br.com.java.controle;

public class Continue {
	
	public static void main(String[] args) {
		
		for(int index = 0; index < 10; index++) {
			if (index % 2 == 0) {
				continue;
			}
			System.out.println(index);
		}
	}
}
