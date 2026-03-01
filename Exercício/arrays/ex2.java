package arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4};

        int soma = 0;

        for(int numero: numeros){
            soma += numero; 
        }

        System.out.println(soma);
    }
}
