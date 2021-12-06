package exemplos;

public class Exemplo01 {

    public static void main(String[] args) {
        linha();
        System.out.println("Programa v0.1");
        linha2(10, '-');

        int n = 25;
        linha2(n, '*');
    }

    static void linha() {
        System.out.println("---------------");
    }

    // ALT + SHIFT + SETA = copia a linha ou bloco
    // ALT + SETA = mover a linha ou bloco
    // CTRL + D = marcar várias palavras para edição simultânia
    // ALT + SHIFT + F = formatar o documento
    // CTRL + ´ = desloca para esquerda
    // CTRL + [ = desloca para direita


    static void linha2(int tamanho, char simbolo) {
        for(int i = 0; i < tamanho; i++){
        System.out.print(simbolo);
        }
        System.out.println();
    }
    
}