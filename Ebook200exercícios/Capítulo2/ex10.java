package Ebook200exercícios.Capítulo2;
/*Desenvolva um programa que exiba o valor de uma variável double com duas casas
decimais. Utilize formatação para garantir que o valor seja exibido corretamente. */

public class ex10 {
    public static void main(String[] args) {
        double num = 1.234556;

        System.out.printf("O núemro é %.2f", num);
    }
}
