package Pessoas;

public class Pessoas {
    String nome;
    String nacionalidade;

    Pessoas (String nome, String nacionalidade) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
    }

    public String toString() {
        return nome + " (" + nacionalidade + ")";
    }

}