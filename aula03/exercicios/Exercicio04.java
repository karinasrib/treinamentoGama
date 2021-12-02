package exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final double TAXA_POR_KW = 500; // constante = o valor não pode ser alterado
        double salarioMinimo, kwConsumido;
        double valorKW, valorTotal, valorComDesconto;

        // entrada de dados
        System.out.println("Digite o valor do Salario mínimo:");
        salarioMinimo = entrada.nextDouble();
        System.out.println("Digite o consumo do KW:");
        kwConsumido = entrada.nextDouble();
        

        // processamento
        valorKW = salarioMinimo / TAXA_POR_KW;
        valorTotal = valorKW * kwConsumido;
        valorComDesconto =  valorTotal * 0.85; //valorTotal - valorTotal * 0.15;
        

        // saída
        System.out.println("1 Kw custa: R$ " + valorKW);
        System.out.println("Valor Total: R$ " + valorTotal);
        System.out.println("Desconto com 15% de desconto: R$ " + valorComDesconto);
        

                
        entrada.close();
    }
}
