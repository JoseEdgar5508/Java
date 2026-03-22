package Faculdade.aula2;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número.");
        int num = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um nome.");
        String nome = scanner.nextLine();

        System.out.println("Olá, você digitou " + num + " e " + nome);

        scanner.close();
    }
}
