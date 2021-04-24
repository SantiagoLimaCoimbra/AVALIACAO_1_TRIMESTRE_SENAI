package sample.model;

public class Produto {

    //Atributos
    String nome;
    double preco;

    //Metodos getters and setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return this.preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    //Concatenacao
    public String toString(){
        return "Produto: " + nome + ", Preço: " + preco + "\n";
    }

}
