package secao11;

public class LoopesB {
    public static void main(String[] args) {
        
        // 8- Loops com rútulos

        // rótulos internos ou externos

        externo: 
        for (int i = 0; i < 3; i++){

            for (int j = 0; j < 3; j++){

                if(i == 1 && j == 1){
                    break externo;
                }

                System.out.println("i" + i + ", j " + j);
            }
        }

        System.out.println("-------------------------------------");

         for (int i = 0; i < 3; i++){

            System.out.println("Externo: " + 1);

            interno:
            for (int j = 0; j < 3; j++){

                if(j == 2){
                    System.out.println("Parou interno.");
                    break interno;
                }

                System.out.println("i" + i + ", j " + j);
            }
        }

        System.out.println("---------------------------------------------");

        // 9- of by one

        // executar 5 vezes

        for(int i = 0; i <= 5; i++){


            System.out.println("I: " + i);
            


        }
    }
}
