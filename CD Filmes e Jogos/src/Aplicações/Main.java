package Aplicações;

import Entidades.CD;
import Entidades.Filme;
import Entidades.Item;
import Entidades.Jogos;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        List<Item> itens = new ArrayList<>();

        char confirmacao;

        do {
            confirmacao = JOptionPane.showInputDialog("Adicionar qual tipo de Item? (F/C/J) ou 0 para sair").toUpperCase().charAt(0);

            if (confirmacao == '0') {
                break;
            }

            String titulo = JOptionPane.showInputDialog("Título:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano:"));
            int duracao = Integer.parseInt(JOptionPane.showInputDialog("Duração (minutos):"));
            String comentarios = JOptionPane.showInputDialog("Comentários:");

            if (confirmacao == 'F') {
                String diretor = JOptionPane.showInputDialog("Diretor:");
                Filme filme = new Filme(ano, titulo, duracao, comentarios, diretor);
                itens.add(filme);
            } else if (confirmacao == 'C') {
                String artista = JOptionPane.showInputDialog("Nome do Artista:");
                int quantFaixas = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de faixas:"));
                CD cd = new CD(ano, titulo, duracao, comentarios, artista, quantFaixas);
                itens.add(cd);
            } else if (confirmacao == 'J') {
                String plataforma = JOptionPane.showInputDialog("Plataforma:");
                int numJogadores = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de jogadores:"));
                Jogos jogo = new Jogos(ano, titulo, duracao, comentarios, plataforma, numJogadores);
                itens.add(jogo);
            }
        } while (true);


        for (Item item : itens) {
            if (item instanceof CD) {
                CD cd = (CD) item;
                JOptionPane.showMessageDialog(null, cd.toString());
            } else if (item instanceof Filme) {
                Filme filme = (Filme) item;
                JOptionPane.showMessageDialog(null, filme.toString());
            } else if (item instanceof Jogos) {
                Jogos jogo = (Jogos) item;
                JOptionPane.showMessageDialog(null, jogo.toString());
                JOptionPane.showMessageDialog(null, "Plataforma: " + jogo.getPlataforma());
            }
        }
    }
}