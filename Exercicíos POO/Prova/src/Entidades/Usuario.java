package Entidades;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private String email;
    private String senha;
    private List<Viagem> viagens;

    public Usuario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.viagens = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Viagem> getViagens() {
        return viagens;
    }

    public void adicionarViagem(Viagem viagem) {
        this.viagens.add(viagem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nome do Usuario: ").append(nome).append('\'');
        sb.append(", email ").append(email).append('\'');
        sb.append(", senha ").append(senha).append('\'');
        sb.append("\n Viagens: \n").append(viagens);
        sb.append("\n");
        return sb.toString();
    }
}
