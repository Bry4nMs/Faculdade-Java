package Aplicacao;

import Entidade.Retangulo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[]args){


        Locale.setDefault (Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangulo retangulo = new Retangulo();

        System.out.println("Largura e altura: ");
        Retangulo.largura = sc.nextDouble();
        Retangulo.altura = sc.nextDouble();

        sc.nextLine();

        double area = retangulo.area();
        System.out.println("Area do retangulo:" + area);
        double perimetro = retangulo.perimetro();
        System.out.println("Perimetro do retangulo: " + perimetro);
        double diagonal = retangulo.diagonal();
        System.out.println("Diagonal do retangulo: "+ diagonal);



    }
}
