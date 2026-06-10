package Faculdade.aula8;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int maior = 0;

        for(int i = 0; i <= 10; i++){
            System.out.println("Digite sua idade.");
            int idade = scanner.nextInt();

            if(idade > maior){
                maior = idade;
            }
        }

        System.out.println("A maior de idade é o de " + maior + " anos");

        scanner.close();
    }
}
