package Faculdade.Exercício3;
import java.util.Scanner;
/*3- Escreva um programa em Java que recebe 10 números do usuário e em seguida
calcula e exibe a média dos números. */

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dez números:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int num6 = scanner.nextInt();
        int num7 = scanner.nextInt();
        int num8 = scanner.nextInt();
        int num9 = scanner.nextInt();
        int num10 = scanner.nextInt();

        System.out.println("Agora vamos dar a média.");

        int media = (num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10)/10;

        System.out.println("A media é " + media + ".");

        scanner.close();
    }
}
