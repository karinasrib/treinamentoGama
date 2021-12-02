package Exemplos;

public class Exemplo04 {
    public static void main(String[] args) {
        String palavra1, palavra2;

        palavra1 = "laranja";
        palavra2 = "goiaba";

        System.out.println(palavra1.equals(palavra2)); // compara as duas variáveis strings (textos)
        System.out.println(palavra1.equals("laranja")); // compara a variável com texto
        System.out.println( palavra1.equals("Laranja") ); // compara e faz diferença maíusculas e minusculas
        System.out.println( palavra1.equalsIgnoreCase("Laranja") ); // não faz difereça maíusculas e minusculas
    
    }
}
