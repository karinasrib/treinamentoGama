package exercicio03;

public class Veiculo {
    public static String marca, modelo;
    private double consumo;

    Veiculo(String marca, String modelo, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;

    }

    public void exibirDados() {
        System.out.println("Marca: " + marca + "Modelo: " + modelo);
    }

    public double obterConsumo() {
       return consumo;

    }

    public void alterarConsumo(double novoConsumo) {
        if(novoConsumo > 0) {
            consumo = novoConsumo;
        }
    }
    
}
