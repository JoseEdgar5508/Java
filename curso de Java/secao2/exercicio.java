package secao2;

public class exercicio {
    public static void main(String[] args) {

        //Ex 1
        int variavel = 10;
        int variavel2 = variavel * 2;
        
        System.out.println(variavel2);

        //Ex2
        char letra = 'B';

        int valorInt = (int) letra;

        System.out.println(valorInt);

        // Ex3
        double n1 = 15.75;
        double n2 = 20.40;

        double soma = n1 + n2;
        System.out.println(soma);

        // Ex4

        long n3 = 2_000_000_000;

        int n4 = (int) n3;

        System.out.println(n4);

        // Ex5
        String ola_mundo = "Olá munod!";
        String Bem_vindo = " Bem vindo ao Java.";

        String palavra = ola_mundo + Bem_vindo;

        System.out.println(palavra);

    }

}
