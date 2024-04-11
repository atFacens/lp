
public class RoboSimples {
    private int posX, posY;
    private Area area;
    
    public RoboSimples(Area area) {
        this.area = area;
    }

    public void mover(Direcao direcao, int deslocamento) {
        if(area.posValida(posX, posY, deslocamento, direcao)) {
            switch (direcao) {
                case SUL:
                    posX += deslocamento;
                    break;
            
            }
        }
    }

    public void exibirPosicao() {
        System.out.println(posX + ", " + posY);
    }
}