public class Relogio {
    private int hora, minuto, segundo;

    // construtor default é aquele que não tem parâmetro
    public Relogio() {
    }

    // construtor sobrecarregado
    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora < 24) {
            this.hora = hora; // this se refere ao próprio objeto
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto < 60) {
            this.minuto = minuto;
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo < 60) {
            this.segundo = segundo;
        }
    }

    public String getRelogio24() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }
}
