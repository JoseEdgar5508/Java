package Faculdade.Exercicio;
import java.util.Scanner;

public class ex5 {
    /*Crie um programa que leia um número inteiro e informe se ele é par ou ímpar. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dite um número para ver se ele é par ou impar.");
        int num = scanner.nextInt();

        if(num % 2 == 0){
            System.out.println("Número par.");
        }else{
            System.out.println("Número ímpar.");
        }

        scanner.close();
    }
}
