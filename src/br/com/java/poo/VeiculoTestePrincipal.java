package br.com.java.poo;

import br.com.java.poo.heranca.Veiculo;

public class VeiculoTestePrincipal extends Veiculo{
    
    public static void main(String[] args) {
        VeiculoTestePrincipal veiculoTestePrincipal = new VeiculoTestePrincipal();
        System.err.println(veiculoTestePrincipal.velocidade);
        System.out.println(veiculoTestePrincipal.tamanho);
    }
}
