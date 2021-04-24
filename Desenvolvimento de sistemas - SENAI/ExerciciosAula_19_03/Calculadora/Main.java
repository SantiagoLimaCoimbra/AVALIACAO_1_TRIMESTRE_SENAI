package sample;

import sample.model.Calcular;

public class Main {

    public static void main(String[] args) {
        //soma
        Calcular soma1 = new Calcular();
        soma1.somar(2,2,4);
        System.out.println("SOMA 1: " + soma1);

        Calcular soma2 = new Calcular();
        soma2.somar(3,3);
        System.out.println("\nSOMA 2: " + soma2);

        //subtração
        Calcular subtrair1 = new Calcular();
        subtrair1.subitrair(10,5);
        System.out.println("\nSUBTRAÇÃO 1: " + subtrair1);

        Calcular subtrair2 = new Calcular();
        subtrair2.subitrair(20,5,7);
        System.out.println("\nSUBTRAÇÃO 2: " + subtrair2);

        //mutiplicação
        Calcular mutip1 = new Calcular();
        mutip1.mutiplicar(8,8);
        System.out.println("\nMUTIPLICAÇÃO 1: " + mutip1);

        Calcular mutip2 = new Calcular();
        mutip2.mutiplicar(8,8,8);
        System.out.println("\nMUTIPLICAÇÃO 2: " + mutip2);

        //divisão
        Calcular div1 = new Calcular();
        div1.dividir(15,3);
        System.out.println("\nDIVISÃO 1: " + div1);

        Calcular div2 = new Calcular();
        div2.dividir(300,40,3);
        System.out.println("\nDIVISÃO 2: " + div2);
    }
}
