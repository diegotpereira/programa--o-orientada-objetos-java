package br.com.java.tarefas;

public class Tarefa1 {

	public static void main(String[] args) {

		int soma = 0;

		for(int index = 0; index < args.length; index++) {
			soma = soma + Integer.parseInt(args[index]);
		}
		double avg = soma/args.length;

		System.out.println("Soma: " + soma + " Avg: " + avg);
	}
}