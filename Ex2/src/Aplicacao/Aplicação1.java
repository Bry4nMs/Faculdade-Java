package Aplicacao;

import Entidades.Produto;

import java.util.Locale;
import java.util.Scanner;

public class Aplicação1 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);



        System.out.println("Insira os dados produto 1:");

        System.out.print("Codigo do produto 1: ");
        int codigoP = Integer.parseInt(scanner.nextLine());
        System.out.println();

        Produto produto1 = new Produto(codigoP);

        System.out.println("Dados para atualizar produto 1: ");

        System.out.print("Nome do produto 1: ");
        String nomeP = scanner.nextLine();

        System.out.print("Quantidade do produto 1: ");
        int quantidadeP = Integer.parseInt(scanner.nextLine());

        System.out.print("Tipo do produto 1: ");
        String tipoP = scanner.nextLine();

        System.out.print("Valor do produto 1: ");
        Double valorP = Double.parseDouble(scanner.nextLine());
        System.out.println();

        produto1.inserir(nomeP, quantidadeP, tipoP, valorP);

        System.out.println("Dados do produto 1");
        System.out.println(produto1);

        System.out.println("Insira dados produto 2:");

        System.out.print("Codigo do produto 2: ");
        codigoP = Integer.parseInt(scanner.nextLine());

        System.out.print("Nome do produto 2: ");
        nomeP = scanner.nextLine();
        System.out.println();

        Produto produto2 = new Produto(codigoP, nomeP);

        System.out.println("Dados para atualizar produto 2:");

        System.out.print("Quantidade do produto 2: ");
        quantidadeP = Integer.parseInt(scanner.nextLine());

        System.out.print("Tipo do produto 2: ");
        tipoP = scanner.nextLine();

        System.out.print("Valor do produto 2: ");
        valorP = Double.parseDouble(scanner.nextLine());
        System.out.println();

        produto2.inserir(nomeP, quantidadeP, tipoP, valorP);

        System.out.println("Dados do produto 2: ");
        System.out.println(produto2);

        System.out.println("Insira dados produto 3");

        System.out.print("Codigo do produto 3: ");
        codigoP = Integer.parseInt(scanner.nextLine());

        System.out.print("Nome do produto 3: ");
        nomeP = scanner.nextLine();

        System.out.print("Quantidade do produto 3: ");
        quantidadeP = Integer.parseInt(scanner.nextLine());
        System.out.println();

        Produto produto3 = new Produto(codigoP, nomeP, quantidadeP);

        System.out.println("Dados para atualizar produto 3:");

        System.out.print("Tipo do produto 3: ");
        tipoP = scanner.nextLine();

        System.out.print("Valor do produto 3: ");
        valorP = Double.parseDouble(scanner.nextLine());
        System.out.println();

        produto3.inserir(nomeP, quantidadeP, tipoP, valorP);

        System.out.println("Dados do produto 3: ");
        System.out.println(produto3);

        System.out.println("Insira dados produto 4: ");

        System.out.print("Codigo do produto 4: ");
        codigoP = Integer.parseInt(scanner.nextLine());

        System.out.print("Nome do produto 4: ");
        nomeP = scanner.nextLine();

        System.out.print("Quantidade do produto 4: ");
        quantidadeP = Integer.parseInt(scanner.nextLine());

        System.out.print("Tipo do produto 4: ");
        tipoP = scanner.nextLine();

        System.out.print("Valor do produto 4: ");
        valorP = Double.parseDouble(scanner.nextLine());

        Produto produto4 = new Produto(codigoP, nomeP, quantidadeP, tipoP, valorP);

        System.out.println();
        System.out.println("Dados do produto 4: ");
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
