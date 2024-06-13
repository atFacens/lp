public class Main {
    public static void main(String[] args) {
        Arma arma1 = new Arma('E');
        Arma arma2 = new Arma('A');
        Arma arma3 = new Arma('X');

        System.out.println(arma1.exibir());
        System.out.println(arma2.exibir());
        System.out.println(arma3.exibir());

        Gladiador g1 = new Gladiador("Gladiador 1", true);
        Gladiador g2 = new Gladiador("Gladiador 2", false);

        System.out.println("Antes");
        System.out.println(g1.exibir());
        System.out.println(g2.exibir());

        g1.receberGolpe(arma1);
        g2.receberGolpe(arma1);

        System.out.println("Depois");
        System.out.println(g1.exibir());
        System.out.println(g2.exibir());
    }
}
