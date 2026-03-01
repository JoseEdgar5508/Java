package ex2;

import java.util.Scanner;

public class senha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu usuário.");
        String usuario = scanner.nextLine();

        System.out.println("Digite sua senha.");
        int senha = scanner.nextInt();

        if (usuario.equals("admin") && senha == 123) {
            System.out.println("Acesso permitido.");
        } else {
            System.out.println("Acesso negado.");
        }

        scanner.close();
    }
}
