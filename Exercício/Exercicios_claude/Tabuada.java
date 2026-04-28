package Exercício.Exercicios_claude;
import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver sua tabuada.");
        int num = scanner.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }

        scanner.close();
    }
}
