package Aplicacao;

import Entidades.Cursos;

import java.util.Scanner;

public class ExercLab1_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

            System.out.print("Quantidade de cursos: ");
            int quantia = sc.nextInt();
            sc.nextLine();

            Cursos[] cursos = new Cursos[quantia];

            for (int i = 1; i <= quantia; i++) {
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
            cursos[i - 1] = curso;
            }

            System.out.println("Dados dos cursos inseridos: ");
            for(Cursos curso : cursos){
                System.out.println(curso);
            }

        sc.close();
    }
}