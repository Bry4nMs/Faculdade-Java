package Aplicação;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Número de pessoas:");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Dados da "+ (i+1)+ "a pessoa");
            System.out.println("Nome: ");
            nomes[i] = sc.next();
            System.out.println("Idade: ");
            idades[i] = sc.nextInt();
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double alturaTotal = 0;
        int menores = 0;

        for (int i = 0; i < n; i++) {
            if(idades[i] < 18){
                menores++;
            }
            alturaTotal += alturas[i];
        }
        double alturaMedia = alturaTotal / n;
        double percentualMenores = ((double)menores / n) *100.0;

        System.out.printf("A média das alturas é %.2f", alturaMedia);
        System.out.printf("\nO percentual de menores é %.1f%%\n", percentualMenores);

        System.out.println("Pessoas menores de idade: ");
        for(int i = 0; i<n; i++){
            if(idades[i] < 18){
                System.out.printf("%s",nomes[i]);
            }
        }
        sc.close();
    }
}
