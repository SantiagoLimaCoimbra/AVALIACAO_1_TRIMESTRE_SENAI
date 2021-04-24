package sample.model;

public class Pessoa {
    //Atributos
    private String nome;
    private String sobrenome;
    private String email;
    private String telefone;

    //Construtor
    public Pessoa(){}

    //Sobrecarga
    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String sobrenome){
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public Pessoa(String nome, String sobrenome, String email, String telefone){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.email = email;
        this.telefone = telefone;
    }


    //Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    //To String
    @Override
    public String toString() {
        return "Nome:" + nome + " " + sobrenome +
                "; E-mail: " + email +
                "; Telefone: " + telefone;
    }
}
