package Aplicações;

import Entidades.Livro;
import Entidades.Pessoa;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Livro> livraria = new ArrayList<>();

        while (true) {
            int codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do livro (0 p/sair):"));
            if (codigo == 0) {
                break;
            }

            String titulo = JOptionPane.showInputDialog("Título do livro:");
            String nomeAutor = JOptionPane.showInputDialog("Nome do autor:");
            String sobrenomeAutor = JOptionPane.showInputDialog("Sobrenome do autor:");
            String nomeIntermediarioAutor = JOptionPane.showInputDialog("Nome intermediário do autor:");
            Pessoa autor = new Pessoa(nomeAutor, sobrenomeAutor, nomeIntermediarioAutor);

            String editora = JOptionPane.showInputDialog("Editora do livro:");
            int edicao = Integer.parseInt(JOptionPane.showInputDialog("Edição do livro:"));
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano do livro:"));
            String local = JOptionPane.showInputDialog("Local do livro:");
            String genero = JOptionPane.showInputDialog("Gênero do livro:");

            Livro livro = new Livro(codigo, titulo, autor, editora, edicao, ano, local, genero);
            livraria.add(livro);
        }

        StringBuilder resultado = new StringBuilder();
        resultado.append("Livros cadastrados:\n");

        for (Livro livro : livraria) {
            resultado.append("Código: ").append(livro.getCodigo()).append("\n")
                    .append("Título: ").append(livro.getTitulo()).append("\n")
                    .append("Gênero: ").append(livro.getGenero()).append("\n")
                    .append("Referência: ").append(livro.getReferencia()).append("\n\n");
        }

        resultado.append("Total de livros cadastrados: ").append(Livro.getQuantidadeLivros()).append("\n");
        resultado.append("Total por gênero:\n");

        String[] generos = {"Ficção", "História", "Aventura", "Romance", "Sci-Fi"};
        int[] quantidades = Livro.getQuantidadePorGenero();
        for (int i = 0; i < generos.length; i++) {
            resultado.append(generos[i]).append(": ").append(quantidades[i]).append("\n");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
}
