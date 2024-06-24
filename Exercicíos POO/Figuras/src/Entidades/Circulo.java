package Entidades;

    public class Circulo extends Figuras implements Desenho {
        private double raio;

        private static final double PI = 3.14;

        public Circulo() {
        }

        public Circulo(double raio) {
            this.raio = raio;
        }

        public double getRaio() {
            return raio;
        }

        public void setRaio(double raio) {
            this.raio = raio;
        }

        @Override
        public double calcularArea() {
            return PI * Math.pow(raio, 2);
        }

        @Override
        public double calcularPerimetro() {
            return 2 * PI * raio;
        }

        public String desenhar() {
            return "Desenhando um Circulo";
        }
    }
