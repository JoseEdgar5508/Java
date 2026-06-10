package Faculdade.aula6;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite a nota de 3 alunos.");
        String nota1 = scanner.nextLine();
        String nota2 = scanner.nextLine();
        String nota3 = scanner.nextLine();

        double n1 = Double.parseDouble(nota1);
        double n2 = Double.parseDouble(nota2);
        double n3 = Double.parseDouble(nota3);

        Double nota = (n1 + n2 + n3) / 3;

        System.out.printf("A média das nota são: %.2f", nota);

        scanner.close();
    }
}
