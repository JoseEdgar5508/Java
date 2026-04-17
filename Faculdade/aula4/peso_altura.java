package Faculdade.aula4;
import java.util.Locale;
import java.util.Scanner;

public class peso_altura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso.");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura.");
        double altura = scanner.nextDouble();

        System.out.println("Seu peso é: " + peso + "sua altura é " + altura);

        scanner.close();
    }
}
