package sample.model;

public final class Carro extends Veiculo{
    //Atributos
    private int portas;

    //Construtor da classe
    public Carro(String nome){
        super(nome);
        //this.portas = portas;
    }

    public Carro(String nome, String descricao){
        super(nome, descricao);
    }

    public Carro(String nome, String descricao, int portas){
        super(nome, descricao);
        this.portas = portas;
    }

    //Get e Set
    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    //To String
    @Override
    public String toString() {
        return super.toString() + "Numero de portas: " + portas;
    }
}
