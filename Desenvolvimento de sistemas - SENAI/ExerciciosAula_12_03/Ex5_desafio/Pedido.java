package sample.model;

import java.util.Date;

public class Pedido {

    //Atributos
    private String descricao;
    private String data;
    private double total;
    private ItensDoPedido itens;

    //Construtor
    public Pedido(){
        itens = new ItensDoPedido();
    }

    //Get e Set
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public double getTotal() {
        return total;
    }

    public void addProduto(String nomeProduto, double preco){
        itens.setProduto(nomeProduto, preco);
        total += preco;
    }

    //To String
    public String toString(){
        return "Prdidos =\n" + "Descrição: " + descricao + "; Data: " + data + "; "+ itens + "\nTotal: " + total;
    }

}
