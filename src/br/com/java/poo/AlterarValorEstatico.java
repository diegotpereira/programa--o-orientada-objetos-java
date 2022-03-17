package br.com.java.poo;

public class AlterarValorEstatico {
    int chamadaNo;
    String nome;
    private static String faculdade = "PUC";

    AlterarValorEstatico(int chamadaNo, String nome) {
        this.chamadaNo = chamadaNo;
        this.nome = nome;
    }
    void exibir() {
        System.out.println(chamadaNo + " " + nome + " " + faculdade + "\n");
    }
    public static void main(String[] args) {
        AlterarValorEstatico al1 = new AlterarValorEstatico(111, "João");
        al1.exibir();

        AlterarValorEstatico.faculdade = "URGS";

        AlterarValorEstatico al2 = new AlterarValorEstatico(222, "José");
        AlterarValorEstatico al3 = new AlterarValorEstatico(333, "Maria");

        al1.exibir();
        al2.exibir();
        al3.exibir();
    }
}