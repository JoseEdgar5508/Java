package Ebook200exercícios.Capítulo2;
import java.util.Scanner;

/*Crie um programa que leia dois números inteiros do usuário e exiba a soma, subtração,
multiplicação, divisão e o módulo desses números no console. */

public class ex1 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números para ver as operações aritimeticas dele.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma é " + soma);

        int sub = num1 - num2;

        System.out.println("A subtração é " + sub);

        int mult = num1 * num2;

        System.out.println("A multiplicação é " + mult);

        int div = num1 / num2;

        System.out.println("A divisão é " + div);

        int mod = num1 % num2;

        System.out.println("O módulo é " + mod);

        scanner.close();

    }

}
