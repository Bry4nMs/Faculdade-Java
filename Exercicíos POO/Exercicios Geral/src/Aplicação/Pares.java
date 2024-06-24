package Aplicação;

import java.util.Locale;
import java.util.Scanner;

public class Pares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, s;
        System.out.println("Número inicial: ");
        n = sc.nextInt();
        System.out.println("Número final: ");
        s = sc.nextInt();

        int quant= 0;
        int quantpares = 0;
        int soma = 0;
        double media = 0.0;

        for(int i = n; i <= s; i++){
            soma += i;
            quant++;
            if(i % 2 == 0){
                quantpares++;
            }
        }

        media = (double) soma / quant;


        System.out.println("Soma: "+ soma);
        System.out.println("Quantidade: "+ quant);
        System.out.println("Media: "+ media);
        System.out.println("Quantidade pares: "+ quantpares);
        sc.close();
    }
}