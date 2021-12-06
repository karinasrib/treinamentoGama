package exemplo03;

public class Pessoa {
    // atributos = características
    String nome;
    double altura;

    // método contrutor
    // Nome= Nome classe, não poe ter retorno
    Pessoa(String nome, double altura) {
        this.nome = nome;
        this.altura = altura;
    }

    // métodos = ações
    void apresentar() {
        System.out.println("Olá! Eu sou " + nome);
        System.out.println("Tenho altura " + altura);
    }
}
