package Aplicacao;

import Entidades.Cursos;
import java.util.Scanner;

public class ExercLab1_2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            for (int i = 1; i <= 4; i++) {
                System.out.println("Nome do curso: ");
                String nome = sc.nextLine();

                System.out.println("Duração do curso: ");
                int duracao = sc.nextInt();
                sc.nextLine();

                System.out.println("Area do curso: ");
                String area = sc.nextLine();

                System.out.println("Turno do curso: ");
                String turno = sc.nextLine();

                Cursos curso = new Cursos(nome, duracao, area, turno);
                System.out.println(curso);
            }

        sc.close();
    }
}

