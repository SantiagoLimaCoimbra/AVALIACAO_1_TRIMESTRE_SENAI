package sample.model;

public class PessoaJuridica extends Pessoa {
    //Atributos
    private String cnpj;
    private String ie;

    //Construtor
    public PessoaJuridica (String nome){
        super(nome);
    }
    //Sobrecarga
    public PessoaJuridica(String nome, Endereco endereco){
        super(nome, endereco);
    }

    //get e set
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getIe() {
        return ie;
    }

    public void setIe(String ie) {
        this.ie = ie;
    }

    //to string
    @Override
    public String toString() {
        return super.toString() + "\nPessoa Juridica= " +
                "CNPJ: " + cnpj +
                "; IE: " + ie;
    }
}
