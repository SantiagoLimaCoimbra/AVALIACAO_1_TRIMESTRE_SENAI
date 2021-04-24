import java.util.Scanner;
class Main {

  //EXERCÍCIO 3 - Aula 06 

  public static void main(String[] args) {
    //função
    imprimirDE1_100();;
  }

  public static void imprimirDE1_100(){
    for(int i=1; i<= 100; i++){
      System.out.print(i + " ");
    }
    System.out.println("\n");
    imprimirDE101_200();
  }

  public static void imprimirDE101_200(){
    for(int i=101; i<= 200; i++){
      System.out.print(i + " ");
    }
    System.out.println("\n");
    imprimirDE201_300();
  }

  public static void imprimirDE201_300(){
    for(int i=201; i<= 300; i++){
      System.out.print(i + " ");
    }
  }

}