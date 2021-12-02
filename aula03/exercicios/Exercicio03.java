package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double salario, novoSalario;

        // entrada de dados
        System.out.println("Digite o valor do salario atual:");
        salario = entrada.nextDouble();
        

        // processamento
        novoSalario = salario + salario * 0.25;
        

        // saída
        System.out.println("Novo salario é " + novoSalario);

                
        entrada.close();
    }

}
