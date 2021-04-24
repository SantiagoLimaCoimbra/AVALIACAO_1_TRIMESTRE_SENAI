package sample;

import sample.model.Pessoas;

public class Main{

    public static void main(String[] args){

        Pessoas pessoa1 = new Pessoas();
        pessoa1.nome = "Santiago";
        pessoa1.idade = 17;
        System.out.println(pessoa1);

        Pessoas pessoa2 = new Pessoas();
        pessoa2.nome = "Jubileu";
        pessoa2.idade = 20;
        System.out.println(pessoa2);

        if(pessoa1.idade > pessoa2.idade){
            System.out.println("\nPessoa mais velha: "+ pessoa1.nome);
        }else{
            System.out.println("\nPessoa mais velha: "+ pessoa2.nome);
        }

    }
}
