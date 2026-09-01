package Ebook200exercícios.Capítulo2;

/*
Desenvolva um programa que declare duas variáveis int e realize as operações de soma,
subtração, multiplicação, divisão e módulo entre elas. Exiba os resultados de cada
operação.
*/

public class ex5 {
    public static void main(String[] args) {
        int num1 = 12;

        int num2 = 6;

        int soma = num1 + num2;

        int subtracao = num1 - num2;

        int multiplicacao = num1 * num2;

        int divisao = num1 / num2;

        int modulo = num1 % num2;

        System.out.println("Soma de  12 + 6 é " + soma);

        System.out.println("A subtração 12 - 6 é " + subtracao);

        System.out.println("A multiplicação de 12 x 6 é " + multiplicacao);

        System.out.println("A divisão de 12 / 6 é " + divisao);

        System.out.println("O modulo de 12 % 6 é " + modulo);
    }
}
