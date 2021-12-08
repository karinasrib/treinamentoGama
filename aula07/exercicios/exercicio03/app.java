package exercicios.exercicio03;

public class app {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Karina", "11 99999-9999");
        Professor professor = new Professor("Larissa", "13 98989-1234", 3000);
        Estudante estudante = new Estudante("Júlio", "14 98765-1234", "Administração");
        Pessoa pessoa2 = new Pessoa("Antônio");

        System.out.println(pessoa.toString());
        System.out.println(pessoa2.toString());
        System.out.println(estudante.toString());

        System.out.println(professor); // .toString()
    }
}
