package exercicio03;

public class AppVeiculo {
    public static void main(String[] args) {
        Veiculo veiculo = new Veiculo ("VW ", "Gol ", 15.5);

        veiculo.exibirDados();
        // veiculo.consumo = -10; // erro! não pode ser negativo
        veiculo.alterarConsumo(-20);
        
        System.out.println("Consumo : " + veiculo.obterConsumo());
    }    
}
