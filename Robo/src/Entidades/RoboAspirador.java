package Entidades;


public class RoboAspirador {
    private int cod;
    protected String status;
    public int posiçãox;
    public int posiçãoy;
    protected int quantpo;
    protected int limitePo;


    public RoboAspirador(int cod, int limitePo) {
        this.cod = cod;
        this.status = "desligado";
        this.posiçãox = 0;
        this.posiçãoy = 0;
        this.quantpo = 0;
        this.limitePo = limitePo;
    }

    public void ligar() {
        if (!status.equals("desligado")) {
            System.out.println("O robô já está ligado ou não pode ser ligado.");
            return;
        }
        status = "ligado";
    }

    public void desligar() {
        status = "desligado";
    }

    public void andar(int x, int y) {
        if (!status.equals("ligado")) {
            System.out.println("O robô precisa estar ligado para andar.");
            return;
        }
        posiçãox += x;
        posiçãoy += y;
        status = "andando";
    }

    public void aspirar(int quantidade) {
        if (!status.equals("ligado")) {
            System.out.println("O robô precisa estar ligado para aspirar.");
            return;
        }
        if (quantpo + quantidade > limitePo) {
            quantpo = limitePo;
            status = "desligado";
            System.out.println("O robô atingiu o limite de pó e foi desligado.");
        } else {
            quantpo += quantidade;
        }
    }

    public void parar() {
        if (!status.equals("andando")) {
            System.out.println("O robô precisa estar andando para parar.");
            return;
        }
        status = "parado";
    }
    public String toString() {
        return "RoboAspirador ID: " + cod + ", Status: " + status + ", Posição X: " + posiçãox +
                ", Posição Y: " + posiçãoy + ", Quantidade de Pó: " + quantpo + ", Limite de Pó: " + limitePo + "]";
    }
}