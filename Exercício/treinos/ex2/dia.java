package ex2;
import java.util.Scanner;

public class dia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um dia da semana para saber se ele é dia util ou final de semana.");
        int dia = scanner.nextInt();

        switch (dia) {
            case 1:
                System.out.println("Domingo, final de semana.");
                break;
            case 2:
                System.out.println("Seguanda, dia util.");
                break;
            case 3:
                System.out.println("Terça, dia util.");
                break;
            case 4:
                System.out.println("Quarta, dia util.");
                break;
            case 5:
                System.out.println("Quinta, dia util.");
                break;
            case 6:
                System.out.println("Sexta, dia util.");
                break;
            case 7: 
                System.out.println("Sábado, final de semana.");
                break;
            default:
                System.out.println("Você digitou um número que não tem dia da semana correspondente.");
                break;
        }

        scanner.close();
    }
}
