package Aplicações;

import Entidades.Horario;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

            int hora1 = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora do primeiro horário:"));
            int minuto1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto do primeiro horário:"));
            int segundo1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo do primeiro horário:"));
            Horario horario1 = new Horario(hora1, minuto1, segundo1);

            int hora2 = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora do segundo horário:"));
            int minuto2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto do segundo horário:"));
            int segundo2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo do segundo horário:"));
            Horario horario2 = new Horario(hora2, minuto2, segundo2);

            JOptionPane.showMessageDialog(null, "Primeiro Horário: " + horario1.getHorarioCompleto());
            JOptionPane.showMessageDialog(null, "Segundo Horário: " + horario2.getHorarioCompleto());

            int diferencaSegundos = Horario.diferencaEmSegundos(horario1, horario2);
            String diferencaFormatada = Horario.formatarDiferenca(diferencaSegundos);

            JOptionPane.showMessageDialog(null, "Diferença entre os horários: " + diferencaFormatada);

    }
}
