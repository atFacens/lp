import java.util.Scanner;

public class B1003 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, soma;

        n1 = scanner.nextInt();
        n2 = scanner.nextInt();

        soma = n1 + n2;

        System.out.println("Soma=" + soma);
        
        scanner.close();
    }
}