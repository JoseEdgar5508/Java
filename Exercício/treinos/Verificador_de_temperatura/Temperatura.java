package Verificador_de_temperatura;
import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Você quer converter Celsius ou Fahrenheit?");
        System.out.print("Digite (C para Celsius / F para Fahrenheit): ");
        String opcao = scanner.next();

        if(opcao.equalsIgnoreCase("F")){
            System.out.print("Digite a temperatura em Fahrenheit: ");
            double f = scanner.nextDouble();
            double resultado = celsius(f);
            System.out.println(f + "°F = " + resultado + "°C");
        }
        else if(opcao.equalsIgnoreCase("C")){
            System.out.print("Digite a temperatura em Celsius: ");
            double c = scanner.nextDouble();
            double resultado = fahrenheit(c);
            System.out.println(c + "°C = " + resultado + "°F");
        }
        else{
            System.out.println("Opção inválida!");
        }

        scanner.close();
    }

    public static double fahrenheit(double c){   
        return (c * 9 / 5) + 32;
    }

    public static double celsius(double f){
        return (f - 32) * 5 / 9;
    }
}
