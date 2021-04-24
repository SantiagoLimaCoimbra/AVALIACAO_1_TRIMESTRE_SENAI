package sample;

import sample.model.Produto;

public class Main{

    public static void main(String[] args){

        Produto produto1 = new Produto();
        produto1.nome = "Sabonete";
        produto1.preco = 1.50;
        produto1.quantidade = 15;
        System.out.println(produto1.toString());

        produto1.RemovProduto(10);
        System.out.println(produto1.toString());

        produto1.AddProduto(20);
        System.out.println(produto1.toString());
    }
}
