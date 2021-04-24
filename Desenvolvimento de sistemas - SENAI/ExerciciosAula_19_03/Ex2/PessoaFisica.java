package sample.model;

public final class PessoaFisica extends Pessoa {
    //atributos
    private String cpf;
    private String rg;

    //construtor
    public PessoaFisica(String nome){
        super(nome);
    }

     //CONSTRUTOR
    public PessoaFisica(String nome, Endereco endereco){
        super(nome, endereco);
    }

    //get e set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    //to string
    //@Override
    /*public String toString() {
        return super.toString() + "\nPessoa Fisica= " +
                "CPF: " + cpf +
                "; RG: " + rg;
    }*/
    @Override
    public String toString() {
        return "Nome: " + getNome()
                + " CPF: " + cpf
                + " RG: " + rg
                + "\n" + getEndereco();
    }
}
