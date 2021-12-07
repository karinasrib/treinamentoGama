package exercicios.exercicio03;

public class app {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Karina", "11 99999-9999");
        Estudante estudante = new Estudante("Júlio", "14 98765-1234", "Administração");
        Professor professor = new Professor("Larissa", "13 98989-1234", 3000);

        System.out.println(pessoa.getDados());
        System.out.println(estudante.getDados());
        System.out.println(professor.getDados());
    }
}
