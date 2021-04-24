package sample.model;

public class Marca {
    //Atributos
    private String nome;
    private String descricao;

    //get e set
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
        return " Marca: " + nome
                + ((descricao == null) ? "" : descricao + "\n");
    }
}
