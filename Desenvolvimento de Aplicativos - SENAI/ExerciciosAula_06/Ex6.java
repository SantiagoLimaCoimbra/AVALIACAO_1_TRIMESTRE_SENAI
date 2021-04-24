import java.util.Scanner;
class Main {
  //EXERCÍCIO 6 - Aula 06 
  public static void main(String[] args) {
    //Atributos
    int menorIdade = 100;
    int menorIdadeIgual = 0;
    //Array
    int []idades = {25,30,24,24,19,17,22,17,28,24};
    //Lógica
    for(int i=0; i<idades.length; i++){
      if(idades[i] < menorIdade){
        menorIdade = idades[i];
      }
    }
    for(int i=0; i<idades.length; i++){
      if(idades[i] == menorIdade){
        menorIdadeIgual ++;
      }
    }
    //print
    System.out.println("Menor idade: " + menorIdade);
    System.out.println("Quantodade de pessoas com a idade igual a meor idade: " + menorIdadeIgual);
  }
}