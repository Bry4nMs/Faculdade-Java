package Entidades;

public class Quadrado extends Figuras implements Desenho{
    private double lado;

    public Quadrado() {}

    public Quadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return lado*4;
    }

    public String desenhar(){
        return "Desenhando um Quadrado";
    }
}
