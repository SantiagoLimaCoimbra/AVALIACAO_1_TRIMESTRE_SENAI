package sample.model;

public class Produto {
    //Atributos
    /*private String nome;
    private double preco;
    private int quantidade;*/

    public String nome;
    public double preco;
    public int quantidade;

    //Get e Set
    /*public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }*/



    public double ValorTotalEstoque(){
        return preco * quantidade;
    }

    public void AddProduto(int qtd){
        quantidade += qtd;
    }

    public void RemovProduto(int qtd){
        quantidade -= qtd;
    }

    @Override
    public String toString() {
        return "\nNome do Produto: " + nome +
                "; Preço: R$" + preco +
                "; Quantidade: " + quantidade +
                " Valor do estoque: R$" + ValorTotalEstoque();
    }
}
