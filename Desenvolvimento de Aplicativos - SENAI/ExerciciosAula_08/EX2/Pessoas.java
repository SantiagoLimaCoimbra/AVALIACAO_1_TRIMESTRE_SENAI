package sample.model;

public class Pessoas {
    //Atributos
    public String nome;
    public int idade;

    //To String
    @Override
    public String toString() {
        return "Nome: " + nome +
                "; Idade: " + idade;
    }
}
