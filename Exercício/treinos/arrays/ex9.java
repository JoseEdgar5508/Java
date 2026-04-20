package arrays;
import java.util.Arrays;

public class ex9 {
    public static void main(String[] args) {
        int [] original = {4, 4, 4, 6, 6, 7};

        int [] semRepeticao = new int[original.length];

        int tamanho = 0;

        for(int i = 0; i < original.length; i++){
            boolean repetido = false;

            for(int j = 0; j < tamanho; j++){
                if(original[i] == semRepeticao[j]){
                    repetido = true;
                    break;
                }
            }

            if(!repetido){
                semRepeticao[tamanho] = original[i];
                tamanho++;
            }

        }

        int [] resultado = Arrays.copyOf(semRepeticao, tamanho);

        System.out.println(Arrays.toString(original));
        System.out.println(Arrays.toString(resultado));
    }
}
