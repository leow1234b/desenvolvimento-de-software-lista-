public class Exercicio9 {
   public static void Executar(){
    int tamanho = 5;
    int[] A = new int[tamanho];
    int[] B = new int[tamanho];
    int[] C = new int[tamanho];

    
    for (int i = 0; i < tamanho; i++) {
        A[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do vetor A: ");
    }

    
    for (int i = 0; i < tamanho; i++) {
        B[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do vetor B: ");
    }


    for (int i = 0; i < tamanho; i++) {
        if (i % 2 == 0) { 
            C[i] = A[i];
        } else { 
            C[i] = B[i];
        }
    }

    
    Prompt.imprimir("Vetor C (elementos pares de A e ímpares de B): ");
    for (int i = 0; i < tamanho; i++) {
        Prompt.imprimir(C[i] + " ");
    }
   } 
}
