package Aplicação;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] vetor = new int[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um valor: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Valores");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i]+"\n");
        }

        double soma = 0;

        for (int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.println(soma);

        double media = soma / n;

        System.out.printf("%.2f", media);

        sc.close();
    }
}
