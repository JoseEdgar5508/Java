package Ebook200exercícios.Capítulo2;
import java.util.Scanner;

/*Escreva um programa que leia um número inteiro e um número decimal do teclado e, em
seguida, exiba a soma desses números no console.
Dica: utilize o pacote/classe Scanner. */

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro.");
        int num1 = scanner.nextInt();

        System.out.println("Digite um número decimal.");
        double num2 = scanner.nextDouble();

        int soma1 = (int) (num1 + num2);

        System.out.println("A soma é em inteiros " + soma1);

         double soma2 = num1 + num2;

        System.out.println("A soma em decimal é " + soma2);

        scanner.close();
    }
}
