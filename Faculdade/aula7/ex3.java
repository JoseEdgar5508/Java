package Faculdade.aula7;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        if(idade >= 18){
            System.out.println("Você pode dirigir parabéns");
        }else{
            System.out.println("Você não pode dirigir.");
        }

        scanner.close();
    }
}
