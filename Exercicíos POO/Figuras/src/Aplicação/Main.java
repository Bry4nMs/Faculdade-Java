package Aplicação;

import Entidades.*;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Figuras> figuras = new ArrayList<>();

        Quadrado quadrado = new Quadrado(9);
        Triangulo triangulo = new Triangulo(2, 3, 6, 7);
        Circulo circulo = new Circulo(10);
        Retangulo retangulo = new Retangulo(6, 9);

        figuras.add(quadrado);
        figuras.add(triangulo);
        figuras.add(circulo);
        figuras.add(retangulo);

        StringBuilder lista = new StringBuilder();
        for (Figuras figura : figuras) {
            lista.append(figura.desenhar()).append("\n");
            lista.append("Área: ").append(figura.calcularArea()).append("\n");
            lista.append("Perímetro: ").append(figura.calcularPerimetro()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, lista.toString());
    }
}
