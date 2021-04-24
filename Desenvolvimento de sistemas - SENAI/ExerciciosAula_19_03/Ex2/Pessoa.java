package sample.model;

public abstract class Pessoa {
    //Atributos
    private String nome;
    private Endereco endereco;

    //construtor
    public Pessoa(String nome){
        this.nome = nome;
        endereco = new Endereco();
    }

    public Pessoa(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return this.endereco;
    }

    //Sobrscrita
    public void setEndereco(String rua, int numero, String bairro, String cep){
        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setNumero(numero);
        endereco.setBairro(bairro);
        endereco.setCep(cep);
        this.endereco = endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    //to string
    @Override
    public String toString() {
        return "Nome= " + nome + "; \n" + endereco;
    }
}
