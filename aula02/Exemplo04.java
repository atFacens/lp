public class Exemplo04 {
    public static void main(String[] args) {
        int cont = 1;

        while (cont < 10) {
            // System.out.println(++cont);
            System.out.println(cont++);
            // cont++;
        }

        do {
            System.out.println(cont++);
        } while (cont < 10);
    }
}
