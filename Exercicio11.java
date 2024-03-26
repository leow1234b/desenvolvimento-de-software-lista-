public class Exercicio11 {
    public static void Executar(){

        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        int produtoEscalar = 0;

        
        for (int i = 0; i < 5; i++) {
            vetor1[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do primeiro vetor: ");
        }

        
        for (int i = 0; i < 5; i++) {
            vetor2[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º elemento do segundo vetor: ");
        }

        
        for (int i = 0; i < 5; i++) {
            produtoEscalar += vetor1[i] * vetor2[i];
        }

        
        Prompt.imprimir("O produto escalar entre os vetores é: " + produtoEscalar);
    }
}
    

