package sample;

import sample.model.Cliente;

public class MainCliente {

    public static void main(String [] args){
        Cliente cliente = new Cliente();

        cliente.setNome("Joao");
        cliente.setEmail("Joao@email.com");
        cliente.setTelefone("48-95438946");
        cliente.setIdade(30);

        System.out.println(cliente);

    }

}
