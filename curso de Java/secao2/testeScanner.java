package secao2;

import java.util.Scanner;

public class testeScanner {
    public static void main(String[] args) {
        
        // testando Sacanner
        
        Scanner scanner = new Scanner(System.in);

        // Mensagem para o úsuario saiba o que tem que digitar
        System.out.println("Digite o seu nome: ");

        // Resgata o valor no terminal
        String nome = scanner.nextLine();

        // Exibe o valor
        System.out.println("Olá " + nome + "!");

        // nextInt
        System.out.println("Digite um número:");

        int num = scanner.nextInt();

        System.out.println(num);

        // 2- problema do nextLine
        System.out.println("Digite um número.");
        int n = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Digite um texto: ");
        String texto = scanner.nextLine();

        System.out.println("Os dados são n= " + n + " e texto= " + texto);

        // fechamento do Scanner para evitar memory leak
        scanner.close();

    }
}
