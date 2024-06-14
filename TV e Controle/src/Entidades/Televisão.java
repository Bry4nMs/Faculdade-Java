package Entidades;

public class Televisão {
    public int volume;
    public int canal;


    public Televisão() {
        canal = 0;
        volume = 0;
    }


    public void aumentarVolume(int quantidade) {
        volume+= quantidade;
    }
    public void diminuirVolume(int quantidade) {
       volume = Math.max(volume - quantidade, 0);
    }

    public int x;
    public void alterarCanal(int novoCanal) {
        this.canal = novoCanal;
    }
    public String toString(){
        return "Canal " + canal + " - Volume  " + volume;
    }
}
