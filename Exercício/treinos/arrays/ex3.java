package arrays;

public class ex3 {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 7, 4, 2, 9, 3};

        int maior = numeros[0];

        for(int numero: numeros){
            if(numero > maior){
                maior = numero; 
            }
        }
        System.out.println("O maior número é " + maior);
    }
}
