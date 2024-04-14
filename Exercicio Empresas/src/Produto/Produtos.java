package Produto;

public class Produtos {
    private String nomeP;
    private String tamanho;
    private String tipo;
    private String cor;
    private String especificacao;

    public Produtos(String nomeP, String tamanho, String tipo, String cor, String especificacao) {
        this.nomeP = nomeP;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.cor = cor;
        this.especificacao = especificacao;
    }

    public String toString() {
        return "Produto: " + nomeP + "\n" +
                "Tamanho: " + tamanho + " \n" +
                "Tipo: " + tipo + "\n" +
                "Cor: " + cor + "\n" +
                "Especificacao: " + especificacao +"\n";
    }
}
