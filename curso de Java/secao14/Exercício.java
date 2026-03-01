package secao14;

import java.util.Arrays;
import java.util.ArrayList;

public class Exercício {
    public static void main(String[] args) {
        
        //Exercício 1
        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for(int i = 0; i < arrayOriginal.length; i++){

            arrayInvertido[i] = arrayOriginal[arrayOriginal.length -1 -i];

        }

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayInvertido));

        System.out.println("---------------------------------------------------");

        //Exercício 2
        int[] arrayInteiros = {1, 2, 2, 3, 4, 4, 4, 5};

        int maisFrequente = arrayInteiros[0];

        int maxContagem = 1;

        for(int i = 0; i < arrayInteiros.length; i++){

            int contagem = 0;

            for(int j = 0; j < arrayInteiros.length; j++){
                if(arrayInteiros[j] == arrayInteiros[i]){
                    contagem++;
                }
            }

            if(contagem > maxContagem){
                maxContagem = contagem;
                maisFrequente = arrayInteiros[i];
            }
        }

        System.out.println("O mais frequante é " + maisFrequente);

        System.out.println("---------------------------------------------------");

        //Exercíco 3
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTrasposta = new int[matriz[0].length][matriz.length];
        
        for(int[] linha: matrizTrasposta){
            System.out.println(Arrays.toString(linha));
        }

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matrizTrasposta[j][i] = matriz [i][j];
            }
        }

        for(int[] linha: matrizTrasposta){
            System.out.println(Arrays.toString(linha));
        }

        System.out.println("----------------------------------------------------");

        //Exercício 4
        int[] arrayComNegativos = {1, -2, 3, -4, 5, -6};

        System.out.println(Arrays.toString(arrayComNegativos));

        for(int i = 0; i < arrayComNegativos.length; i++){

            if(arrayComNegativos[i] < 0){
                arrayComNegativos[i] = 0;
            }

        }

        System.out.println(Arrays.toString(arrayComNegativos));

        System.out.println("---------------------------------------------------");

        //Exercício 5
        int[] arrayComDuplicaodos = {1, 2, 2, 2, 3, 4, 4, 5};

        // array numerico sem quantidades de elementos definida.
        ArrayList<Integer> arraySemDuplicados = new ArrayList<>();

        for(int numero: arrayComDuplicaodos){

            if(!arraySemDuplicados.contains(numero)){
                arraySemDuplicados.add(numero);
            }

        }

        System.out.println(Arrays.toString(arrayComDuplicaodos));
        System.out.println(arraySemDuplicados);


    }

}
