public class Exemplo04 {
    public static void main(String[] args) {
        int cont;

        cont = 1;

        while (cont < 5) { // enquanto for verdadeiro
            System.out.println(cont);
            cont++;
        }

        for(int c = 1; c < 10; c++ ) {
            System.out.println("> " + c);
        }

        // System.out.println(c); // só existe dentro do for
    }
}
