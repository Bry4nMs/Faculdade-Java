package Aplicações;

import Entidades.Filme;

import javax.swing.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Character confirmação;

        do{
            confirmação = JOptionPane.showInputDialog("Adicionar novo filme?").toUpperCase().charAt(0);

            if(confirmação == 'S'){
                int cod = Integer.parseInt(JOptionPane.showInputDialog("Código do filme:"));
                String nome = JOptionPane.showInputDialog("Nome do filme");

                Filme filme = new Filme(cod, nome);

                filme.setGenero(JOptionPane.showInputDialog("Genero do filme"));
                filme.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano do filme")));
                filme.setAutorP(JOptionPane.showInputDialog("Nome do Autor Principal do filme"));

                JOptionPane.showMessageDialog(null,filme.toString());
            }else if(confirmação =='0'){
            break;
            }

        }while (true);

        JOptionPane.showMessageDialog(null, "Total de filmes: " + Filme.getQuantFilmes());
    }
}