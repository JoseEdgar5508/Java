package arrays;

public class ex14 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 2, 3, 3, 3, 4};

        int maxFrequente = numeros[0];
        int maxContagem = 0;

        for(int i = 0; i < numeros.length; i ++){

            int contagem = 0;

            for(int j = 0; j < numeros.length; j ++){
                if(numeros[i] == numeros[j]){
                    contagem++;
                }
            }

            if(contagem > maxContagem){
                    maxContagem = contagem;
                    maxFrequente = numeros[i];
                }
            
        }

        System.out.println(maxFrequente);

    }
}
