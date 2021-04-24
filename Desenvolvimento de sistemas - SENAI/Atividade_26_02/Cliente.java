package sample.model;

// Classe Cliente
public class Cliente {

    //Atributos
    String nome;
    String email;
    String telefone;
    int idade;


    //Metodos getters and setters
    public String getNome(){ return this.nome; }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return this.email;
    }

    public void  setEmail(String email){ this.email = email; }

    public String getTelefone(){
        return this.telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    //Concatenacao
    public String toString(){
        return "Cliente: " + nome + ", Email: " + email + ", Telefone: " + telefone + ", Idade: " + idade;
    }

}
