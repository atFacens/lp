import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        String texto;

        System.out.println("Digite um número");
        numero = Integer.parseInt(scanner.nextLine());
        // numero = scanner.nextInt();
        

        System.out.println("Digite um texto");
        texto = scanner.nextLine();
    

        System.out.println("vc digitou " + numero);
        System.out.println("vc digitou " + texto);

        scanner.close();
    }
}
