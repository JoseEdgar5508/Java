package Contador;
import java.util.Scanner;

public class contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contadorPares = 0;
        int num;

        while (true) {
            System.out.print("Digite um número (0 para sair): ");
            num = scanner.nextInt();
            
            if (num == 0) {
                break;
            }
            
            if (num % 2 == 0) {
                contadorPares++;
            }
        }
        
        System.out.println("Você digitou " + contadorPares + " números pares.");
        
        scanner.close();
    }
}
