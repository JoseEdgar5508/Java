package Faculdade.Exercicio;
import java.util.Scanner;

public class ex6 {
    /*Elabore um programa que leia o salário de um funcionário e aplique um bônus de
10%, exibindo o novo salário. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digte seu sálario.");
        double salario = scanner.nextDouble();

        double salarioAtual = salario * 1.1;

        System.out.println("O seu novo sálario é " + salarioAtual);

        scanner.close();
    }
}
