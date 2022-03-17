package br.com.java.poo;

public class BlocoEstatico {
    
    private static String faculdade;

    static {
        faculdade = "PUC";

        System.out.println("bloco estático é invocado");
    }
    public static void main(String[] args) {
        System.out.println("Olá do main");

        System.out.println(faculdade);

        faculdade = "URGS";

        System.out.println(faculdade);
    }
}
