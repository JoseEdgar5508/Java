package Faculdade.Exercício2;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite dois números.");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Agora digite os numeros 1 para média, 2 para subtração, 3 para multiplicação e 4 para divisão.");
        int num3 = scanner.nextInt();

        switch (num3) {
            case 1:
                System.out.println("A meida entre é " + (num1 + num2) / 2);
                break;
            case 2:
                System.out.println("A subtração é " + Math.abs(num1 - num2));
                break;
            case 3:
                System.out.println("A multiplicação é " + (num1 * num2));
                break;
            case 4:
                System.out.println("A divisão é " + (num1 / num2));
                break;
            default:
                System.out.println("Digitou o número errado.");
                break;
        }

        scanner.close();
    }
}
