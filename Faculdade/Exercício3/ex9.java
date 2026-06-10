package Faculdade.Exercício3;
import java.util.Scanner;
/*9- Faça um programa que repita as seguintes instruções: receber dois números; exibir
a soma, subtração, multiplicação e divisão entre eles; e perguntar se o usuário deseja
continuar ou digitar "não" para encerrar. */

public class ex9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String continuar;

        do {
            System.out.print("Digite o primeiro número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = scanner.nextDouble();

            System.out.println("\n=== Resultados ===");
            System.out.println("Soma:           " + (num1 + num2));
            System.out.println("Subtração:      " + (num1 - num2));
            System.out.println("Multiplicação:  " + (num1 * num2));

            if (num2 != 0) {
                System.out.println("Divisão:        " + (num1 / num2));
            } else {
                System.out.println("Divisão:        Impossível dividir por zero!");
            }

            System.out.print("\nDeseja continuar? (não para encerrar): ");
            scanner.nextLine(); // limpa o buffer
            continuar = scanner.nextLine();

        } while (!continuar.equalsIgnoreCase("não"));

        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
