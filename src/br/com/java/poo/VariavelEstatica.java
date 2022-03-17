package br.com.java.poo;

public class VariavelEstatica {
    
    int chamadaNo;
    String nome;
    static String faculdade = "PUC";

    VariavelEstatica(int r, String n) {
        chamadaNo = r;
        nome = n;
    }
    void exibir() {
        System.out.println(chamadaNo + " " + nome + " " + faculdade + "\n");
    }
    public static void main(String[] args) {
        VariavelEstatica variavelEstatica1 = new VariavelEstatica(111, "George");
        VariavelEstatica variavelEstatica2 = new VariavelEstatica(222, "Pablo");

        variavelEstatica1.exibir();

        VariavelEstatica.faculdade =  "URGS";

        variavelEstatica1.exibir();
        variavelEstatica2.exibir();
    }
}
