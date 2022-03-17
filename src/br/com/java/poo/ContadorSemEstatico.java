package br.com.java.poo;

public class ContadorSemEstatico {
    int contar = 0;

    ContadorSemEstatico() {
        contar++;
    }
    private void exibirContar() {
        System.out.println(contar);
    }
    public static void main(String[] args) {
        new ContadorSemEstatico().exibirContar();
        new ContadorSemEstatico().exibirContar();
        new ContadorSemEstatico().exibirContar();
    }
}
