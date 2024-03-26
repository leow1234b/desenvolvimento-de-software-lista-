public class Exercicio14 {
    public static void Executar(){
        int tamanho = 5;
        int[] vetor = new int[tamanho];

        
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do vetor: ");
        }

    
        int indiceMaior = 0;
        for (int i = 1; i < tamanho; i++) {
            if (vetor[i] > vetor[indiceMaior]) {
                indiceMaior = i;
            }
        }

        
        int temp = vetor[tamanho - 1];
        vetor[tamanho - 1] = vetor[indiceMaior];
        vetor[indiceMaior] = temp;

        
        Prompt.imprimir("Vetor atualizado com o maior elemento na última posição: ");
        for (int i = 0; i < tamanho; i++) {
            Prompt.imprimir(vetor[i] + " ");
        }
    }
}
    

