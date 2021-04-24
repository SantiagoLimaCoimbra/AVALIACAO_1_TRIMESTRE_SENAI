package sample;

import sample.model.Endereco;

public class Main {

    public static void main(String[] args){

        Endereco endereco = new Endereco();
        endereco.setRua("Rua da caida");
        endereco.setNumero(234);
        endereco.setBairro("Centro");
        endereco.setCidade("Folripa");

        System.out.println(endereco);

    }
}
