package sample.model;

public class Pessoa {

    //Atributos
    private String nome;
    private Contato contato;

    public Pessoa(String nome){
        this.nome = nome;
        contato = new Contato();
    }


    //get e set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(String zapzap, String email, String twitter) {
        contato.setZapzap(zapzap);
        contato.setTwitter(twitter);
        contato.setEmail(email);
    }

    //To String
    @Override
    public String toString() {
        return "Nome: " + this.nome + ", " + contato;
    }
}
