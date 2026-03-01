package ex2;
import java.util.Scanner;

public class letra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma letra.");
        char letra = scanner.next().charAt(0);

        if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
            System.out.println("Vogal.");
        } else{
            System.out.println("Consoante.");
        }

    scanner.close();
    }
}
