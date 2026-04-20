package EX_de_loops;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número para descobrir sua tabuada.");
        int numero = scanner.nextInt();

        System.out.println("A taubuado da multiplicação de " + numero + " é: ");
        
        for(int i = 0; i <= 10; i++){

            int resultado = numero * i;

            System.out.println(numero + " * " + i + " = " + resultado);

        }

        scanner.close();
    }
}
