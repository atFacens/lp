import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;
        int valor;

        System.out.println("Digite seu nome");
        nome = entrada.nextLine();

        System.out.println("Digite o valor:");
        valor = entrada.nextInt();

        System.out.println("Boa noite " + nome);
        System.out.println("Você digitou " + valor);

        entrada.close();
    }
}
