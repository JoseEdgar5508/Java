package matriz;

public class ex3 {
    public static void main(String[] args) {
        int[][] matriz = {
            {7, 8},
            {3, 1},
            {9, 6}
        };

        int pares = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                if(matriz[i][j] % 2 == 0){
                    pares ++;
                }
            }
        }

        System.out.println("A quantidade e números pares é: " + pares);
    }
}
