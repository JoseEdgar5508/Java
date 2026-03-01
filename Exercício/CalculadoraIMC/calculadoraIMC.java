package CalculadoraIMC;
import java.util.Scanner;

public class calculadoraIMC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Vamos calcular seu IMC.");

        System.out.println("Diga seu peso em kg.");
        double peso = scanner.nextDouble();

        System.out.println("Diga sua altura em m.");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: "+imc);

        if(imc < 18.5){
            System.out.println("Abaixo do peso.");
        }else if(imc >= 18.5 && imc <= 24.9 ){
            System.out.println("Peso normal.");
        }else if(imc >= 25 && imc < 29.9){
            System.out.println("Acima do peso.");
        }else{
            System.out.println("Obsidade.");
        }

        scanner.close();
    }
}
