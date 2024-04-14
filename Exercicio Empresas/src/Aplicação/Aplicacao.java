package Aplicação;

import java.util.ArrayList;
import javax.swing.JOptionPane;

import Empresas.Empresa;
import Produto.Produtos;
import Responsavel.Responsavel;


public class Aplicacao {
    public static void main(String[] args) {
        ArrayList<Empresa> empresas = new ArrayList<>();
        char cadastrarEmpresa;

        do {
            cadastrarEmpresa = JOptionPane.showInputDialog("Cadastrar nova empresa (S/N)?").toUpperCase().charAt(0);

            if (cadastrarEmpresa == 'S') {
                String nomeE = JOptionPane.showInputDialog("Nome da empresa:");
                Long cnpj = Long.valueOf(JOptionPane.showInputDialog("CNPJ da empresa:"));
                String nomeR = JOptionPane.showInputDialog("Nome do responsável:");
                Long telefoneR= Long.valueOf(JOptionPane.showInputDialog("Telefone do responsável:"));

                Responsavel responsavel = new Responsavel(nomeR, telefoneR);
                Empresa empresa = new Empresa(nomeE, cnpj, responsavel);

                char cadastrarProduto;

                do {
                    cadastrarProduto = JOptionPane.showInputDialog("Cadastrar produto para a empresa (S/N)?").toUpperCase().charAt(0);

                    if (cadastrarProduto == 'S') {
                        String nomeP = JOptionPane.showInputDialog("Nome do produto:");
                        String tamanho = JOptionPane.showInputDialog("Tamanho do produto:");
                        String tipo = JOptionPane.showInputDialog("Tipo do produto:");
                        String cor = JOptionPane.showInputDialog("Cor do produto:");
                        String especificacao = JOptionPane.showInputDialog("Especificação do produto:");

                        Produtos produtos = new Produtos(nomeP, tamanho, tipo, cor, especificacao);

                        empresa.adicionarProduto(produtos);
                    }
                } while (cadastrarProduto == 'S');

                empresas.add(empresa);
            }
        } while (cadastrarEmpresa == 'S');

        for (Empresa empresa : empresas) {
            System.out.println(empresa);
        }
    }
}