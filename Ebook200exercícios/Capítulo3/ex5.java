package Ebook200exercícios.Capítulo3;
import java.util.Scanner;
/*Exercício 15: Potenciação
Escreva um programa que leia dois números inteiros do usuário e exiba o resultado da
potenciação do primeiro número elevado ao segundo número (use o método Math.pow).
Dica: pow recebe dois argumentos, o primeiro a base e o segundo o expoente. */

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números para ver sua potenciação");
        int nun1 = scanner.nextInt();
        int nun2 = scanner.nextInt();

        System.out.println("A base " + nun1 + " elevado ao expoente " + nun2 + " é igual a " + Math.pow(nun1, nun2));

        scanner.close();
        
    }
}
