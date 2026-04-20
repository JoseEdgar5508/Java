package arrays;
import java.util.Arrays;

public class ex13 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};

        int[] invertido = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i]; 
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(invertido));
    }
}
