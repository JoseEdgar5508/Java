package ex2;
import java.util.Scanner;

public class intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira um número.");
        int num = scanner.nextInt();

        if(num >= 10 && num <= 20){
            System.out.println("Dentro do interfalo.");
        } else{
            System.out.println("Fora do intervalo.");
        }

        scanner.close();
    }
}
