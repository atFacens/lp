public class ContaEspecial extends ContaCorrente {
    private double limite;

    // public ContaEspecial(){
    // super();
    // }

    public ContaEspecial(int numero, double limite) {
        super(numero);
        this.limite = limite;
    }

    @Override
    public double getSaldo() {
        if (super.getSaldo() < 0) {
            System.out.println((super.getSaldo() + " limite disponível: R$ " + (limite + super.getSaldo())));
            return super.getSaldo();
        }
        System.out.println(super.getSaldo() + " limite disponível: R$ " + (limite));
        return super.getSaldo();
    }

    @Override
    public String getInfo() {
        return "Conta especial: " + getNumero() + " limite: R$ " + limite;
    }
}
