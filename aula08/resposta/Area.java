package resposta;

public class Area {
    private int maxX, maxY;

    public Area(int maxX, int maxY) {
        this.maxX = maxX;
        this.maxY = maxY;
    }

    public boolean posValida(int x, int y, int deslocamento, Direcao direcao) {
        switch (direcao) {
            case NORTE:
                return (y - deslocamento >= 0);
            case SUL:
                return (y + deslocamento <= maxY);
            case OESTE:
                return (x - deslocamento >= 0);
            case LESTE:
                return (x + deslocamento <= maxX);
        }
        return false;
    }

    
}
