package Conversor_de_temperatura;

public class conversor {
    public static void main(String[] args) {
        
        double Fahrenheit = celsiusParaFahrenheit(20);

        System.out.println("A temperatura em fahrenheit é: " + Fahrenheit);
    }

    public static double celsiusParaFahrenheit( double celsius){

        return (celsius * 9/5) + 32;
    }
}
