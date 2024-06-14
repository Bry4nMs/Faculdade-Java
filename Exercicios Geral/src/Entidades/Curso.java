package Entidades;

public class Curso {
    private String nome;
    private String area;
    private String instituto;
    private Integer duracao;

    public Curso(String area, String nome, String instituto, Integer duracao) {
        this.area = area;
        this.nome = nome;
        this.instituto = instituto;
        this.duracao = duracao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        this.duracao = duracao;
    }

    public String toString() {
        return "Curso " + nome +
                ", na área de " + area +
                ", ofertado pelo Instituto de " + instituto +
                ", duracao de " + duracao + " anos";
    }
}
