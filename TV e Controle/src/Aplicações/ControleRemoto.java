package Aplicações;

import Entidades.Televisão;

import javax.swing.*;
import java.util.Scanner;

public class ControleRemoto {
    public static void main(String[] args) {

        Televisão tv = new Televisão();

        JOptionPane.showMessageDialog(null, tv);

        int novoCanal = Integer.parseInt(JOptionPane.showInputDialog("Canal desejado: "));
        tv.alterarCanal(novoCanal);
        JOptionPane.showMessageDialog(null, tv);

        char confirmacao;

        do {
            confirmacao = JOptionPane.showInputDialog("Deseja alterar ou diminuir o volume? (A/D)").toUpperCase().charAt(0);
            if (confirmacao == 'A') {
                int quantidadeAumentar = Integer.parseInt(JOptionPane.showInputDialog("Aumentar em:"));
                tv.aumentarVolume(quantidadeAumentar);
                JOptionPane.showMessageDialog(null, tv.toString());
            } else if (confirmacao == 'D') {
                int quantidadeDiminuir = Integer.parseInt(JOptionPane.showInputDialog("Diminuir em:"));
                tv.diminuirVolume(quantidadeDiminuir);
                JOptionPane.showMessageDialog(null, tv.toString());
            }
        } while (confirmacao == 'A' || confirmacao == 'D');
    }
}
