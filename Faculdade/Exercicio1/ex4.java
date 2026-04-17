package Faculdade.Exercicio1;
import java.util.Scanner;

public class ex4 {
    /*Faça um programa que leia uma temperatura em graus Celsius e converta para
Fahrenheit. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a a temperatura em Celsius.");
        double temperatura = scanner.nextDouble();

        double Fahrenheit = (temperatura * 1.8) + 32;

        System.out.printf("A temperatura em Fahrenheit é %.2f.", Fahrenheit);
        scanner.close();
    }
}
