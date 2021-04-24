package sample.model;

public class Endereco {

    //atributos
    private String rua;
    private String bairro;
    private int numero;
    private String cidade;


    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    //Concatenacao
    @Override
    public String toString() {
        return "Endereco - \n" +
                "Rua: " + rua +
                "; Bairro: " + bairro +
                "; Numero: " + numero +
                "; Cidade: " + cidade;
    }
}
