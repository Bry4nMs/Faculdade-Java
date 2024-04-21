package Aplicação;

import Programa.ProgramaTV;
import Programas.Programa;
import Series.Serie;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Aplicacao {
    public static void main(String[] args) {
        ArrayList<Programa> programas = new ArrayList<>();

        Serie serie1 = new Serie("Game of Thrones", "Estados Unidos", "David Benioff", "Emilia Clarke", 8, 73);
        Serie serie2 = new Serie("Breaking Bad", "Estados Unidos", "Vince Gilligan", "Bryan Cranston", 5, 62);
        Serie serie3 = new Serie("Stranger Things", "Estados Unidos", "The Duffer Brothers", "Millie Bobby Brown", 4, 38);
        ProgramaTV programa1 = new ProgramaTV("Domingão do Faustão","Brasileiro","Alberto Luchetti Neto","Fausto Silva","Game Show","19:00");

        programas.add(serie1);
        programas.add(serie2);
        programas.add(serie3);
        programas.add(programa1);

        char cadastrarPrograma;

        do {
            cadastrarPrograma = JOptionPane.showInputDialog("Cadastrar novo programa de TV ou série (P para ProgramaTV, S para Série, N para sair)?").toUpperCase().charAt(0);

            if (cadastrarPrograma == 'P') {
                String nome = JOptionPane.showInputDialog("Nome do programa:");
                String nacionalidade = JOptionPane.showInputDialog("Nacionalidade do programa:");
                String diretor = JOptionPane.showInputDialog("Nome do diretor:");
                String artista = JOptionPane.showInputDialog("Nome do artista:");
                String categoria = JOptionPane.showInputDialog("Categoria do programa:");
                String horario = JOptionPane.showInputDialog("Horário da programação:");

                ProgramaTV programaTV = new ProgramaTV(nome, nacionalidade, diretor, artista, categoria, horario);
                programas.add(programaTV);
            } else if (cadastrarPrograma == 'S') {
                String nome = JOptionPane.showInputDialog("Nome da série:");
                String nacionalidade = JOptionPane.showInputDialog("Nacionalidade da série:");
                String diretor = JOptionPane.showInputDialog("Nome do diretor da série:");
                String artista = JOptionPane.showInputDialog("Nome do artista da série:");
                int temporadas = Integer.parseInt(JOptionPane.showInputDialog("Número de temporadas:"));
                int episodios = Integer.parseInt(JOptionPane.showInputDialog("Número de episódios:"));

                Serie serie = new Serie(nome, nacionalidade, diretor, artista, temporadas, episodios);
                programas.add(serie);
            } else if (cadastrarPrograma != 'N') {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (cadastrarPrograma != 'N');


        StringBuilder listaProgramas = new StringBuilder("Lista de programas:\n");
        for (Programa programa : programas) {
            listaProgramas.append(programa).append("\n");
        }
        JOptionPane.showMessageDialog(null, listaProgramas.toString());
    }
}