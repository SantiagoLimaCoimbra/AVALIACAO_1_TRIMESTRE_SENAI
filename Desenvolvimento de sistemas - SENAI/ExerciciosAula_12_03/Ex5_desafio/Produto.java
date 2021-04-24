package sample.model;

public class Produto {

    //Atributos
    private String nome;
    private double preco;

    //Get e Set
    public String getNome() {
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

    //To String
    @Override
    public String toString() {
        return "Produto: " + nome +
                "; Preço R$" + preco;
    }
}
