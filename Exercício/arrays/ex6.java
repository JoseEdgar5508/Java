package arrays;

public class ex6 {
    public static void main(String[] args) {
        int [] numeros = {6, 6, 7, 4, 4, 4, 3};

        int maisFrequente = numeros[1];
        int maxContagem = 0;

        for(int i = 0; i < numeros.length; i++){

            int contagem = 0;

            for(int j = 0; j < numeros.length; j++){
                if(numeros[i] == numeros[j]){
                    contagem ++;
                }
            }

            if(contagem > maxContagem){
                maxContagem = contagem;
                maisFrequente = numeros[i];
            }
        }

        System.out.println(maisFrequente);
    }
}
