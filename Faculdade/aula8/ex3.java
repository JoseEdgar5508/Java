package Faculdade.aula8;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Digite um número.");
            int num = scanner.nextInt();

            soma += num;

        }

        int media = soma / 10;

        System.out.println("Média: " + media);

        scanner.close();
    }
}
