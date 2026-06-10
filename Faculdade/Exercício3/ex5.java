package Faculdade.Exercício3;
import java.util.Scanner;
/*5- Escreva um programa em Java para ler um valor inicial A e imprimir a sequência
de valores do cálculo de A! (fatorial) e o seu resultado. */

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para a gente ver o seu fatorial.");
        int num = scanner.nextInt();
        int fatorial = 1;

        for(int i = 1; i <= num; i++){
            fatorial *= i;
            System.out.println(num + "! parcial: " + fatorial);
        }

        System.out.println("Resultado: " + num + "! = " + fatorial);
        scanner.close();
    }
}
