package sample.model;

import java.util.ArrayList;
import java.util.List;

public class Receita {

    //atributos
    private String nome;
    private String descricao;
    private List<Ingrediente> ingredientes;

    //Construtor
    public Receita(){
        ingredientes = new ArrayList<>();
    }

    //getters e setters
    public List<Ingrediente> getIngredientes(){
        return ingredientes;
    }
    public void setIngredientes(String nome, double qtde, String um){
        Ingrediente ingrediente = new Ingrediente();
        ingrediente.setNome(nome);
        ingrediente.setQtde(qtde);
        ingrediente.setUm(um);
        ingredientes.add(ingrediente);
    }
    public void setIngredientes(Ingrediente ingrediente){
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //To String
    @Override
    public String toString() {
        return "Receita: " +
                "Nome= " + nome +
                ", Descricao= " + descricao +
                ", Ingredientes= " + ingredientes;
    }
}
