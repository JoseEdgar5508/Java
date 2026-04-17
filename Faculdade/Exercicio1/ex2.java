package Faculdade.Exercicio1;
import java.util.Scanner;

public class ex2 {
    /* Crie um programa que leia dois números inteiros e exiba a soma entre eles.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digte dois numeros.");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma entre os números é " + soma);

        scanner.close();
    }
}
