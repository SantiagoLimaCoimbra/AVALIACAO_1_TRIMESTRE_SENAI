class Main {
  //EXERCÍCIO 8 - Aula 06 
  public static void main(String[] args) {
    //Atributos
    int j = 0;
    //Array
    int []vetA = {45, 8, 20, 13, 15, 9, 10, 8, 51, 14};
    int []vetB = new int [5];
    int []vetC = new int [5];

    //Lógica
    for ( int i = 0; i < vetA.length; i ++) {
      if(i %2 == 0){
        vetB[j] = vetA[i];
        j++;
      }
    }
    for( int i = 0; i < vetC.length; i++) {
      vetC[i] = vetA[i] + vetB[i];
    }
    
    //print
    System.out.println("\nVetor A: ");
    for(int i=0; i<vetA.length; i++){
      System.out.print(vetA[i] + " ");
    }
    System.out.println("\nVetor B: ");
    for(int i=0; i<5; i++){
      System.out.print(vetB[i] + " ");
    }
    System.out.println("\nVetor C: ");
    for(int i=0; i<5; i++){
      System.out.print(vetC[i] + " ");
    }
  }
}