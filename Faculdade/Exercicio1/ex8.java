package Faculdade.Exercicio1;
import java.util.Scanner;

public class ex8 {
    /*Crie um programa que leia um valor em reais (R$) e converta para dólares,
considerando uma taxa de câmbio informada pelo usuário. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor em real que você quer converter?");
        double real = scanner.nextDouble();

        System.out.println("Diga a cotação do dólar.");
        double dolar = scanner.nextDouble();
        
        double resultado = real / dolar;

        System.out.printf("O valor R$%.2f em dólar é US$%.2f" , real, resultado);
        scanner.close();
    }
}
