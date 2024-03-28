package exemplos;


public class Exemplo01 {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2; // declara a referência
        
        p2 = new Pessoa(); // "aponta" para o novo objeto

        p1.nome = "Davi";
        p1.apresentar();
        p1.idade = 23;
        
        System.out.println("idade: " + p1.obterIdade());
        System.out.println(p1.peso);

        p2.nome = "Carla";
        p2.apresentar();

        p2 = p1; // copia de referência, não de objeto

        p1.apresentar();
        p2.apresentar();
    }
    
}