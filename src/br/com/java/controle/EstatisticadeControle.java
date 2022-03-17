package br.com.java.controle;

public class EstatisticadeControle {
	
	public static void main(String[] args) {
		int a = 10, b = 20;
		int i = 10, j = 3, k = 8;
		int c = 30, d = 50;

		if (i == 10) {
				if (j < 20) 
					a = b;
				if(k > 100)
				// isso se é
				    c = d;

				else
				// associado a este outro
				    a = c;
		} else {
			// isso se refere a se (i == 10)
			a = d;
		}
	}
}
