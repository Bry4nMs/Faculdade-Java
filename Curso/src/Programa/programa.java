package Programa;

import Entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class programa {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

    Produto produto =  new Produto();
    System.out.println("Informações do produto: ");
    System.out.print("Nome: ");
    produto.name = sc.nextLine();
    System.out.print("Preço: ");
    produto.preco = sc.nextDouble();
    System.out.print("Quantidade: ");
    produto.quantidade = sc.nextInt();

    System.out.println();
    System.out.println("Informações do produto: " + produto);

    System.out.println();
    System.out.println("Quantidade de produtos a ser adicionado: ");
    int quantidade = sc.nextInt();
    produto.addproduto(quantidade);

    System.out.println();
    System.out.println("Dados atualizados: " + produto);

    System.out.println();
    System.out.println("Quantidade de produtos a ser removido: ");
    quantidade = sc.nextInt();
    produto.remproduto(quantidade);

    System.out.println();
    System.out.println("Dados atualizados: " + produto);

    sc.close();
    }
}
