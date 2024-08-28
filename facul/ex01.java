/*Escreva um aplicativo que solicita ao usuário inserir dois inteiros, obtém do usuário esses números e imprime
sua soma, produto, diferença e divisão */

import java.util.Scanner;


public class ex01 
{
   public static void main(String[] args)
     {
        int num1, num2; 

        //fazendo o Scanner
        Scanner entrada = new Scanner(System.in);

        // digitar o primeiro número 
        System.out.println("Digite um numero inteiro: "); 
        num1 = entrada.nextInt();

        // digitar o segundo número 
        System.out.println("Digite outro numero inteiro: ");
        num2 = entrada.nextInt();

        // fazendo as conversões para soma, produto, diferença e divisão
        int soma = num1 + num2;
        int produto = num1*num2;
        int diferenca = num1 - num2;
        int divisao = num1/num2;

        //printando os resultados
        System.out.println("Sua soma deu: "+ soma);
        System.out.println("Seu produto deu: "+ produto);
        System.out.println("Sua diferenca deu: "+diferenca);
        System.out.println("Sua divisao deu: "+divisao);

     }
    
}
