package br.com.java.controle;

public class EncontreMinPasseArr {

	public static void main(String[] args) {
		int a[] = { 30, 10, 3, 7, 2 };
		min(a);

		int b[] = { 50, 10, 15 };
		min(b);
	}
	static void min(int arr[]) {
		int min = arr[0];

		for(int index = 0; index < arr.length; index++) {
			if(arr[index] < min) {
				min = arr[index];
			}
		}
		System.out.println("Valor minimo: " + min);
	}
}
