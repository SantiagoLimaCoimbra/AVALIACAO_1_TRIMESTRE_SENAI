package sample.model;

public class Pessoa {

    //atributos
    private String nome;
    private String dataNascimento;
    private Endereco endereco;


    //get set
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


    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }


    //to string
    @Override
    public String toString() {
        return "nome: " + nome +
                "; Data de Nascimento: " + dataNascimento + " " + endereco;
    }
}
