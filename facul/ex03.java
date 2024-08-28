/*Escreva um aplicativo que receba a, b e c, coeficientes de uma equação do segundo grau, e calcule as raízes x’ e
x” através da fórmula de Báskara */
import java.util.Scanner;


public class ex03
 {
    public static void main(String[] args) 
    {
        float a, b, c;
        double delta, x1, x2;

        Scanner entrada = new Scanner(System.in);

        //colcoando os valores de A, B e C
        System.out.println("Digite o valor de A: ");
        a = entrada.nextFloat();    

        System.out.println("Digite o valor de B: ");
        b = entrada.nextFloat();

        System.out.println("Digite o valor de C: ");
        c = entrada.nextFloat();

        //calculando o delta
        delta = (b * b) + (-4 * (a * c));
        System.out.println("Valor de delta e: "+ delta);

        x1 = ((-(b) + Math.sqrt(delta)) / 2 * a );
        x2 = ((-(b) + Math.sqrt(delta)) / 2 * a );

        System.out.println("As raizes deram: ");
        System.out.println("x' = "+x1);
        System.out.println("x'' = "+x2);




        
    }
}
