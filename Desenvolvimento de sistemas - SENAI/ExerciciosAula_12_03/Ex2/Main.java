package sample;

import sample.model.Conta;

public class Main {

    public static void main(String[] args){

        Conta conta1 = new Conta(5678, 23456);
        System.out.println(conta1);

        if(conta1.sacar(200)){
            System.out.println("Sacar R$: 200,00");
        }else {
            System.out.println("Não tem limite");
        }
        System.out.println(conta1);

        conta1.depositar(300);
        System.out.println(conta1);

        //conta1.depositar(300);
        //System.out.println(conta1);



    }

}
