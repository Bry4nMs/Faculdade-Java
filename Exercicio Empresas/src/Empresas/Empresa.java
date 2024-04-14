package Empresas;

import Produto.Produtos;
import Responsavel.Responsavel;

import java.util.ArrayList;

public class Empresa {
    private String nomeE;
    private Long cnpj;
    private Responsavel responsavel;
    private ArrayList<Produtos> produtos;

    public Empresa(String nomeE, Long cnpj, Responsavel responsavel) {
        this.nomeE = nomeE;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(Produtos produto) {
        if (produtos == null) {
            produtos = new ArrayList<>();
        }
        produtos.add(produto);
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa ").append(nomeE)
                .append(", CNPJ ").append(cnpj)
                .append(", responsavel ").append(responsavel)
                .append("Produtos:\n");

        if (produtos != null) {
            for (Produtos produto : produtos) {
                sb.append("\n").append(produto.toString());
            }
        } else {
            sb.append("\nNenhum produto cadastrado.");
        }

        return sb.toString();
    }
}

