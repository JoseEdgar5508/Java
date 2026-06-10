package Faculdade.Exercício3;
import java.util.Scanner;
/*4- Faça um programa que receba a idade de 10 pessoas e informa a maior idade. */

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a idade de 10 pessoas.");

        int idade;

        for(int i = 1; i <=10; i++){
            System.out.println("Digite a idade da pessoa número " + i + "º");
            idade = scanner.nextInt();

            if(idade > 18){
                System.out.println("O " + idade + " é maior de idade.");
            }
        }

        scanner.close();
    }
}
