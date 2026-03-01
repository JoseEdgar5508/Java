package matriz;
import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        int [][] matriz = {
            {1, 2},
            {3, 4}
        };

        for(int[] lista: matriz){
            System.out.println(Arrays.toString(lista));
        }
    }
}
