package Ebook200exercícios.Capítulo3;
import java.util.Scanner;

/*Exercício 13: Área de um Retângulo
Desenvolva um programa que leia a largura e a altura de um retângulo e calcule a área.
Exiba o resultado no console.
Dica: area = largura x altura. */
public class ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a largura de um retângulo:");
        int largura = scanner.nextInt();
        
        System.out.println("Digite a altura de um retângulo:");
        int altura = scanner.nextInt();

        int area = largura * altura;

        System.out.println("A área é: " + area);

        scanner.close();
    }
    
}