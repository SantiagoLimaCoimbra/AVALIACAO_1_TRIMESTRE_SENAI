package sample;

import sample.model.Caminhao;
import sample.model.Carro;

public class Main {

    public static void main(String[] args){
	
	//Abaixo é possivel ver objetos criados de diferentes formas
	//atravéz de polimorfismo.

        Carro carro = new Carro("Fiesta");
        carro.setMarca("Ford", " Esta empresa é Estadunodense.");
        carro.setPortas(4);
        System.out.println(carro);

        Carro carro2 = new Carro("Palho");
        carro2.setMarca("Fiat", " Esta empresa é Italiana.");
        carro2.setPortas(2);
        System.out.println(carro2);

        Caminhao caminhao = new Caminhao("S460");
        caminhao.setMarca("Scania", " Esta empresa é Sueca.");
        caminhao.setEixos(6);
        System.out.println(caminhao);

        Caminhao caminhao2 = new Caminhao("Volvo FH");
        caminhao2.setMarca("Volvo", " Esta empresa é Sueca.");
        caminhao2.setEixos(9);
        System.out.println(caminhao2);

        Carro carro3 = new Carro("Cadete", "Carro caindo aos pedaços", 2);
        carro3.setMarca("Chevrolet", "Marca de carro veio");
        System.out.println(carro3);

        Caminhao caminhao3 = new Caminhao("F600", "Caminão veio de frete", 4);
        caminhao3.setMarca("Ford", "Marca da fábrica que saiu do Brasil");
        System.out.println(caminhao3);
    }

}
