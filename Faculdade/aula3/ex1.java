package Faculdade.aula3;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final double SALARIO = 937.00;

        System.out.println("Digite seu sálario.");
        double quantidade = scanner.nextDouble();

        System.out.println("A diferença do seu sálario para o mínimo é: " + (SALARIO - quantidade));

        scanner.close();
    }
}
