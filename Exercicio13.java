public class Exercicio13 {
   public static void Executar(){
    int n = Prompt.lerInteiro("Digite o número de termos da sequência de Fibonacci que deseja gerar: ");

        int[] fibonacci = new int[n];

        
        if (n >= 1) {
            fibonacci[0] = 1;
        }
        if (n >= 2) {
            fibonacci[1] = 1;
        }

        
        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

    
        Prompt.imprimir("Os " + n + " primeiros termos da sequência de Fibonacci são: ");
        for (int i = 0; i < n; i++) {
            Prompt.imprimir(fibonacci[i] + " ");
        }
    }
}    

