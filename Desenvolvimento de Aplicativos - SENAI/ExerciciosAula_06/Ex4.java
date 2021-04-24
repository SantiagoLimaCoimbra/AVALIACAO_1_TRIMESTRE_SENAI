class Main {

  //EXERCÍCIO 4 - Aula 06 

  public static void main(String[] args) {
    
    //Array
    int []vetor1 = {2, 4, 6, 8, 10};
    int []vetor2 = {1, 3, 5, 7, 9};
    int []soma = new int [5];

    //Logica
    for(int i=0; i<5; i++){
      soma[i] = vetor1[i] + vetor2[i];
    }

    //print
    System.out.println("\nVetor 1: ");
    for(int i=0; i<5; i++){
      System.out.print(vetor1[i] + " ");
    }
    
    System.out.println("\nVetor 2: ");
    for(int i=0; i<5; i++){
      System.out.print(vetor2[i] + " ");
    }
    
    System.out.println("\nResultado da soma: ");
    for(int i=0; i<5; i++){
      System.out.print(soma[i] + " ");
    }
    
  }

}