public class Exercicio5 {
    public static void Executar(){
        int tamanho = 5; 
        int[] numeros = new int[tamanho]; 
        int n; 
        int contador = 0; 

    
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = Prompt.lerInteiro("Digite o " + (i + 1) + "º número: ");
        }

        
        n = Prompt.lerInteiro("Digite um número para buscar no vetor: ");

        
        for (int i = 0; i < tamanho; i++) {
            if (numeros[i] == n) {
                contador++;
            }
        }

        
        Prompt.imprimir("O número " + n + " aparece " + contador + " vez(es) no vetor.");
    }


    }

