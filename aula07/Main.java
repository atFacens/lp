public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1234);
        ContaEspecial ce = new ContaEspecial(4321, 2000);
        ce.setSaldo(-500);

        System.out.println(cc.getInfo() + " R$ " + cc.getSaldo());

        System.out.println(ce.getInfo() + " saldo: R$ " + ce.getSaldo());
    }
}
