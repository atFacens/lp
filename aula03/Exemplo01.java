public class Exemplo01 {
    public static void main(String[] args) {
        int age = 65;

        boolean isOlder = age >= 65;

        if (isOlder) {
            System.out.println("Pode se aposentar");
        } else {
            System.out.println("Ainda é cedo para se aposentar");
        }

        String resposta = (isOlder) ? "Pode se aposentar" : "Ainda é cedo para se aposentar";
        System.out.println(resposta);
    }
}
