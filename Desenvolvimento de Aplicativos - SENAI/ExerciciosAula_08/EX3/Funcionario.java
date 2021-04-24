package sample.model;

public class Funcionario {
    //Atributos
    public String nome;
    public double salario;

    //To String
    @Override
    public String toString() {
        return "Nome: " + nome +
                ";  Salario: " + salario;
    }
}
