package arrays;

public class ex5 {
    public static void main(String[] args) {
        int[] numeros = { 1, 6, 6, 6, 2, 2, 5 };

        int maisFrequente = numeros[0];
        int maxContagem = 0;

        for (int i = 0; i < numeros.length; i++) {

            int contagem = 0;

            for (int j = 0; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    contagem++;
                }
            }

            if (contagem > maxContagem) {
                maxContagem = contagem;
                maisFrequente = numeros[i];
            }
        }

        System.out.println(maisFrequente);
    }
}
