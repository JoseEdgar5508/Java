package Faculdade.Exercício3;
import java.util.Scanner;
/*7- Faça um programa que sempre repetirá a frase "Você não sabe a senha! =P"
enquanto o usuário não digitar a senha "naodigo". */

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha = "";

        do{
            System.out.println("Você não sabe a senha! =P\nDigite a senha:");
            senha = scanner.nextLine();

        }while(!senha.equals("naodigo"));

        System.out.println("Digitou a senha correta.");

        scanner.close();
    }
}
