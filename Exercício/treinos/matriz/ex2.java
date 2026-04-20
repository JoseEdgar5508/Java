package matriz;

public class ex2 {
    public static void main(String[] args) {
        int[][] matriz = {
            {3, 6, 7},
            {9, 1, 4}
        };

        int somar = 0;

        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                somar += matriz[i][j];
            }
        }

        System.out.println("Soma total: " + somar);
    }
}
