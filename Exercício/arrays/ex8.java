package arrays;

import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {

        int[] original = {1, 2, 2, 3, 4, 4};

        int[] auxiliar = new int[original.length];// = original [1, 2, 0, 0, 0, 0,];
        int tamanho = 0; // = 2;

        for (int i = 0; i < original.length; i++) { // i = 2;
            boolean repetido = false; // repetido é igual a não;

            for (int j = 0; j < tamanho; j++) {// tamanho igual a 2 entra no looop; j = 1;
                if (original[i] == auxiliar[j]) {// original = posição 2 no caso 2; auxiliar = posição 1 no caso 2;
                    repetido = true;
                    break;
                }
            }

            if (!repetido) { // entra em rpetido; 
                auxiliar[tamanho] = original[i];// auxiliar[1] no caso 2 == original[1] no caso 0;
                tamanho++; // = 2;
            }
        }

        int[] semDuplicatas = Arrays.copyOf(auxiliar, tamanho);

        System.out.println("Array original: " + Arrays.toString(original));
        System.out.println("Array sem duplicatas: " + Arrays.toString(semDuplicatas));
    }
}
