package Aplicações;

import Entidades.RoboAspirador;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        RoboAspirador robo1 = new RoboAspirador(1, 80);
        RoboAspirador robo2 = new RoboAspirador(2, 120);

        JOptionPane.showMessageDialog(null, robo1.toString());
        JOptionPane.showMessageDialog(null, robo2.toString());

        robo1.ligar();
        JOptionPane.showMessageDialog(null, robo1.toString());

        robo1.andar(5, 10);
        JOptionPane.showMessageDialog(null, robo1.toString());

        robo1.aspirar(100);
        JOptionPane.showMessageDialog(null, robo1.toString());

        robo1.parar();
        JOptionPane.showMessageDialog(null, robo1.toString());

        robo1.desligar();
        JOptionPane.showMessageDialog(null, robo1.toString());

        robo2.ligar();
        JOptionPane.showMessageDialog(null, robo2.toString());

        robo2.andar(3, 7);
        JOptionPane.showMessageDialog(null, robo2.toString());

        robo2.aspirar(105);
        JOptionPane.showMessageDialog(null, robo2.toString());

        robo2.parar();
        JOptionPane.showMessageDialog(null, robo2.toString());

        robo2.desligar();
        JOptionPane.showMessageDialog(null, robo2.toString());
    }
}
