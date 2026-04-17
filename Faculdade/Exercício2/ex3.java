package Faculdade.Exercício2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Equação do 2º Grau: ax² + bx + c = 0 ===");
        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        System.out.println("\nDelta (Δ) = " + delta);

        if (delta >= 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);

            System.out.println("x' = " + x1);
            System.out.println("x'' = " + x2);
        } else {
            System.out.println("A equação não possui soluções reais.");
        }

        scanner.close();
    }
}