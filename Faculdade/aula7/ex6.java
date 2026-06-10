package Faculdade.aula7;
import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome.");
        String nome = scanner.nextLine();

        if(nome.equals("Seiya"))System.out.println("Costelação: Pégasus");
        else if(nome.equals("Hyoga"))System.out.println("Costelação: Cisne");
        else if(nome.equals("Shiryu"))System.out.println("Costelação: Dragão");
        else if(nome.equals("Shun"))System.out.println("Costelação: Andromeda");
        else if(nome.equals("Ikki"))System.out.println("Costelação: Fenix");
        else System.out.println("Cavalheiro desconhecido.");

        scanner.close();
    }
}
