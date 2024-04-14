package Responsavel;

public class Responsavel {
    private String nomeR;
    private Long telefoneR;

    public Responsavel(String nomeR, Long telefoneR) {
        this.nomeR = nomeR;
        this.telefoneR = telefoneR;
    }

    public String toString() {
        return nomeR +
                ", telefone para contato " + telefoneR + "\n";
    }

}
