package Aplicação;

import Cliente.Cliente;
import Funcionario.Caixa;
import Funcionario.Gerente;


import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Nome do caixa:");
        Integer matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do caixa:"));

        Caixa caixa = new Caixa(nome, matricula);

        caixa.setTelefone(Integer.valueOf(JOptionPane.showInputDialog("Telefone do Caixa: ")));
        caixa.setSalario(Double.valueOf(JOptionPane.showInputDialog("Salário do Caixa: ")));
        caixa.setHorario(String.valueOf(JOptionPane.showInputDialog(null, "Horário do Caixa")));

        caixa.aumentoSalarial(10);

        JOptionPane.showMessageDialog(null, caixa.toString());

        nome = JOptionPane.showInputDialog("Nome do Gerente:");
        matricula = Integer.parseInt(JOptionPane.showInputDialog("Matrícula do Gerente:"));

        Gerente gerente = new Gerente(nome, matricula);

        gerente.setTelefone(Integer.valueOf(JOptionPane.showInputDialog("Telefone do Gerente: ")));
        gerente.setSalario(Double.valueOf(JOptionPane.showInputDialog("Salário do Gerente: ")));
        gerente.setBonificacao(Double.valueOf(JOptionPane.showInputDialog("Bonificação do Gerente: ")));
        gerente.setTipo(String.valueOf(JOptionPane.showInputDialog("Tipo do Gerente: ")));

        gerente.aumentoSalarial(20);

        JOptionPane.showInputDialog(gerente.mostrarDados());

        Cliente cliente1 = new Cliente("Marcio",629925263, 32, 25649786);
        Cliente cliente2 = new Cliente("José", 629662512, 57, 21563768);
        Cliente cliente3 = new Cliente("Julia", 629563458, 23, 65698756);

        ArrayList<Cliente> clientes = new ArrayList<>(Arrays.asList(cliente1, cliente2, cliente3));

        JOptionPane.showMessageDialog(null, "Clientes: \n" +
                cliente1.mostrarDados() + "\n " + cliente2.mostrarDados() + "\n " + cliente3.mostrarDados(), "Lista de Clientes", JOptionPane.INFORMATION_MESSAGE);

        String[] options = {cliente1.getNome(), cliente2.getNome(), cliente3.getNome()};


        int option = JOptionPane.showOptionDialog(null, "Cliente para inativar",
                "Inativar Clientes",
                JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

        Cliente.desativar(clientes.get(option));

        JOptionPane.showMessageDialog(null, "Clientes: \n" +
                cliente1.mostrarDados() + "\n" + cliente2.mostrarDados() + "\n " + cliente3.mostrarDados(), "Lista de Clientes Atualizada", JOptionPane.INFORMATION_MESSAGE);

    }
}