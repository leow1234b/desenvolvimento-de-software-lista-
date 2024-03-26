public class Exercicio10 {
    public static void executar() {
        int tamanho = 5;
        int[] A = new int[tamanho];
        int[] B = new int[tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            A[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do vetor A: ");
        }

        
        for (int i = 0; i < tamanho; i++) {
            B[i] = A[tamanho - 1 - i];
        }

        
        Prompt.imprimir("Vetor B (elementos de A invertidos): ");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir(B[i] + " ");
        }
}
}