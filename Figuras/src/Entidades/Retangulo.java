package Entidades;


public class Retangulo extends Quadrado{
    private double altura;

    public Retangulo(){}
    public Retangulo(double lado, double altura){
        super(lado);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularPerimetro() {
        return getLado() * altura;
    }
    @Override
    public double calcularArea() {
        return 2 * getLado() + 2 * altura;
    }
    public String desenhar(){
        return "Desenhando um Rentangulo";
    }
}
