package Ebook200exercícios.Capítulo3;
import java.util.Scanner;

/**
 * Exercício 14: Conversão de Temperatura
Crie um programa que converta uma temperatura em graus Celsius para Fahrenheit. A
fórmula de conversão é: F = (C * 9/5) + 32. Exiba o resultado no console.
 */
public class ex4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma temperatura em Celsius:");
        double c = scanner.nextDouble();

        double f = (c * 9/5) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + f);

        scanner.close();
        
    }
    
}