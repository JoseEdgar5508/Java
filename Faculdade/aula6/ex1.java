package Faculdade.aula6;
import java.util.Scanner;
/*Faça um programa que recebe dois números 
digitados pelo usuário e calcule a soma, subtração, 
multiplicação e divisão entre os números.
Exiba as respostas no final do processamento. */

public class ex1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número.");
        int num1 = scanner.nextInt();

        System.out.println("Digite outro número.");
        int num2 = scanner.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma é " + soma);

        int sub = num1 - num2;

        System.out.println("A subtração é " + sub);

        int mult = num1 * num2;

        System.out.println("A multiplicação é " + mult);

        int div = num1 / num2;

        System.out.println("A divisão é " + div);

        scanner.close();
    }
}
