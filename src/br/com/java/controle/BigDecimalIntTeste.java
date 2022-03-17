package br.com.java.controle;

import java.math.BigDecimal;

public class BigDecimalIntTeste {
	
	public static void main(String[] args) {
		BigDecimal dec1 = new BigDecimal("25.5");
		BigDecimal dec2 = new BigDecimal(25.5);
		BigDecimal total = dec1.add(dec2);

		System.out.println(total);

		if(total.intValue() > 100) {
			System.out.println("total é maior que 100");
		} else {
			System.out.println("total é menor que 100");
		}
	}
}
