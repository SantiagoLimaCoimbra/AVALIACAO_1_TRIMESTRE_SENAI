package sample;

import sample.model.Receita;

public class Main {

    public static void main(String[] args){
        Receita receita = new Receita();
        receita.setNome("Bolo do Sant");
        receita.setDescricao("Não foi ele que fez");
        receita.setIngredientes("Farinha",300,"kg");
        receita.setIngredientes("Outros",200,"Kg");

        System.out.println(receita);
    }
}
