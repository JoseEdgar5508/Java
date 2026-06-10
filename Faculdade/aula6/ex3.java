package Faculdade.aula6;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Qual o valor de uma hora trabalhada?");
        String hora = scanner.nextLine();

        System.out.println("Quantas horas você trabalhou esse mês?");
        String horas_mes = scanner.nextLine();

        double tempo = Double.parseDouble(hora);
        double tempo_mes = Double.parseDouble(horas_mes);

        double salario = tempo * tempo_mes;

        System.out.println("Nome do funcionário: " + nome);
        System.out.println("Valor da hora: " + hora + " | " + "Horas trabalhadas " + horas_mes + " | " + " Salário " + salario);

        scanner.close();
    }
}
