package Entidades;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private String nomeDoMeio;

    public Pessoa(String nome, String sobrenome, String nomeDoMeio) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nomeDoMeio = nomeDoMeio;
    }

    public String getNomeFormatado() {
        return String.format("%s, %c. %c.", sobrenome.toUpperCase(), nome.charAt(0), nomeDoMeio.charAt(0));
    }

    public String getNome() {
        return nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public String getnomeDoMeio() {
        return nomeDoMeio;
    }
}

