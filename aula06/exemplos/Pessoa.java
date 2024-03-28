package exemplos;

public class Pessoa {
    // atributo
    String nome;
    int idade;
    Float peso;

    // métodos = ações
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
    }

    int obterIdade() {
        return idade;
    }
}
