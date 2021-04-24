package sample.model;

public class Pessoa {

    //atributos
    private String nome;
    private String dataNascimento;

    //Get e Set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    //Concatenacao
    @Override
    public String toString() {
        return "Pessoa -\n" +
                "Nome: " + nome +
                "; Data de Nascimento: " + dataNascimento;
    }
}
