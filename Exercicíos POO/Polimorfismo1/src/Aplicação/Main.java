package Aplicação;

import javax.swing.*;
import java.util.ArrayList;

import Entidades.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Conta> contas = new ArrayList<>();
            while (true) {
                String numeroContaStr = JOptionPane.showInputDialog("Digite o número da conta (0 para sair):");
                int numeroConta = Integer.parseInt(numeroContaStr);
                if (numeroConta == 0) break;

                String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
                String telefone = JOptionPane.showInputDialog("Digite o telefone do cliente:");
                Cliente cliente = new Cliente(nome, telefone);

                String tipoContaStr = JOptionPane.showInputDialog("Digite o tipo de conta (1-Corrente, 2-Conta Salário, 3-Poupança):");
                int tipoConta = Integer.parseInt(tipoContaStr);

                Conta conta;
                switch (tipoConta) {
                    case 1:
                        conta = new ContaCorrente(numeroConta, cliente);
                    break;

                    case 2:
                        conta = new ContaSalario(numeroConta, cliente);
                    break;

                    case 3:
                        conta = new ContaPoupanca(numeroConta, cliente);
                    break;

                    default:
                        JOptionPane.showMessageDialog(null, "Tipo de conta inválido!");
                continue;
            }
            contas.add(conta);
        }

            StringBuilder lista = new StringBuilder();
                for (Conta conta : contas) {
                    lista.append(conta.toString()).append("\n");
                }

            JOptionPane.showMessageDialog(null, lista.toString());
    }
}