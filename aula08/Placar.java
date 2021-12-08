public class Placar {
    private String nomeTime1, nomeTime2;
    private int golsTime1, golsTime2;

    public Placar() {
        nomeTime1 = "Time de casa";
        nomeTime2 = "Visitante";

    }

    public Placar(String nomeTime1, String nomeTime2){
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        golsTime1 = 0;
        golsTime2 = 0;

    }

    public Placar(String nomeTime1, String nomeTime2, int golsTime1, int golsTime2){
        this.nomeTime1 = nomeTime1;
        this.nomeTime2 = nomeTime2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;

    }

    public String getPlacar(){
        return nomeTime1 + " " + golsTime1 + " X " + golsTime2 + " " + nomeTime2;
    }
}
