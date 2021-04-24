package sample;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        System.out.println("EXERCÍCIO 1");

        //VARIAVEIS
        double nota1 = 6.7;
        double nota2 = 5.3;

        double media = (nota1 + nota2) / 2;

        //ESRUTURAS DE CONTROLE E PRINTS
        if(media >= 7) {
            System.out.println("Sua média é: " + media + ". Você passou.");
        } else {
            System.out.println("Sua média é: " + media + ". Você está de recuperação.");

            //NOVAS VARIAVEIS
            double recuperacao = 8.5;
            double mediaRec = (media + recuperacao) / 2;

            //CONCATENAÇÃO
            System.out.println("MEDIArec: " + mediaRec);

            //ESRUTURAS DE CONTROLE E PRINTS
            if(mediaRec >= 7) {
                System.out.println("Sua média final é: " + mediaRec + " Você passou com recuperação.");
            } else {
                System.out.println("Sua média final é: " + mediaRec + " Você reprovou.");
            }
        }
        //System.out.println("Cabo o código aqui!");
    }
}


class Main {
    public static void main(String args[]) {
        System.out.println("EXERCÍCIO 2");

        //VARIAVEL
        int idade = 22;

        //ESRUTURAS DE CONTROLE E PRINTS
        if (idade <= 10) {
            System.out.println("A idade: " + idade + " está na categoria infantil.");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("A idade: " + idade + " está na categoria infanto juvenil.");
        } else if (idade >= 14 && idade <= 18) {
            System.out.println("A idade: " + idade + " está na categoria juvenil.");
        } else {
            System.out.println("A idade: " + idade + " está na categoria adulto.");
        }
    }
}


//import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        System.out.println("EXERCÍCIO 3\n\n");

        System.out.println("CÓDIGO: ; PRODUTO: ; PREÇO: \n" +
                "1; Cachorro Quente ; R$: 4,00\n" +
                "2;    X-Salada     ; R$: 4,50\n" +
                "3;    X-Bacon      ; R$: 5,00\n" +
                "4; Torrada Simples ; R$: 2,00\n" +
                "5;  Refrigerante   ; R$: 1,50\n");

        //Variáveis
        double cod1 = 4.00;
        double cod2 = 4.50;
        double cod3 = 5.00;
        double cod4 = 2.00;
        double cod5 = 1.50;

        double produto = 0;
        int codigo;
        double quantidade;
        double valor;

        //lógica
        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe o código do produto.");
        codigo = leitor.nextInt();

        if(codigo == 1){
            produto = cod1;
        }else if(codigo == 2){
            produto = cod2;
        }else if(codigo == 3){
            produto = cod3;
        }else if(codigo == 4){
            produto = cod4;
        }else if(codigo == 5){
            produto = cod5;
        }else{
            System.out.println("Código não identificado.");
        }
        //System.out.println(produto);

        System.out.println("Informe a quantidade do produto.");
        quantidade = leitor.nextDouble();
        valor = (produto * quantidade);
        System.out.println("O valor a pagar pela compra será de: R$" + valor);

    }
}


//import java.util.Scanner;
class Main {
    public static void main(String args[]) {
        System.out.println("EXERCÍCIO 5\n\n");

        //Variáveis
        int i = -5;
        int n = 0;
        double valPST = 0; //Valor positivo
        double valNGT = 0; //Valor negativo


        //Laço positivo
        System.out.println("POSITIVO");
        while(i < 90){
            i = i + 10;
            valPST += i;
            System.out.println("Indice pst " + i);
        }

        //Laço negativo
        System.out.println("\n\nNEGATIVO");
        while(n > -100){
            n = n - 10;
            valNGT += n;
            System.out.println("Indice ngt " + n);
        }

        System.out.println("\n\nValor acomulado positivo: " + valPST);
        System.out.println("Valor acomulado negativo: " + valNGT);

        System.out.println("\nValor final da soma é igual a: " + (valPST + valNGT));

    }
}
