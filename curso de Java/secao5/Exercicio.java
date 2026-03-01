package secao5;

import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // EX 1-
        System.out.println("Digite um preço de um produto.");
        double preco = scanner.nextDouble();

        if(preco < 50){
            System.out.println("Preço barato.");
        }
        else if(preco > 50 && preco < 100){
            System.out.println("Preço médio.");
        }
        else{
            System.out.println("Preço caro.");
        }

        scanner.nextLine();

        // EX 2-
        System.out.println("Digite um nome de usário e uma senha.");
        String usuario = scanner.nextLine();
        String senha = scanner.nextLine();

        if(usuario.equals("admin") && senha.equals("123")){
            System.out.println("Acesso permitido.");
        }else{
            System.out.println("Acesso negado.");
        }

        // EX 3-
        System.out.println("Digite um número.");
        int num = scanner.nextInt();

        String resultado;

        if(num % 2 == 0){
            resultado = "Par";
        }else{
            resultado = "Ímpar";
        }

        System.out.println("O número é " + resultado);

        // EX 4-
        System.out.println("Digte um número de 1 a 7 onde cada um representa um dia da semana.");
        int num2 = scanner.nextInt();

        switch (num2) {
            case 1:
                System.out.println("Domingo, final de semana.");
                break;
            case 2:
                System.out.println("Segunda, dia útil.");
                break;
            case 3:
                System.out.println("Terça, dia últil");
                break;
            case 4:
                System.out.println("Quarta, dia últil");
                break;
            case 5: 
                System.out.println("Quinta, dia últil");
                break;
            case 6:
                System.out.println("Sexta, dia últil");
                break;
            case 7: 
                System.out.println("Sábado, final de samana");        
            default:
                System.out.println("Digita um número de 1 a 7");
                break;
        }

        System.out.println("Digte um numero.");
        int num3 = scanner.nextInt();

        if(num3 > 10 && num3 < 20){
            System.out.println("O núemro está no intervalo entre 10 e 20.");
        }else{
            System.out.println("O núemro não está no intervalo entre 10 e 20.");
        }

        System.out.println("Digite uma letra.");
        char letra = scanner.next().toLowerCase().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal.");
                break;
            default:
                System.out.println("Consoante.");
                break;
        }
        scanner.close();
    }
}
