public class Exercicio15 {
   public static void Executar(){
    int tamanho = 5;
    int[] vetor = new int[tamanho];

    
    vetor[0] = Prompt.lerInteiro("Digite o 1º número: ");

    
    int anterior = vetor[0];
    int indice = 1; 
    while (indice < tamanho) {
        int numero = Prompt.lerInteiro("Digite o " + (indice + 1) + "º número: ");
        if (numero > anterior) {
            vetor[indice] = numero;
            anterior = numero; 
            indice++; 
        } else {
            break; 
        }
    }

    
    Prompt.imprimir("Vetor preenchido seguindo a regra:\n");
    for (int i = 0; i < indice; i++) {
        Prompt.imprimir(vetor[i] + " ");
    }
}
}
