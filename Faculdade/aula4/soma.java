package Faculdade.aula4;
import java.util.Scanner;

public class soma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número:");
        int num1 = scanner.nextInt();

        System.out.println("Digte outro número:");
        int num2 = scanner.nextInt();

        System.out.println("A soma dos números é " + (num1 + num2));
        System.out.println("A difrença dos números é " + Math.abs(num1 - num2));

        scanner.close();
    }
}
