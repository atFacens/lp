public class ContaCorrente {
    private int numero;
    private double saldo;

    public ContaCorrente(){} // default

    // overload = sobrecarga
    public ContaCorrente(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getInfo() {
        return "Conta corrente: " + getNumero();
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
