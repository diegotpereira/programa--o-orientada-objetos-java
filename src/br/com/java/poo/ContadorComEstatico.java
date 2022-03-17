package br.com.java.poo;

public class ContadorComEstatico {
    static int contar = 0;

    ContadorComEstatico() {
        contar++;
    }
    private void exibirContagem() {
        System.out.println(contar);
    }
    public static void main(String[] args) {
        new ContadorComEstatico().exibirContagem();
        new ContadorComEstatico().exibirContagem();
        new ContadorComEstatico().exibirContagem();
    }
}
