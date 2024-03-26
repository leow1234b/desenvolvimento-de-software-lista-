public class Exercicio6 {
    public static void Executar(){
      
        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double peso1 = Prompt.lerDecimal("Digite o peso da primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double peso2 = Prompt.lerDecimal("Digite o peso da segunda nota: ");

        
        double mediaPonderada = (nota1 * peso1 + nota2 * peso2) / (peso1 + peso2);

    
        Prompt.imprimir("A média ponderada das notas é: " + mediaPonderada);
    }
}
    
