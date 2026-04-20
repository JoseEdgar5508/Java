package ex2;

import java.util.Scanner;

public class preco {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um preço de um produto.");
        double preco = scanner.nextDouble();

        if(preco < 50){
            System.out.println("Preço barato.");
        } else if(preco > 50  && preco <  100){
            System.out.println("Preço médio.");
        } else{
            System.out.println("Preço caro.");
        }

        scanner.close();
    }
}
