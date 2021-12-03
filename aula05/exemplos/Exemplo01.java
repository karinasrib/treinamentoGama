package exemplos;

/**
 * Exemplo01
 */
public class Exemplo01 {

    public static void main(String[] args) {
        int n1, n2;

        n1 = 10;
        n2 = 15;

        System.out.println((n1 < n2) && (n2 < 10)); // V E F = F
        System.out.println((n1 < n2) && (n2 > 10)); // V E V = V
        System.out.println((n1 < n2) || (n2 > 10)); // V OU V = V
        System.out.println(!(n1 > n2)); // !F = V
    }
}