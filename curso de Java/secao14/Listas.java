package secao14;

import java.util.Arrays;

import java.util.ArrayList;

public class Listas {
    public static void main(String[] args) {
        
        // 1- sintaxe
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};

        // {elemento1, elemento2, elementox...}

        System.out.println("Acessando o primeiro elemento " + numeros[0]);

        // tamanho fixo, só que vazio
        String[] frutas = new String[3];

        // 0, 1, 2 => add elementos
        // 3 => não tem

        frutas[0] = "Maça";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";

        System.out.println(frutas[1]);

        double[] precos = {1.99, 2.99, 4.99};

        precos[2] = 5;

        System.out.println(precos[2]);

        // 2- loops em arreys

        // somar todos os elementos de um arrey
        // acessar os elementos e condensar a soma deles em uma variável.

        int soma = 0;

        // length => a quantidade de elementos de um array

        for(int i = 0; i < numeros.length; i++){

            soma += numeros[i];

        }

        System.out.println("A soma dos elementos é igual a: " + soma);

        // for each
        // Nomear o intem => array
        // Pessoas => Pessoa 
        // frutas => fruta
        for(String fruta: frutas){
            System.out.println("A fruta da vez é  " + fruta);
        }

        // encontrar o maior valor de um array
        int[] valores = {10, 25, 8, 22, 1};

        int maiorValor = valores[0];

        int j = 0;
        
        while(j < valores.length){

            if(valores[j] > maiorValor){
                maiorValor = valores[j];
            }

            j++;
        }
        System.out.println("O maior valor é: " + maiorValor);

        // 3- for each
        for(int numero : numeros){
            System.out.println("O número é: " + numero);
        }

        // conectar elementos de um array
        String[] palavras = {"Java", "é", "bom"};

        String frase = "";

        for(String palavra: palavras){
            frase += palavra + " ";
        }

        System.out.println(frase);

        // verifcar se o valor está presente em um array
        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'i';

        for(char letra: letras){

            if(letra == letraProcurada){
                System.out.println("Encontramos a letra: " + letra);
                break;
            }

        }

        // 4- Looops com if

        // filtrar e somar núemros pares

        int somaPares = 0;

        for(int numero : numeros){

            if(numero % 2 == 0){
                somaPares += numero;
            }
        }

        System.out.println("Soma pares " + somaPares);

        // Exibir valores maiores que um determinado valor

        int[] nums = {12, 6, 18, 24, 48, 5};

        int limite = 10;

        for(int i = 0; i < nums.length; i++){

            if(nums[i] > limite){
                System.out.println("Número encontrado: " + nums[i]);
            }
        }

        String[] linguagens = {"Java", "C", "Python", "PHP"};

        String linguagemAlvo = "Python";

        for(String linguagem: linguagens){
            if(linguagemAlvo == linguagem){
                System.out.println("Linguagem encontrada. Parando o Loop!");
                break;
            }else{
                System.out.println("Linguagem não encontrada!");
            }
        }

        // 5- Atualizar valores

        for(int i = 0; i < numeros.length; i++){
            numeros[i] *= 2;
        }
        System.out.println(numeros[1]);

        for(int numero: numeros){
            System.out.println("Numero dobrado: " + numero);
        }

        numeros[5] = 1;

        System.out.println(numeros[5]);

        for(int i = 0; i < frutas.length; i++){
            if(frutas[i].equals("Maça")){
                frutas[i] = "Abacate";
            }
        }

        System.out.println(frutas[0]);

        // 6- metodo toString

        //Classes no Java, que vão ter metodos utilitários, o Arrey é uma delas.

        String dadosNumericos = Arrays.toString(numeros);

        System.out.println(dadosNumericos);
        System.out.println(numeros);

        String dadosFrutas = Arrays.toString(frutas);
        System.out.println(dadosFrutas);

        int[] teste = new int[3];

        System.out.println(Arrays.toString(teste));

        // 7- Adicionamdo novos intens Arreys

        //ex: criando um novo arreys maior e copiando os elementos

        int[] novoArray = new int[numeros.length + 1];

        for(int i = 0; i < numeros.length; i++){
            novoArray[i] = numeros[i];
        }

        System.out.println(Arrays.toString(novoArray));
        
        novoArray[novoArray.length - 1] = 4;

        System.out.println(Arrays.toString(novoArray));

        //ex: Utilizando Arraycopy para copiar os elementos.

        String[] novoFrutas = new String[frutas.length + 1];

        System.arraycopy(frutas, 0, novoFrutas, 0, frutas.length);

        novoFrutas[novoFrutas.length -1] = "Jaca";

        System.out.println(Arrays.toString(novoFrutas));

        //ex3: Usando ArrayList

        ArrayList<String> listaFrutas = new ArrayList<>(Arrays.asList("Maça", "Banana", "Laranja"));

        System.out.println(listaFrutas);

        listaFrutas.add("Manga");

        System.out.println(listaFrutas);

        // 8- reference trap

        int[] arrayOriginal = {1, 2, 3};
        // Programou bastante coisa...
        int[] arrayCopia = arrayOriginal;

        arrayCopia[0] = 10;

        System.out.println(Arrays.toString(arrayCopia));
        System.out.println(Arrays.toString(arrayOriginal));

        // Como evitar?
        int[] arrayClone = arrayOriginal.clone();

        arrayClone[0] = 999;

        System.out.println(Arrays.toString(arrayOriginal));
        System.out.println(Arrays.toString(arrayClone));

        // 9- arrays 2D
        // [[1, 2], [1, 2]]
        // array [0][1]

        int [][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matriz[1][2]);

        // criando array 2D vazio e preenchendo
        int[][] tabela = new int[3][3];

        tabela [0][0] = 10;
        tabela [1][1] = 20;
        tabela [2][2] = 30;

        for(int[] linha : tabela){
            System.out.println(Arrays.toString(linha));
        }

        int [][] grade = new int[4][5];

        for(int m = 0; m < grade.length; m++){
            for(int n = 0; n < grade[m].length; n++){
                grade[m][n] = m * n;
            }
        }

        for(int[] linha : grade){
            System.out.println(Arrays.toString(linha));
        }


    }
}
