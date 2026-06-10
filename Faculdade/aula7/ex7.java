package Faculdade.aula7;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome.");
        String nome = scanner.nextLine();

        System.out.println("Digite outro nome.");
        String nome2 = scanner.nextLine();

        System.out.println("Digite um terceiro nome.");
        String nome3 = scanner.nextLine();

        String maior;

        if (nome.compareTo(nome2) > 0) {
            maior = nome;
        } else {
            maior = nome2;
        }

        if (maior.compareTo(nome3) < 0) {
            maior = nome3;
        }

        System.out.println("O maior nome alfabeticamente é: " + maior);

        scanner.close();
    }
}
