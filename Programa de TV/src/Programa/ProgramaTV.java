package Programa;

import Programas.Programa;

public class ProgramaTV extends Programa {
    private String categoria;
    private String horario;

    public ProgramaTV(String nome, String nacionalidade, String diretor, String artista, String categoria, String horario) {
        super(nome, nacionalidade, diretor, artista);
        this.categoria = categoria;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return super.toString() + ", Categoria: " + categoria + ", Horário: " + horario;
    }
}
