package sample.model;

public class Pessoa {
    //Atributos
    private String nome;

    //Construtor
    public Pessoa(){}

    //Sobrecarga
    public Pessoa(String nome){
        this.nome = nome;
    }

    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //To String
    @Override
    public String toString() {
        return "Nome: " + nome;
    }
}
