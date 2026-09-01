package Ebook200exercícios.Capítulo3;
import java.util.Scanner;
/*Escreva um programa que leia três números inteiros do usuário e calcule a média aritmética
deles. Exiba o resultado no console.
Dica: Sempre que os exercícios pedirem para ‘ler’ algo, você deve utilizar a classe Scanner. */

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite três núemeros para calcular a média.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int media = (num1 + num2 + num3) / 3;

        System.out.println("A media é " + media);

        scanner.close();
    }
}
