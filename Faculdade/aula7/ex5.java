package Faculdade.aula7;
import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua media");
        int media = scanner.nextInt();

        if(media >= 7){
            System.out.println("Passou.");
        }else if(media >= 5 && media < 7){
            System.out.println("Na recuperação.");
        }else{
            System.out.println("Reprovado.");
        }

        scanner.close();
    }
}
