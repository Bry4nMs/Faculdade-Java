package Entidades;

import javax.swing.*;

public class Horario {
    private int hora;
    private int minuto;
    private int segundo;

    public Horario(int hora) {
        if (validarHora(hora)) {
            this.hora = hora;
        } else {
            mostrarErro("Hora inválida");
        }
        this.minuto = 0;
        this.segundo = 0;
    }

    public Horario(int hora, int minuto, int segundo) {
        if (validarHora(hora) && validarMinuto(minuto) && validarSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            mostrarErro("Horário inválido");
        }
    }

    public void setHora(int hora) {
        if (validarHora(hora)) {
            this.hora = hora;
        } else {
            mostrarErro("Hora inválida");
        }
    }

    public void setMinuto(int minuto) {
        if (validarMinuto(minuto)) {
            this.minuto = minuto;
        } else {
            mostrarErro("Minuto inválido");
        }
    }

    public void setSegundo(int segundo) {
        if (validarSegundo(segundo)) {
            this.segundo = segundo;
        } else {
            mostrarErro("Segundo inválido");
        }
    }

    public void setHorario(int hora, int minuto, int segundo) {
        if (validarHora(hora) && validarMinuto(minuto) && validarSegundo(segundo)) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        } else {
            mostrarErro("Horário inválido");
        }
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public String getHorarioCompleto() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public boolean validarHora(int hora) {
        return hora >= 0 && hora < 24;
    }

    public boolean validarMinuto(int minuto) {
        return minuto >= 0 && minuto < 60;
    }

    public boolean validarSegundo(int segundo) {
        return segundo >= 0 && segundo < 60;
    }

    private void mostrarErro(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "Erro", JOptionPane.ERROR_MESSAGE);
    }

    public static int diferencaEmSegundos(Horario h1, Horario h2) {
        int totalSegundosH1 = h1.getHora() * 3600 + h1.getMinuto() * 60 + h1.getSegundo();
        int totalSegundosH2 = h2.getHora() * 3600 + h2.getMinuto() * 60 + h2.getSegundo();
        return Math.abs(totalSegundosH1 - totalSegundosH2);
    }

    public static String formatarDiferenca(int diferencaSegundos) {
        int horas = diferencaSegundos / 3600;
        int minutos = (diferencaSegundos % 3600) / 60;
        int segundos = diferencaSegundos % 60;
        return String.format("%02d:%02d:%02d", horas, minutos, segundos);
    }

}

