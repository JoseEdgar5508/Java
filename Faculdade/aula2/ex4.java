package Faculdade.aula2;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String fulano = scanner.nextLine();

        System.out.println("Boa noite " + fulano + ".");
        System.out.println("Você já é um mestre Pokemon?");

        scanner.close();
    }
}
