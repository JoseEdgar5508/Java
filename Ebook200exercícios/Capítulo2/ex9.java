package Ebook200exercícios.Capítulo1;


/*Escreva um programa que declare variáveis locais e globais (dentro de uma classe).
Inicialize e exiba o valor de ambas as variáveis no console.
Dica: as variáveis globais ficam fora do método main. */

public class ex9 {

    static int variavelGlobal = 5;
    public static void main(String[] args) {
        int variavelLocal = 6;

        System.out.println("A variável global é " + variavelGlobal);

        System.out.println("A variável local é " + variavelLocal);
    }
}
