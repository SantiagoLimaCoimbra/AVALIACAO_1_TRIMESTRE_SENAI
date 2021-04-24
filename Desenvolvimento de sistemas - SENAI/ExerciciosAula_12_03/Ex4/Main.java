package sample;

import sample.model.Pessoa;

public class Main {

    public static void main(String[] args){

        Pessoa pessoa = new Pessoa("Joan");
        pessoa.setContato("66-6666-6666", "joan@gmail.com", "@JoanGamer123");

        Pessoa pessoa2 = new Pessoa("Jubileu");
        pessoa2.setContato("99-9999-9999", "jubileu@gmail.com", "@JUB1LEUdaROSA");

        System.out.println(pessoa);
        System.out.println(pessoa2);

    }
}
