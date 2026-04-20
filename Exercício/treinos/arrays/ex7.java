package arrays;
import java.util.Arrays;

public class ex7 {
    public static void main(String[] args) {
        int [] numeros = {1, 2, 3, 4, 5};

        int [] numerosInvertidos = new int[numeros.length];

        for(int i = 0; i < numeros.length; i++){
            numerosInvertidos[i] = numeros[numeros.length - 1 -i];
        }

        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(numerosInvertidos));
    }
}
