public class Exemplo03 {
    public static void main(String[] args) {
        double media = 6.0;
        int faltas = 8;

        if(faltas > 0) {
            System.out.println("Reprovado por faltas");
        } else {
            if(media >= 7) {
                System.out.println("Aprovado");
            } else {
                if(media >= 5) {
                    System.out.println("Exame");
                } else {
                    System.out.println("Reprovado");
                }
            }
        }
        
    }
}
