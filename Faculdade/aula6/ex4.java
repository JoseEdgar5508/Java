package Faculdade.aula6;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o valor do produto?");
        String valor = scanner.nextLine();

        System.out.println("Quanto o cliente pagou?");
        String pago = scanner.nextLine();

        double valor_double = Double.parseDouble(valor);
        double pago_double = Double.parseDouble(pago);

        double troco = pago_double - valor_double;

        System.out.println("Preço do produto $ " + valor_double + " | " + "Valor recebido $ " + pago_double + " | " + "Valor troco $ " + troco);

        scanner.close();
    }
}
