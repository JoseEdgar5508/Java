package Faculdade.Exercicio;
import java.util.Scanner;

public class ex9 {
    /*Desenvolva um programa que leia a idade de uma pessoa e utilize uma estrutura
de decisão para classificá-la nas seguintes categorias: criança (0 a 12 anos),
adolescente (13 a 17 anos), adulto (18 a 59 anos) e idoso (60 anos ou mais). */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade.");
        int idade = scanner.nextInt();

        if(idade >= 0 && idade <= 12){
            System.out.println("Criança.");
        }else if(idade >= 13 && idade <= 17){
            System.out.println("Adolecente.");
        }else if(idade >= 18 && idade <=59){
            System.out.println("Adulto.");
        }else{
            System.out.println("Idoso.");
        }

        scanner.close();
    }
}
