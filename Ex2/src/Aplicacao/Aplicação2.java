package Aplicacao;

import Entidades.Produto2;

import java.util.Locale;
import java.util.Scanner;

public class Aplicação2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Produto2 produto1 = new Produto2();
        System.out.println("Dados produto 1: ");

        System.out.print("Nome do produto : ");
        String nomeP = scanner.nextLine();

        System.out.print("Quantidade do produto : ");
        int quantidadeP = Integer.parseInt(scanner.nextLine());

        System.out.print("Tipo do produto : ");
        String tipoP = scanner.nextLine();

        System.out.print("Valor do produto : ");
        Double valorP = Double.parseDouble(scanner.nextLine());
        System.out.println();

        produto1.inserir(nomeP, quantidadeP, tipoP, valorP);

        System.out.println("Dados do produto: ");
        System.out.println(produto1);

        System.out.println("Dados produto 2:");

        System.out.print("Nome do produto : ");
        nomeP = scanner.nextLine();
        System.out.println();

        Produto2 produto2 = new Produto2(nomeP);

        System.out.println("Dados para atualizar produto :");

        System.out.print("Quantidade do produto : ");
        quantidadeP = Integer.parseInt(scanner.nextLine());

        System.out.print("Tipo do produto : ");
        tipoP = scanner.nextLine();

        System.out.print("Valor do produto : ");
        valorP = Double.parseDouble(scanner.nextLine());
        System.out.println();

        produto2.inserir(nomeP, quantidadeP, tipoP, valorP);

        System.out.println("Dados do produto: ");
        System.out.println(produto2);

        System.out.println("Dados produto 3:");

        System.out.print("Nome do produto: ");
        nomeP = scanner.nextLine();

        System.out.print("Quantidade do produto: ");
        quantidadeP = Integer.parseInt(scanner.nextLine());
        System.out.println();

        Produto2 produto3 = new Produto2(nomeP, quantidadeP);

        System.out.println("Dados para atualizar produto:");

        System.out.print("Tipo do produto: ");
        tipoP = scanner.nextLine();

        System.out.print("Valor do produto: ");
        valorP = Double.parseDouble(scanner.nextLine());
        System.out.println();

        produto3.inserir(nomeP, quantidadeP, tipoP, valorP);

        System.out.println("Dados do produto: ");
        System.out.println(produto3);

        System.out.println("Dados produto 4: ");

        System.out.print("Nome do produto: ");
        nomeP = scanner.nextLine();

        System.out.print("Quantidade do produto: ");
        quantidadeP = Integer.parseInt(scanner.nextLine());

        System.out.print("Tipo do produto: ");
        tipoP = scanner.nextLine();

        System.out.print("Valor do produto: ");
        valorP = Double.parseDouble(scanner.nextLine());

        Produto2 produto4 = new Produto2(nomeP, quantidadeP, tipoP, valorP);

        System.out.println("Dados do produto: ");
        System.out.println(produto4);

        System.out.println(produto1);
        produto1.reestoque(15, 15.62);
        produto1.reestoque(12);
        produto1.venderP(12);
        produto1.igual(produto2);

        System.out.println();
        System.out.println(produto2);
        produto2.reestoque(10, 22.99);
        produto2.reestoque(2);
        produto2.venderP(32);
        produto2.igual(produto3);

        System.out.println();
        System.out.println(produto3);
        produto3.reestoque(13, 17.82);
        produto3.reestoque(7);
        produto3.venderP(20);
        produto3.igual(produto4);

        System.out.println();
        System.out.println(produto4);
        produto4.reestoque(20, 84.49);
        produto4.reestoque(1);
        produto4.venderP(9);
        produto4.igual(produto3);



        scanner.close();
    }



}