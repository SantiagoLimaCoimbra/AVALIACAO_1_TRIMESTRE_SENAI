package sample.model;

public class Cliente extends Pessoa{
    //Atributos
    private String dataCadastro;

    //Construtor
    public Cliente(String nome){
        super(nome);
    }

    //Sobrecarga
    public Cliente(String nome, String sobrenome, String email, String telefone){
        super(nome, sobrenome, email, telefone);
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nData do Cadastro: " + dataCadastro;
    }
}
