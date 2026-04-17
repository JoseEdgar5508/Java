package Faculdade.Exercicio1;
import java.util.Scanner;

public class ex1 {
    /*Escreva um programa que leia um número inteiro e exiba o seu antecessor e
sucessor. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver seu sucessor e seu antecessor.");
        int n1 = scanner.nextInt();

        int antecessor = n1 - 1;

        int sucessor = n1 + 1;

        System.out.println("O sucessor é " + sucessor + " e o antecessor é " + antecessor);

        scanner.close();
    }
}
