package Faculdade.aula7;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número.");
        int num = scanner.nextInt();

        if(num > 0){
            System.out.println("Número positivo.");
        }else if(num < 0){
            System.out.println("Número é negativo.");
        }else{
            System.out.println("Igual a zero.");
        }

        scanner.close();
    }
}
