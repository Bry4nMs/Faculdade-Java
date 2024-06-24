package Entidades;

public class Filme {
    private int cod;
    private String nome;
    private String genero;
    private int ano;
    private String autorP;
    public static int quantFilmes = 0;

    public Filme(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
        quantFilmes++;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getAutorP() {
        return autorP;
    }

    public void setAutorP(String autorP) {
        this.autorP = autorP;
    }
    public static int getQuantFilmes(){
        return quantFilmes;
    }

    public String toString() {
        return "Codigo: " + cod + " - "
                + "Nome: " + nome + " - "
                + "Genero: " + genero + " - "
                + "Ano: " + ano + " - "
                + "Autor Principal: " + autorP;
    }
}
