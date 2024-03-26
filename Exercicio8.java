public class Exercicio8 {
    public static void Executar(){
        int tamanho = 5;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];
        int[] C = new int[tamanho * 2]; 

        
        for (int i = 0; i < tamanho; i++) {
            A[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do vetor A: ");
        }


        for (int i = 0; i < tamanho; i++) {
            B[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do vetor B: ");
        }

        
        for (int i = 0; i < tamanho; i++) {
            C[i] = A[i];
        }

        
        for (int i = 0; i < tamanho; i++) {
            C[tamanho + i] = B[i];
        }

        
        Prompt.imprimir("Vetor C (concatenação de A e B): ");
        for (int i = 0; i < tamanho * 2; i++) {
            Prompt.imprimir(C[i] + " ");
        }
    }
}
