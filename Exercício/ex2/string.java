package ex2;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para saber se é par ou impar.");
        int num = scanner.nextInt();

        String resultado = "";


        if(num % 2 == 0){
            resultado = "Par.";
        } else{
            resultado = "ímpar.";
        }
        
        System.out.println("O número é: " + resultado);

        scanner.close();
    }
}
