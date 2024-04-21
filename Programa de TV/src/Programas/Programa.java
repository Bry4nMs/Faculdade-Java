package Programas;

public class Programa {
    private static int proximoCodigo = 1;
    private int codigo;
    private String nome;
    private String nacionalidade;
    private String diretor;
    private String artista;

    public Programa(String nome, String nacionalidade, String diretor, String artista) {
        this.codigo = proximoCodigo++;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.diretor = diretor;
        this.artista = artista;
    }

    @Override
    public String toString() {
        return "Código: " + codigo + ", Nome: " + nome + ", Nacionalidade: " + nacionalidade + ", Diretor: " + diretor + ", Artista: " + artista;
    }
}