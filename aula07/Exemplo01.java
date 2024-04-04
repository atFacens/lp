public class Exemplo01 {

    public static void main(String[] args) {
        Relogio relogio1 = new Relogio();
        Relogio relogio2 = new Relogio(2, 23, 45);

        // relogio.hora = 87;
        // relogio.minuto = -345;

        System.out.println("Hora rel1: " + relogio1.getHora());
        relogio1.setHora(-6);
        relogio1.setMinuto(12);
        relogio1.setSegundo(120);
        System.out.println("Hora rel1: " + relogio1.getHora());

        System.out.println("Hora rel2: " + relogio2.getRelogio24());

    }
}