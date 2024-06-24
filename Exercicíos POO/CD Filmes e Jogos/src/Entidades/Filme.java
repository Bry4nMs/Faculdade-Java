package Entidades;

public class Filme extends Item{
        private String diretor;


    public Filme(int ano, String titulo, int duração, String comentarios, String diretor) {
        super(ano, titulo, duração, comentarios);
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String toString(){
        return super.toString() + " - Diretor " + diretor;
    }
}
