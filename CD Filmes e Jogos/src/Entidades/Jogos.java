package Entidades;

public class Jogos extends Item{
    private int numJogadores;
    private String plataforma;


    public Jogos(int ano, String titulo, int duração, String comentarios, String plataforma, int numJogadores) {
        super(ano, titulo, duração, comentarios);
        this.numJogadores = numJogadores;
        this.plataforma = plataforma;
    }

    public int getNumJogadores() {
        return numJogadores;
    }

    public void setNumJogadores(int numJogadores) {
        this.numJogadores = numJogadores;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return super.toString() + " - Com um número de " + numJogadores + " jogadores";
    }
}
