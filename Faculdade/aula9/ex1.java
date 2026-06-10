package Faculdade.aula9;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[5];
        int[] B = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " - Digite um valor:");
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            B[i] = A[i] * A[i];
        }

        System.out.println("Vetor A");
        for (int i = 0; i < 5; i++) {
            System.out.print(A[i] + " ");
        }

        System.out.println("\nVetor B");
        for (int i = 0; i < 5; i++) {
            System.out.print(B[i] + " ");
        }

        scanner.close();
    }
}
