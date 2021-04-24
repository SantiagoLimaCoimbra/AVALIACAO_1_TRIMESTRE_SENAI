package sample;

import sample.model.Produto;
import sample.model.ProdutoImportado;
import sample.model.ProdutoUsado;

public class Main{


    public static void main(String[] args){

        Produto produto1 = new Produto("Paçoquita", 1.50);
        System.out.println(produto1.toString()+"\n");

        ProdutoImportado importado1 = new ProdutoImportado("Drone", 3400,500);
        System.out.println(importado1.toString()+"\n");

        ProdutoUsado usado1 = new ProdutoUsado("Máquina de lavar", 1200, "2010");
        System.out.println(usado1.toString()+"\n");
    }
}
