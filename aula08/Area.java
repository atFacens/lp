public class Area {
    private int maxX, maxY;

    public Area(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean posValida(int x, int y, int deslocamento, Direcao direcao) {
        if(direcao == Direcao.SUL) {
            return (x + deslocamento <= maxX);
        }
        return false;
    }

    
}
