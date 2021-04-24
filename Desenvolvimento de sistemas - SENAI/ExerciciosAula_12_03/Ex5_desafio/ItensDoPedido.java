package sample.model;

import java.util.ArrayList;
import java.util.List;

public class ItensDoPedido {

    //Atributos
    private List<Produto> produtos;


    //Get e Set
    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProduto(String nomeProduto, double preco) {

        if(this.produtos == null){
            this.produtos = new ArrayList<>();
        }

        Produto produto = new Produto();
        produto.setNome(nomeProduto);
        produto.setPreco(preco);
        this.produtos.add(produto);
    }

    //To String
    @Override
    public String toString() {
        return produtos.toString();
    }
}
