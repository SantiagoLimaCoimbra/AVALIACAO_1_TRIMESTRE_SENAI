package sample.model;

public class Caminhao extends Veiculo{
    //Atributos
    private int eixos;

    //Construtor da classe
    public Caminhao(String nome){
        super(nome);
        //this.eixos = eixos;
    }

    public Caminhao(String nome, String descricao){
        super(nome, descricao);
    }

    public Caminhao(String nome, String descricao, int eixos){
        super(nome, descricao);
        this.eixos = eixos;
    }

    //Get e Set
    public int getEixos() {
        return eixos;
    }

    public void setEixos(int eixos) {
        this.eixos = eixos;
    }

    //To String
    @Override
    public String toString() {
        return super.toString() + " Número de Eixos: " + eixos;
    }
}
