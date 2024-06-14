package Aplicação;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Quantos números serão analisados?");
        n = sc.nextInt();

        int[] vect = new int[n];
        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("Números negativos");

        for (int i = 0; i < vect.length; i++) {
            if(vect[i] < 0){
                System.out.print(vect[i]+ "\n");
            }
        }
        sc.close();
    }
}