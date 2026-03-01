package secao14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AvançandoArrays {
    public static void main(String[] args) {
        
        // 1- Ordenação

        // Ordenação de Arrays de inteiros
        int[] numbers = {5, 6, 1, 4, 2, 22, 1};

        // Modifica o Array original
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        //Ordenação com comparator
        String[] names = {"João", "Bob", "Pedro", "Marco"};

        Arrays.sort(names, Comparator.reverseOrder());

        System.out.println(Arrays.toString(names));

        //Ordenação de matriz
        int[][] matriz = { 
            {4, 5, 1},
            {3, 8, 9},
            {2, 3, 1}
        };

        // Ordenação de linha, por um valor de coluna
        Arrays.sort(matriz, Comparator.comparingInt(a -> a [1]));

        for(int[] linha: matriz){
            System.out.println(Arrays.toString(linha));
        }
        
        // Imprimir matriz, sem foreach
        System.out.println(Arrays.deepToString(matriz));

        // Manipulação avançada

        // copia
        int[] original = {1, 2, 2, 3};

        int[] copia = Arrays.copyOf(original, 2);

        System.out.println(Arrays.toString(copia));

        // fill - preenchimento
        int[] numeros = new int[5];

        System.out.println(Arrays.toString(numeros));

        Arrays.fill(numeros, 5);

        System.out.println(Arrays.toString(numeros));

        // Transformação de Arrays para stream
        int[] values = {1, 2, 3, 4, 5};

        // Fazer uma soma dos elementos
        int sum = Arrays.stream(values).sum();

        System.out.println(sum);

        // Arrays dinamicos
        ArrayList<String> frutas = new ArrayList<>();

        System.out.println(frutas);

        frutas.add("Maça");
        frutas.add("Banana");

        System.out.println(frutas);

        for(String fruta: frutas){
            System.out.println(fruta);
        }

        frutas.remove("Banana");

        System.out.println(frutas);

        frutas.remove(0);

        System.out.println(frutas);

        frutas.add("Maça");

        String frutaEspecifica = frutas.get(0);

        System.out.println(frutaEspecifica);

        // Não funciona com o indice diretamente
        //System.out.println(frutas[0]);

    }
}
