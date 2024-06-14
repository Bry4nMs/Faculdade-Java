package Entidades;

public class CD extends Item{
    private String artista;
    private int quantFaixas;


    public CD(int ano, String titulo, int duração, String comentarios, String artista, int quantFaixas) {
        super(ano, titulo, duração, comentarios);
        this.artista = artista;
        this.quantFaixas = quantFaixas;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQuantFaixas() {
        return quantFaixas;
    }

    public void setQuantFaixas(int quantFaixas) {
        this.quantFaixas = quantFaixas;
    }

    @Override
    public String toString() {
        return super.toString() + " - Artista " + artista + " - "
                + " Quantidade de faixas " + quantFaixas;
    }
}
