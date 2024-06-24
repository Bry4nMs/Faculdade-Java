package Aplicação;

import java.util.Locale;
import java.util.Scanner;


public class Pensionato {
        public static void main(String[] args) {
            Locale.setDefault(Locale.US);
            Scanner sc = new Scanner(System.in);

            Rent[] vect = new Rent[10];
            int n;

            System.out.println("How many rooms will be rented?");
            n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                System.out.println("Rent #" + i);
                System.out.print("Name: ");
                sc.nextLine();
                String nomes = sc.nextLine();
                System.out.print("Email: ");
                String email = sc.nextLine();
                System.out.print("Room: ");
                int room = sc.nextInt();

                vect[room] = new Rent(nomes, email);
            }

            System.out.println("Busy rooms:");

            for (int i = 0; i < 10; i++) {
                if(vect[i] != null){
                    System.out.println(i + ": " + vect[i]);
                }

            }



            sc.close();
        }
}
