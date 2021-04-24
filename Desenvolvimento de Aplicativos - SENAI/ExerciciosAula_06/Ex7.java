import java.util.Scanner;
class Main {
  //EXERCÍCIO 7 - Aula 06 
  public static void main(String[] args) {
    //Atributos
    int acertos = 0;
    //Array
    char []G = {'a', 'b', 'c', 'd', 'a', 'b', 'c', 'd', 'a', 'b'};
    char []R = {'a', 'c', 'c', 'a', 'a', 'b', 'b', 'd', 'a', 'a'};
    //Lógica
    for ( int i = 0; i < G.length; i ++) {
      if(G[i] != R[i]) {
        System.out.println("Errou a questão: " + (i + 1));
      } else {
        acertos ++;
      }
    }
    //print
    if(acertos >= 6) {
      System.out.println("Aprovado com: " + acertos + " acertos!");
    } else {
      System.out.println("Reprovado com: " + acertos + " acertos!");
    }
  }
}