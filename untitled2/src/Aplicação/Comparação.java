package Aplicação;

import java.util.Locale;
import java.util.Scanner;

public class Comparação {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            int x, y, z;
            System.out.println("Digite os valores: ");
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();

            int maior;
            if(x > y){
                maior = x;
                x = y;
                y = maior;
            }
            else if(x > z ){
                maior = x;
                x = z;
                z = maior;
            }
            else if(z > y ){
                maior = z;
                z = y;
                y = maior;
            }
            System.out.println("Números em ordem crescente: ");
            System.out.println(x + " - " + y + " - " + z);

            sc.close();
        }
}
