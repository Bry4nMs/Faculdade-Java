package Entidades;

public class Item {
    private String titulo;
    private int ano;
    private int duração;
    private String comentarios;

    public Item(int ano, String titulo, int duração, String comentarios) {
        this.ano = ano;
        this.titulo = titulo;
        this.duração = duração;
        this.comentarios = comentarios;
    }
    public String toString(){
        return "Título " + titulo + " - "
                + "Ano " + ano + " - "
                + "Duração " + duração + " - "
                + " Comentários " + comentarios;
    }
}
