package EX_de_loops;
import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma palavra: ");
        String palavra = scanner.nextLine();

        int contadorVogais = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' ||
                letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contadorVogais++;
            }
        }

        System.out.println("Quantidade de vogais: " + contadorVogais);

        scanner.close();
    }
}

