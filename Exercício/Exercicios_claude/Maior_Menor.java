package Exercício.Exercicios_claude;
import java.util.Scanner;
import java.util.Arrays;

public class Maior_Menor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Preencha um array com 6 números.");

        int[] array = new int[6];

        for(int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(array));

        int maior = array[0];
        int menor = array[0];

        for(int i = 0; i < array.length; i++){
            if(array[i] > maior){
                maior = array[i];
            }
            if(array[i] < menor){
                menor = array[i];
            }
        }

        System.out.println("Maior " + maior);
        System.out.println("Menor " + menor);

        scanner.close();
    }
}
