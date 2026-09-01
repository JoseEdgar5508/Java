package Ebook200exercícios.Capítulo1;
import java.util.Scanner;
/*Crie um programa que peça ao usuário para digitar seu nome e sobrenome. O programa
deve exibir uma mensagem de boas-vindas concatenando o nome e o sobrenome do
usuário. */

public class ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digte o seu nome.");
        String nome = scanner.nextLine();

        System.out.println("Digte o seu sobrenome.");
        String sobrenome = scanner.nextLine();

        String nomeCompleto = nome + " " + sobrenome;

        System.out.println("Seja bem vindo " + nomeCompleto + "!");

        scanner.close();
    }
}
