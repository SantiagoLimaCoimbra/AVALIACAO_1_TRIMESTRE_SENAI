package sample;

import sample.model.Cliente;
import sample.model.Conta;

public class MainCliente {

    public static void main(String[] args){
        Conta conta = new Conta(1234, 4566);
        conta.depositar(3000);

        Cliente cliente = new Cliente();
        cliente.setConta(conta);
        cliente.setNome("Sant");
        cliente.setCpf("432.123.123.43");

        System.out.println(cliente);

        //Novo objeto
        Conta conta2 = new Conta(3333, 7777);

        Cliente cliente2 = new Cliente();
        cliente2.setConta(conta2);
        cliente2.setNome("Jubileu");
        cliente2.setCpf("2222.3333.44");

        conta2.depositar(2000);
        System.out.println(cliente2);
        
        conta2.depositar(2000);
        System.out.println(cliente2);

        conta2.sacar(3000);
        System.out.println(cliente2);
    }

}
