import java.util.Scanner;
class Main {

  //EXERCÍCIO 5 - Aula 06 

  public static void main(String[] args) {

    //Array
    int []valorUsuario = new int [5];
    int []valorInvertido = new int [5];

    //Input
    Scanner leitor = new Scanner(System.in);
    
    System.out.println("Digite o primeiro valor:");
    valorUsuario[0] = leitor.nextInt();

    System.out.println("Digite o Segundo valor:");
    valorUsuario[1] = leitor.nextInt();

    System.out.println("Digite o terceiro valor:");
    valorUsuario[2] = leitor.nextInt();

    System.out.println("Digite o quarto valor:");
    valorUsuario[3] = leitor.nextInt();

    System.out.println("Digite o quinto valor:");
    valorUsuario[4] = leitor.nextInt();

    //Lógica
    for (int i = 0, j=4; i<5; i++, j--){
      valorInvertido[i] = valorUsuario[j];
    }

    //print
    System.out.println("\nUsuário: ");
    for(int i=0; i<5; i++){
      System.out.print(valorUsuario[i] + " ");
    }

    System.out.println("\nInverção: ");
    for(int i=0; i<5; i++){
      System.out.print(valorInvertido[i] + " ");
    }

  }

}