package Faculdade.Exercicio;
import java.util.Scanner;

public class ex3 {
    /*Desenvolva um programa que leia três notas (double) e calcule a média do aluno,
exibindo o resultado com duas casas decimais. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três notas.");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double nota = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média das notas é " + nota);

        scanner.close();
    }
}
