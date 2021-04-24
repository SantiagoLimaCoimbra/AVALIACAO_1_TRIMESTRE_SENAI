import java.util.Scanner;
class Main {

  //EXERCÍCIO 2 - Aula 06

  public static void divisao(){
    //atributos
    int a = 0;
    int b = 0;

    //logica
    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o primeiro numero");
    a = leitor.nextInt();

    System.out.println("Digite o segundo numero");
    b = leitor.nextInt();


    int divisao = a / b;

    System.out.println("Divisão: " + divisao);
  } 

  public static void main(String[] args) {
    //função
    divisao();

  }
}