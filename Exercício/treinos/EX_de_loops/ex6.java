package EX_de_loops;

public class ex6 {
    public static void main(String[] args) {
        int[] numeros = {4, 7, 1, 9, 3};

        int maior = 0;

        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }

        System.out.println("O maior número é " + maior);
    }
}
