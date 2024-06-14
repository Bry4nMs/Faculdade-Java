package Aplicação;

import Entidade.Alunos;
import Entidade.Cursos;

import javax.swing.*;
import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String nome = JOptionPane.showInputDialog("Digite o nome do aluno");
        Alunos aluno = new Alunos(nome);

        int matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do Aluno:"));
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do aluno"));
        String sigla = JOptionPane.showInputDialog("Digite o sigla do curso");
        String nomeCurso = JOptionPane.showInputDialog("Digite o nome do curso");
        Cursos curso = new Cursos(sigla, nomeCurso);

        aluno.matricular(matricula, curso, ano);

        JOptionPane.showMessageDialog(null, aluno.toString());

        curso.setSigla(JOptionPane.showInputDialog("Digite a sigla do novo Curso"));
        curso.setNomeCurso(JOptionPane.showInputDialog("Digite o nome do novo Curso"));
        aluno.setAno(Integer.parseInt(JOptionPane.showInputDialog("Digite o novo ano do aluno: ")));

        JOptionPane.showMessageDialog(null, aluno.toString());
    }
}
