package Series;

import Programas.Programa;

public class Serie extends Programa {
    private int temporadas;
    private int episodios;

    public Serie(String nome, String nacionalidade, String diretor, String artista, int temporadas, int episodios) {
        super(nome, nacionalidade, diretor, artista);
        this.temporadas = temporadas;
        this.episodios = episodios;
    }

    @Override
    public String toString() {
        return super.toString() + ", Temporadas: " + temporadas + ", Episódios: " + episodios;
    }
}