public class Gladiador {
    private String nome;
    private int qtdeVidas;
    private boolean temArmadura;

    public Gladiador(String nome, boolean temArmadura) {
        this.nome = nome;
        this.temArmadura = temArmadura;
        this.qtdeVidas = 5;
    }

    public int getQtdeVidas() {
        return qtdeVidas;
    }

    public String exibir() {
        String estado = (qtdeVidas > 0)? "Vivo" : "Morto";
        String armadura = (temArmadura)? "Tem armadura" : "Não tem armadura";

        return nome + " - " + armadura + " - " + qtdeVidas + " - " + estado;
    }

    public void receberGolpe(Arma arma) {
        System.out.println("O " + nome + " foi atacado com uma " + arma.getTipo());
        int golpe = arma.getForca();
        
        if(temArmadura) {
            golpe -= 2;
        }

        qtdeVidas -= golpe;
    }
}
