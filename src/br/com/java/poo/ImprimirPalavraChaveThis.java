package br.com.java.poo;

public class ImprimirPalavraChaveThis {
    
    public void imprimirThis() {
        System.out.println(this);
    }
    public static void main(String[] args) {
        ImprimirPalavraChaveThis obj = new ImprimirPalavraChaveThis();
        obj.imprimirThis();

        System.out.println(obj);
    }
}
