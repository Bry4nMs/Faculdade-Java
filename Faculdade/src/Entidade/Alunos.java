package Entidade;

public class Alunos {
    private String nome;
    private int matricula;
    private int ano;
    private Cursos curso;

    public Alunos (String nome) {
        this.nome = nome;
    }

    public void matricular (int matricula, Cursos curso, int ano) {
        this.matricula = matricula;
        this.ano = ano;
        this.curso = curso;
    }


    public void setCurso(Cursos curso) {
        this.curso = curso;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public String toString() {
        return "Aluno : "+ nome + " - matricula : " + matricula +" - "+ ano + " " + curso;
    }

}

