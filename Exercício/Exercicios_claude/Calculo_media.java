package Exercício.Exercicios_claude;
import java.util.Scanner;

public class Calculo_media {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digete 3 notas.");
        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Nota 1:" + nota1);
        System.out.println("Nota 2:" + nota2);
        System.out.println("Nota 3:" + nota3);
        System.out.println("Media é:" + media);

        if(media <= 10 && media >= 7){
            System.out.println("Aprovado.");
        } else if(media >= 5 && media <= 6.9){
            System.out.println("Recuperação.");
        } else if(media < 5 && media >= 0){
            System.out.println("Reprovado.");
        } else{
            System.out.println("Você digitou uma nota não valida. ");
        }

        scanner.close();
    }
}
