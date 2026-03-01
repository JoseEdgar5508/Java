package secao11;

import java.util.Scanner;

public class Exercício {
    public static void main(String[] args) {
        // 1- somar de um a cem

        int soma = 0;

        for(int i = 1; i <= 100; i++){
            soma += i;
        }

        System.out.println("A soma dos números 1 a 100 é: " + soma);

        System.out.println("--------------------------------------");

        // 2- Impresão de números pares com while

        int i = 0;

        while (i <= 20) {
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
        System.out.println("--------------------------------------");

        // 3- verificação de número primo com for

        Scanner scaner = new Scanner(System.in);

        System.out.println("Digite um número para vermos se ele é primo.");
        int numPrimo = scaner.nextInt();

        Boolean ePrimo = true;

        // testar se ele é primo mesmo

        for(int j = 2; j < numPrimo; j++){

            // dividir esse cara e não ter resto, ele não é primo
            // 1 e por ele mesmo

            if(numPrimo % j == 0){
                ePrimo = false;
                break;
            }

        }

        if(ePrimo){
            System.out.println("O numero " + numPrimo + " é primo.");
        }else{
            System.out.println("O numero " + numPrimo + "  NÃO é primo.");
        }

        System.out.println("-------------------------------------");

        // 4- Menu interativo com do-while

        int opcao;

        do{

            System.out.println("Exercício 4- menu.");
            System.out.println("1) Hambuguer.");
            System.out.println("2) cachorro quante.");
            System.out.println("3) Sushi.");
            System.out.println("4) Sair.");

            opcao = (int)(Math.random()*5);

            System.out.println("A opeção escolhida foi: " + opcao);

        }while(opcao != 4);

        System.out.println("------------------------------------");

        // 5- Fatorial de um núemro com for

        int numFatorial = 5;
        int fatorial = 1;

        for(int g = 1; g <= numFatorial; g++){
            fatorial *= g;
        }

        System.out.println("O afatorial de " + numFatorial + " é igual a " + fatorial);

        System.out.println("--------------------------------------");

        // 6- Contagem de digitos de um número com while

        int numParaContar = 1000;

        int contador = 0;

        while (numParaContar != 0) {

            numParaContar = numParaContar /10;

            contador++;
            
        }

        System.out.println("Número de dígitos " + contador);

        scaner.close();
    }
}
