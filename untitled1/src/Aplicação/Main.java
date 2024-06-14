package Aplicação;


import Conversor.Conversor;

import java.util.Locale;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Valor do dolar: ");
        double dolar = sc.nextDouble();

        System.out.print("Quantidade a ser comprada: ");
        double quant = sc.nextDouble();

        double a = Conversor.conversor(quant, dolar);

        System.out.printf("A quantidade a ser paga é: R$ %.2f\n", a);


        sc.close();
    }


}