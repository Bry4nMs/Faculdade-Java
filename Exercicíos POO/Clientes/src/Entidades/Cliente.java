package Entidades;

public class Cliente {
    private String nome;
    private String telefone;
    private int idade;

    public Cliente(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getNome() {
        return nome;
    }
    public String toString() {
        return "Cliente : " + nome + ", Idade: " + idade + ", Telefone: " + telefone;
    }
}
