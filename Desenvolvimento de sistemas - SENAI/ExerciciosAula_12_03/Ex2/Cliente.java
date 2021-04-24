package sample.model;

public class Cliente {
    //Atributos
    private String nome;
    private String cpf;
    private Conta conta;


    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }


    //To String
    @Override
    public String toString() {
        return "Cliente= " +
                "Nome: " + nome +
                "; CPF: " + cpf +
                "; Conta: " + conta;
    }
}
