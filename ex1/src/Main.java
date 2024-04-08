import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

    Scanner sc = new Scanner(System.in);

    double A, B, C;
    double pi = 3.14159;

    A = sc.nextDouble();
    B = sc.nextDouble();
    C = sc.nextDouble();

    double areatri = A * C/2;
    double areacir = pi * Math.pow(C,2);
    double areatra = (A+B)*C / 2;
    double areaqua = Math.pow(B,2);
    double arearet = A*B;

    System.out.printf("Triangulo: %.3f\n", areatri);
        System.out.printf("Circulo: %.3f\n ", areacir);
        System.out.printf("Trapezio: %.3f\n ", areatra);
        System.out.printf("Quadrado: %.3f\n ", areaqua);
        System.out.printf("Retangulo: %.3f\n ", arearet);

    sc.close();
    }
}