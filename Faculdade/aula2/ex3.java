package Faculdade.aula2;
import java.time.LocalDate;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Diga seu ano de nascimento.");
        int ano = scanner.nextInt();

        int idade = dataAtual.getYear() - ano;

        System.out.println("Seu ano de nascimeto é " + idade);

        scanner.close();
    }
}
