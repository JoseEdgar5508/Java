package arrays;
import java.util.Arrays;

public class ex15 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 3, 4, 4};

        int[] auxiliar = new int[numeros.length];
        int contagem = 0;

        for(int i = 0; i < numeros.length; i++){

            boolean repetido = false;

            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] == auxiliar[j]){
                    repetido = true;
                    break;
                }
            }

            if(!repetido){
                auxiliar[contagem] = numeros[i];
                contagem ++;
            }
        }

        int[] semRepetidos = Arrays.copyOf(auxiliar, contagem);

        System.out.println("Arrays com duplicado" + Arrays.toString(numeros));
        System.out.println("Arrays sem duplicados" + Arrays.toString(semRepetidos));
    }
}
