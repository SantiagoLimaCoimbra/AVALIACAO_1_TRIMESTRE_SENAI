package sample.model;

public class Funcionario extends Pessoa {
    //Atributos
    private String funcao;
    private Double salario;

    //Construtor
    public Funcionario(String nome){
        super(nome);
    }

    //Sobrecarga
    public Funcionario(String nome, String sobrenome, String email, String telefone){
        super(nome, sobrenome, email, telefone);
    }

    //Get e Set
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(double valorHora, double qtdeHora) {
        salario = valorHora * qtdeHora;
    }


    //To String
    @Override
    public String toString() {
        return super.toString() + "\nFunçao: " + funcao +
                "; Salario: " + salario;
    }
}
