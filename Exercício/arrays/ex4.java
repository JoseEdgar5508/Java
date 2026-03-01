package arrays;
import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        int[] original = {3, 5, 7, 9, 10};

        int[] invertido = new int[original.length];

        for(int i = 0; i < original.length; i++){
            invertido[i] = original[original.length -1 -i];
        }

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(invertido));
    }
}
