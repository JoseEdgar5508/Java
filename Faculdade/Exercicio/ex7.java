package Faculdade.Exercicio;
import java.util.Scanner;
import java.time.LocalDate;

public class ex7 {
    /*Desenvolva um programa que leia o ano de nascimento do usuário e utilize a
classe LocalDate para obter o ano atual e calcular a idade. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento.");
        int ano = scanner.nextInt();

        LocalDate dataAtual = LocalDate.now();

        int idade = dataAtual.getYear() - ano;

        System.out.println("Você tem " + idade + " anos.");

        scanner.close();
    }
}
