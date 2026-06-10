package Faculdade.aula9;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] X = new int[5];
        int[] Y = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - Digite um valor:");
            X[i] = scanner.nextInt();
            Y[i] = X[i] / 2;
        }

        System.out.println("Vetor X");
        for (int i = 0; i < 5; i++) {
            System.out.print(X[i] + " ");
        }

        System.out.println("\nVetor Y");
        for (int i = 0; i < 5; i++) {
            System.out.print(Y[i] + " ");
        }

        scanner.close();
    }
}
