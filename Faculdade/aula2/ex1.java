package Faculdade.aula2;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga o seu nome.");
        String nome = scanner.nextLine();

        System.out.println("Seu nome é " + nome);

        scanner.close();
    }
}
