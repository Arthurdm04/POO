/*Escreva um aplicativo que insere um número consistindo em cinco dígitos do usuário, separa o número em seus
dígitos individuais e imprime os dígitos separados uns dos outros por três espaços cada. Por exemplo, se o
usuário digitar o número 42339, o programa deve imprimir:
4 2 3 3 9. */

import java.util.Scanner;

public class ex02 
    {
    public static void main(String[] args) {
        int num, dig1, dig2, dig3, dig4, dig5;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número com cinco dígitos: ");
        num = entrada.nextInt();

        // Fiz um if para que o número que o usuário digitar seja de 5 digitos
        if (num >= 10000 && num <= 99999) {
            // Pega o numero digitado e vai fazendo por "partes" cada número para poder printar, envolvendo divisão e módulos
            dig1 = num / 10000; // exemplo: se o numero for 42339, aqui ele vai ser divido por 1000, resultando o 4, como numero inteiro
            dig2 = (num / 1000) % 10; 
            dig3 = (num / 100) % 10;
            dig4 = (num / 10) % 10;
            dig5 = num % 10;

            
            System.out.printf("%d   %d   %d   %d   %d%n", dig1, dig2, dig3, dig4, dig5);
        } else {
            System.out.println("Você deve digitar um número com 5 dígitos");
        }

    }
}
