public class Exercicio2 {
    public static void executar() {
        int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        
    
        int[] vetor = new int[tamanho];
        
        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o número da posição " + i + ": ");
        }
        
        
        for (int i = 0; i < tamanho; i++) {
            int numero = vetor[i];
            String tipo = "zero";
        
            if (numero > 0) {
                tipo = "positivo";
            } else if (numero < 0) {
                tipo = "negativo";
            }
            Prompt.imprimir("O número da posição " + i + " é " + tipo);
        }
    }
}

