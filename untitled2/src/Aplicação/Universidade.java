package Aplicação;

import Entidades.Curso;

import java.util.Locale;
import java.util.Scanner;

public class Universidade {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Quantidade de cursos: ");
        n = sc.nextInt();
        sc.nextLine();

        Curso[] cursos = new Curso[n];
        int i;

        for (i = 0; i < cursos.length; i++) {
            System.out.println("Digite o nome do curso: ");
            String nome = sc.nextLine();
            System.out.println("Digite a area do curso: ");
            String area = sc.nextLine();
            System.out.println("Digite o Instituto do curso: ");
            String instituto = sc.nextLine();
            System.out.println("Digite a duração do curso: ");
            Integer duracao = sc.nextInt();
            sc.nextLine();

            cursos [i] = new Curso(nome, area, instituto, duracao);
        }

        for (i = 0; i < cursos.length; i++) {
            System.out.println(i + 1 + " " + cursos[i].toString());
        }

        sc.close();
    }
}
