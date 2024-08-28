/*Escreva um programa que leia a quantidade em segundos e imprima o resultado em dias, horas, minutos e
segundos. */

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args)
     {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite os segundos: ");
        int totalSegundos = entrada.nextInt();
        
        int dias = totalSegundos / (24 * 3600);
        int restoSegundos = totalSegundos % (24 * 3600);
        int horas = restoSegundos / 3600;
        restoSegundos %= 3600;
        int minutos = restoSegundos / 60;
        int segundos = restoSegundos % 60;
        
        System.out.println(dias + " dias, " + horas + " horas, " + minutos + " minutos e " + segundos + " segundos.");

    }
}
