public class Exercicio7 {
   public static void executar(){

   
    int tamanho = 5; 
        int[] vetor1 = new int[tamanho]; 
        int[] vetor2 = new int[tamanho]; 

        
        for (int i = 0; i < tamanho; i++) {
            vetor1[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do primeiro vetor: ");
        }

        
        for (int i = 0; i < tamanho; i++) {
            vetor2[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do segundo vetor: ");
        }

        
        boolean iguais = true;
        for (int i = 0; i < tamanho; i++) {
            if (vetor1[i] != vetor2[i]) {
                iguais = false;
                break;
            }
        }

        
        if (iguais) {
            Prompt.imprimir("Os vetores são iguais.");
        } else {
            Prompt.imprimir("Os vetores são diferentes.");
        }
}
}