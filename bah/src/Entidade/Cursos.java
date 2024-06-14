package Entidade;

public class Cursos {
    private String sigla;
    private String nomeCurso;

    public Cursos(String nomeCurso , String sigla) {
        this.nomeCurso = nomeCurso;
        this.sigla = sigla;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
        public String toString() {
        return "Curso " + nomeCurso + "("+sigla+")";
        }
}
