package arrays;

public class ex10 {
    public static void main(String[] args) {
        int [] arrays = {10, 5, 20, 8, 15};

        int maiorNumero = arrays[0];// = 20;
        int segundoMaiorNumero = arrays[0];// = 15;

        for(int i = 0; i < arrays.length; i++){// Da 5 voltas no loop & i = 4;
            if(arrays[i] > maiorNumero){// arrays[i] = 15 & maior numero = 20;
                maiorNumero = arrays[i];// = 20;
            }

            else if(arrays[i] > segundoMaiorNumero && arrays[i] < maiorNumero){// arrays[i] = 15 & segundoMaiorNumero = 8 & maiorNumero = 20;
                segundoMaiorNumero = arrays[i];// = 15;
            }
        }

        System.out.println(maiorNumero);
        System.out.println(segundoMaiorNumero);
    }
}
