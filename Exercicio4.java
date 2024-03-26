public class Exercicio4 {
  public static void executar(){

  
    int tamanho = 5; 
    int[] numeros = new int[tamanho]; 
    int n; 


    for (int i = 0; i < tamanho; i++) {
        numeros[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número: ");
    }

    
    n = Prompt.lerInteiro("Digite um número para comparar com os elementos do vetor: ");

    
    Prompt.lerInteiro("Índices dos elementos inferiores a " + n + ":");
    for (int i = 0; i < tamanho; i++) {
        if (numeros[i] < n) {
            Prompt.imprimir(i);
        }
    }
}
}