package exemplos;

import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String texto;

        System.out.println("Digite um número inteiro:");
        numero = Integer.parseInt( entrada.nextLine() );
        
        System.out.println("Digite um texto:");
        texto = entrada.nextLine();

        System.out.println("Vc digitou: " + numero + " e " + texto);

        entrada.close();
    }
}
