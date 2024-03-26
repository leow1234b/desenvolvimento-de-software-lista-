public class Exercicio1 {     
    public static void Executar(){
    
    int[] vetor = new int[5];
    int i = 0;
    int a = 0;
    int c = 0;
    double soma = 0;
    double media = 0;
    while(i < 5){
        vetor[i] = Prompt.lerInteiro("digite o vetor");
    i++;
    }
    for(a=0; a < 5; a++){
       
         soma = vetor[a] + soma;
    
    }
    media = soma / 5;
    Prompt.imprimir("A média "+ media);
    for(c=0; c < 5; c++){
    
      if(vetor[c] < media){
        Prompt.imprimir("valor menor que a media "+ vetor[c]);
       }
       if(media == vetor[c]) {
        Prompt.imprimir("valor igual a media "+ vetor[c]);
       }
       if(vetor[c] > media){
        Prompt.imprimir("valor maior que a media "+ vetor[c]);
       }
   
   }
    
}
    
}