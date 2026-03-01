package secao11;

public class Loopes {


    public static void main(String[] args) {
        

        // 1- For

        // loop que vai rodar de 1 a 5.

        // Variável de inicialização = i, j, k.
        // condição -> determina até quando ou quantas vezes, o loop vai rodar.
        // incremento -> a variável vai chegar na condição.

        for(int i = 1; i <= 5; i++){
            //repetir
            System.out.println("Contador: " + i);
        }

        System.out.println("---------------------------------------");

        // mostrar cada caractere de uma estring

        String palavra = "Java";

        // lenght em strings da o número de letras.

        // em Arrys e Strings a primeira letra é 0
        // J -> 0, a -> 1....


            for(int i = 0; i < palavra.length(); i++){

                // palavra.charAT(0), palavra.charAT(1)....

                System.out.println("Caractere: " + palavra.charAt(i));

            }

        System.out.println("----------------------------------------------");

        //Contagem regressiva
        for(int i = 5; i > 0; i--){
            System.out.println("Contador: " + i);
        }

        System.out.println("-------------------------------");

        //2- while

        int i = 0;

        while (i <= 5) {

            System.out.println("while contador " + i);

            i++;  
        }

        System.out.println("------------------------------");

        int valor = 0;

        while (valor != 7) {

            // .111 => 1
            valor = (int) (Math.random() *10);

            System.out.println("Valor eleatorio: " + valor);
            
        }

        System.out.println("------------------------------");

        // 3- loop infinito

        //while (true) {
            //System.out.println("Infinito!");
        //}

        // 4- do while

        int j = 10;

        do{

            System.out.println("O valor de j: " + j);

            j--;    
        }while(j > 0);

        // 5- break

        // break pode ser utilizado em qualquar estrutura de loop

        for(int x = 0; x <= 10; x++){

            System.out.println("O valor de x é " + x);

            if(x == 5){
                System.out.println("Parando o loop!");
                break;
            }
        }

        System.out.println("------------------------------------");

        // 6- continue

        for(int x = 10; x > 0; x--){

            if(x % 2 == 0){
                System.out.println("Par!");
                continue;
            }

            System.out.println("Contador: " + x);
        }

        System.out.println("--------------------------------------");

        // 7- Nested loops

        for(int m = 1; m <= 3; m++){
            
            System.out.println("Externo.");

            for(int n = 1; n <= 3; n++){

                System.out.println(m + " x " + n + " = " + (m * n));

            }

        }

        System.out.println("------------------------------------");
        
        // Padrão de estrelas
        for(int o = 1; o <= 10; o++){

              for(int p = 1; p <= o; p++){
                System.out.print("*"); 
              }

              System.out.println();

        }
    }
    


}
