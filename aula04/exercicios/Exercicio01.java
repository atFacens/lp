package exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 * 
 * Leia um valor inteiro digitado pelo usuário e 
 * exiba uma mensagem informando se o valor é positivo (>= 0) ou negativo ( < 0 ).
 */

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        // entrada de dados
        System.out.println("Digite um número inteiro:");
        numero = teclado.nextInt();

        // processamento // saída
        if(numero >= 0) {
            System.out.println(numero + " é positivo");
        } else {
            System.out.println(numero + " é  negativo");
        }

        teclado.close();
    }

}