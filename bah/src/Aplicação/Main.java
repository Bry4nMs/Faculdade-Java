package Aplicação;

import Entidade.Aluno;

import javax.swing.JOptionPane;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        Aluno aluno = new Aluno(nome);

        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do Aluno:"));
        String curso = JOptionPane.showInputDialog("Digite o curso do aluno");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do aluno"));

        aluno.matricular(matricula, curso, ano);

        JOptionPane.showMessageDialog(null, aluno.toString());

        aluno.setCurso(JOptionPane.showInputDialog("Digite o novo curso do aluno"));
        aluno.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o novo ano do aluno: ")));

        JOptionPane.showMessageDialog(null, aluno.toString());
    }
}