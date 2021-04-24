package sample;

import sample.model.Produto;

import java.util.ArrayList;

public class MainProduto {

    public static void main(String [] args){

        //lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();

        //produto1
        Produto produto = new Produto();
        produto.setNome("Batata");
        produto.setPreco(2.30);

        //produto2
        Produto produto2 = new Produto();
        produto2.setNome("Cenoura");
        produto2.setPreco(1.90);

        //produto3
        Produto produto3 = new Produto();
        produto3.setNome("Abobrinha");
        produto3.setPreco(2.00);

        //Add produtos
        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);

        System.out.println(produtos);

    }

}
