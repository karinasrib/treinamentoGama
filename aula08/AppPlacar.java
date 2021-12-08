public class AppPlacar {
    public static void main(String[] args) {
        Placar placar1;

        
        placar1 = new Placar("A", "B");



        Placar placar2 = new Placar("São Paulo", "Palmeiras");
        Placar placar3 = new Placar("São Paulo", "Palmeiras", 2, 1);



        System.out.println(placar1.getPlacar());
        System.out.println(placar2.getPlacar());
        System.out.println(placar3.getPlacar());
    }
}
