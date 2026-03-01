package somatório;
import java.util.Scanner;

public class somar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para ver a sua tabuada.");
        int num = scanner.nextInt();

        int resultado;

        System.out.println("Tabuada do " + num);

        for(int i = 0; i <= 10; i++){

            resultado = num * i;

            System.out.println(num + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
