package Entidades;

public class Pessoa {
    protected String nome;

    protected Integer telefone;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome, Integer telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setTelefone(Integer telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Telefone: " + telefone;
    }
}