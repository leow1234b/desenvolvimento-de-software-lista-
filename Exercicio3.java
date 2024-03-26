public class Exercicio3 {
   public static void executar() {
    
   
    int tamanho = Prompt.lerInteiro("Digite o tamanho do vetor: ");
        
    
    int[] vetor1 = new int[tamanho];
    int[] vetor2 = new int[tamanho];
    
    
    for (int i = 0; i < tamanho; i++) {
        vetor1[i] = Prompt.lerInteiro("Digite o número da posição " + i + ": ");
    }   
    for (int i = 0; i < tamanho; i++) {
        vetor2[i] = vetor1[i] * 2;
        }
    
    
    
    Prompt.imprimir("Valores do segundo vetor (dobro):");
     for (int i = 0; i < tamanho; i++) {
        Prompt.imprimir(vetor2[i]);
    }
    }

}