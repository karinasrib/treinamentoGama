package exercicios;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int limite, cont;

        System.out.println("Digite o valor limite:");
        limite = entrada.nextInt();

        cont = 1;

        while (cont <= limite) {
            if(cont * 2 <= limite) { // existirá outro número depois?
                System.out.print(cont + ", ");
            } else {
                System.out.print( cont);
            }
            cont = cont * 2;
        }

        entrada.close();
    }

}
