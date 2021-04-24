package sample;

import sample.model.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setDataNascimento("08/08/2003");
        pessoa.setNome("Sant");

        System.out.println(pessoa);
    }
}
