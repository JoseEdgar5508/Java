package Faculdade.aula8;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String senha = "";

        while (!senha.equals("naodigo")) {
            System.out.println("Digite a senha:");
            senha = scanner.nextLine();

            if (!senha.equals("naodigo")) {
                System.out.println("Você não sabe a senha! =P");
            }
        }

        System.out.println("Senha correta! Bem-vindo!");

        scanner.close();
    }
}
