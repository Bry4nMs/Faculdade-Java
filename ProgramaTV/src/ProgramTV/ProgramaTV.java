package ProgramTV;

import Pessoas.Pessoas;

import java.util.ArrayList;

public class ProgramaTV {

    int codigo;
    String nome;
    ArrayList <Pessoas> artistas = new ArrayList <Pessoas>();
    public Pessoas diretor;
    String categoria;

    public ProgramaTV(int codigo, String nome, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.categoria = categoria;
    }

    void setDiretor(Pessoas diretor){
        this.diretor = diretor;
    }

    void setArtistas(Pessoas artista) {
        artistas.add(artista);
    }


    public String toString() {
        String programa = codigo + "-" + nome + " (" + categoria + ")\n";
        programa = programa + "Diretor : " + diretor +"\n";
        programa = programa + "Artistas : \n";
        for (int i=0;i<artistas.size();i++) {
            programa = programa + artistas.get(i) + "\n";
        }
        return programa;
    }

}