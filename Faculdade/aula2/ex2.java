package Faculdade.aula2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu ano de nascimento?");
        int ano = scanner.nextInt();

        int idade = 2026 - ano;

        System.out.println("Você nasceu em " + idade);

        scanner.close();
    }
}
