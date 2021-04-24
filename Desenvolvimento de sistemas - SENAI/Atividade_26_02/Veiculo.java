package sample.model;

// Classe Veículo
public class Veiculo {

    //atributos
    int velocidade;
    String placa;

    //Construtor
    public Veiculo(String placa){
        this.placa = placa;
        velocidade = 0;
    }

    //metodos
    public String consultarPlaca(){ return this.placa; }

    public int acelerar(int valor){ return this.velocidade += valor; }

    public int frear (int valor){
        if (this.velocidade > 0){
            this.velocidade -= valor;
            if(this.velocidade < 0){ this.velocidade = 0;}

            return this.velocidade;
        } return this.velocidade;
    }

    public int consultarVelocidade(){
        return this.velocidade;
    }

}
