package Entidades;

public class Cursos {
        public String nome;
        public int duracao;
        public String area;
        public String turno;

        public Cursos(String nome, int duracao, String area, String turno) {
                this.nome = nome;
                this.duracao = duracao;
                this.area = area;
                this.turno = turno;
        }

        public String toString() {
                return "Curso " + nome
                        + ", tem duracao de " + duracao
                        + " semestres, é na área de " + area
                        + ", e é ministrado no turno " + turno + ".";
        }
}

