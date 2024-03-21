package exercicios;

import java.util.Scanner;

/*
 * Exercício 2
 * 
 * Escreva um programa que exiba a tabuada do número digitado pelo usuário.

    Exemplo: 

    valor digitado: 5

    5  x   0 =  0
    5  x   1 =  5
    5  x   2 = 10
    ...
    5  x   10  = 50

 */

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Qual tabuada?");
        numero = teclado.nextInt();

        for (int i = 0; i < 11; i++) {
            // System.out.println(numero + " X " + i + " = " + (numero * i));
            // System.out.print(numero + " X " + i + " = " + (numero * i) + "\n");
            System.out.printf("%d X %2d = %2d\n", numero , i , numero * i);
        }

        teclado.close();
    }
}
