package Faculdade.aula8;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 1;

        while (num != 0) {
            System.out.println("Digite um número (0 para sair).");
            num = scanner.nextInt();
            System.out.println("Número digitado: " + num);
        }

        System.out.println("Programa encerrado!");

        scanner.close();
    }
}
