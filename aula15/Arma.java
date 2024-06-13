/**
 * Arma
 */
public class Arma {
    private String tipo;
    private int forca;

    public Arma(char tipo) {
        if(tipo == 'L') {
            this.tipo = "Lança";
            this.forca = 4;
        } else {
            if(tipo == 'E') {
                this.tipo = "Espada";
                this.forca = 5;
            } else {
                if(tipo == 'A') {
                    this.tipo = "Arco e Flecha";
                    this.forca = 3;
                } else {
                    this.tipo = "Desarmado";
                    this.forca = 0;
                }
            }
        }
    }

    public String getTipo() {
        return tipo;
    }

    public int getForca() {
        return forca;
    }

    public String exibir() {
        return tipo + " - " + forca;
    }
    
}