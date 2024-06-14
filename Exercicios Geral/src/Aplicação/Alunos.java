package Aplicação;

import java.util.Locale;
import java.util.Scanner;

public class Alunos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Quantidade de alunos: ");
        x = sc.nextInt();
        sc.nextLine();

        String lista = "";
        for (int i = 0; i < x; i++) {
            System.out.println("Nome do aluno: ");
            String nome = sc.nextLine();
            System.out.println("Matricula do aluno: ");
            String matricula = sc.nextLine();

            lista += matricula + " - "+ nome + "\n";

        }
        System.out.println("Dados dos alunos: ");
        System.out.println(lista);
    }
}
