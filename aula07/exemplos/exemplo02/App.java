package exemplos.exemplo02;

public class App {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("José");

        // f.nome = "José";
        
        System.out.println(f.toString());
        System.out.println(f.getNome());
    }
}
