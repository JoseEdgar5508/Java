package arrays;

public class ex12 {
    public static void main(String[] args) {
        int [] arraysA = {1, 2, 3, 4};

        int [] arraysB = {3, 4, 5, 6};

        System.out.println("Numeros que aparecem nos dois Arrays.");

        for(int i = 0; i < arraysA.length; i++){  // da 4 voltas no loop.
            
            for(int j = 0; j < arraysB.length; j++){ // da 2 voltas no loop para o externo dar 1.
                if(arraysA[i] == arraysB[j]){ // A = 2 ou seja 3 B = 0 ou seja 3
                    System.out.println(arraysA[i]);
                }
            }
        }
    }
}
