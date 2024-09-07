public class Exemplo02 {
    public static void main(String[] args) {
        int diaSemana = 1;

        switch (diaSemana) {
            case 0:
            case 1:
                System.out.println("Fim de semana");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Valor inválido");
                break;
        }
    }
}
