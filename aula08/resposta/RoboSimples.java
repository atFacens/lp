package resposta;

public class RoboSimples {
    private int posX, posY;
    private Area area;

    public RoboSimples(Area area) {
        this.area = area;
    }

    public boolean mover(Direcao direcao, int deslocamento) {
        if (area.posValida(posX, posY, deslocamento, direcao)) {
            switch (direcao) {
                case NORTE:
                    posY -= deslocamento;
                    break;
                case SUL:
                    posY += deslocamento;
                    break;
                case OESTE:
                    posX -= deslocamento;
                    break;
                case LESTE:
                    posX += deslocamento;
                    break;
            }
            return true;
        }
        return false;
    }

    public void exibirPosicao() {
        System.out.println("[" + posX + ", " + posY + "]");
    }
}