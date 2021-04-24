class Main {
  //EXERCÍCIO 9 - Aula 06 
  public static void main(String[] args) {
    //Atributos
    int j = 0;
    //Array
    int []vetA = {10, 8, 20, 13, 15};
    int []vetB = {5, 5, 10, 8, 20};
    int []vetC = new int [5];

    //Lógica
    for( int i = 0; i < vetC.length; i++) {
      vetC[i] = vetA[i] - vetB[i];
    }

    //print
    System.out.println("\nVetor A: ");
    for(int i=0; i<vetA.length; i++){
      System.out.print(vetA[i] + " ");
    }
    System.out.println("\nVetor B: ");
    for(int i=0; i<vetB.length; i++){
      System.out.print(vetB[i] + " ");
    }
    System.out.println("\nVetor C: ");
    for(int i=0; i<vetC.length; i++){
      System.out.print(vetC[i] + " ");
    }
  }
}