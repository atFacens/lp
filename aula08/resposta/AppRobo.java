package resposta;

import java.util.Scanner;

public class AppRobo {
    public static void main(String[] args) {
        Area area = new Area(50, 50);
        RoboSimples robo = new RoboSimples(area);

        Scanner teclado = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 5) {
            System.out.println("1 - Andar para o Norte:");
            System.out.println("2 - Andar para o Sul:");
            System.out.println("3 - Andar para o Leste:");
            System.out.println("4 - Andar para o Oeste:");
            System.out.println("5 - Terminar:");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    if (robo.mover(Direcao.NORTE, 10)) {
                        robo.exibirPosicao();
                    } else {
                        System.out.println("Não dá.");
                    }
                    break;
                case 2:
                    if (robo.mover(Direcao.SUL, 10)) {
                        robo.exibirPosicao();
                    } else {
                        System.out.println("Não dá.");
                    }
                    break;
                case 5:
                    System.out.println("Tchau");
                    break;
                default:
                    System.out.println("Ainda não implementada. Exercício pra você. :-)");
                    break;
            }
        }
        teclado.close();
    }
}
