package Faculdade.Exercício3;
import java.util.Scanner;
/*6- Faça um programa para receber do usuário, repetidamente, vários números inteiros;
cada número deve ser escrito no console e o processo se repete até que o número zero
seja digitado. */

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 1;

        do{
            System.out.println("Digite um número inteiro.");
            num = scanner.nextInt();
        }while(num != 0);

        System.out.println("Encerramos.");
        scanner.close();
    }
}
