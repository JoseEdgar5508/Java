package arrays;

public class ex16 {
    public static void main(String[] args) {
        int[] numeros = {9, 8, 4, 10, 7};

        int maiorNumero = numeros[0];
        int segundoMaiorNumero = numeros[0];

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }

            else if(numeros[i] < maiorNumero && numeros[i] > segundoMaiorNumero){
                segundoMaiorNumero = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maiorNumero);
        System.out.println("O segundo maior número é: " + segundoMaiorNumero);
    }
}
