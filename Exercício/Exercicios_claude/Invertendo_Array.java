package Exercício.Exercicios_claude;
import java.util.Scanner;
import java.util.Arrays;

public class Invertendo_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] normal = new int[5];

        System.out.println("Digite 5 números.");
        normal[0] = scanner.nextInt();
        normal[1] = scanner.nextInt();
        normal[2] = scanner.nextInt();
        normal[3] = scanner.nextInt();
        normal[4] = scanner.nextInt();

        System.out.println(Arrays.toString(normal));

        int[] invertido = new int[normal.length];

        for(int i = 0; i < normal.length; i++){
            invertido[i] = normal[normal.length - 1 -i];
        }

        System.out.println(Arrays.toString(invertido));

        scanner.close();
    }
}
