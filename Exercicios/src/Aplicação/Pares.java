package Aplicação;

import java.util.Locale;
import java.util.Scanner;

public class Pares {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int n;
            System.out.println("Quantidade de números que serão analisados:");
            n = sc.nextInt();

            int[] vetor = new int[n];
            for (int i = 0; i < vetor.length; i++) {
                System.out.print("Digite um número: ");
                vetor[i] = sc.nextInt();
            }

            int qtdPares = 0;
            for (int i = 0; i < vetor.length; i++) {
                if(vetor[i] % 2 == 0) {
                    System.out.print(vetor[i] + " - ");
                    qtdPares++;
                }
            }

            System.out.printf("\nExistem %d números par ", qtdPares);

            sc.close();
        }
}
