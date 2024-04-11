public class AppRobo {
    public static void main(String[] args) {
        Area area = new Area(50, 50);
        RoboSimples robo = new RoboSimples(area);

        robo.exibirPosicao();
        robo.mover(Direcao.SUL, 10);
        robo.exibirPosicao();
        robo.mover(Direcao.SUL, 50);
        robo.exibirPosicao();
    }
}
