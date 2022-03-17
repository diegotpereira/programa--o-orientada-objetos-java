package br.com.java.controle;

public class ForEachDemo {
	
	public static void main(String[] args) {
		int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int somar = 0;

		for(int x : nums) {
			if (x == 5) {
				break;
			}
			somar += x;
			System.out.println("x = " + x);
		}
		System.out.println("Soma é: " + somar);
	}
}
